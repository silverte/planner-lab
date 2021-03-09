package com.skt.swing.mcatalog.context.planner.infra.spring;

import com.skt.swing.mcatalog.context.planner.domain.application_port.PlannerServicePort;
import com.skt.swing.mcatalog.context.planner.domain.core.service.PlannerService;
import com.skt.swing.mcatalog.context.planner.domain.infra_port.PlannerPersistentPort;
import com.skt.swing.mcatalog.context.planner.infra.persistent.PlannerOracleRepository;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    
	// @Bean
    // public ConfigurableServletWebServerFactory webServerFactory(final TomcatGracefulShutdown gracefulShutdown) {
    //     TomcatServletWebServerFactory factory = new TomcatServletWebServerFactory();
    //     factory.addConnectorCustomizers(gracefulShutdown);
    //     return factory;
    // }

    @Bean
    PlannerServicePort plannerServicePort(PlannerPersistentPort plannerPersistentPort) {
        return new PlannerService(plannerPersistentPort);
    }

    @Bean
    PlannerPersistentPort plannerPersistentPort() {
        return new PlannerOracleRepository();
    }
}