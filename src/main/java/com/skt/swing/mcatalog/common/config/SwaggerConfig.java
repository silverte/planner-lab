package com.skt.swing.mcatalog.common.config;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import lombok.extern.slf4j.Slf4j;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
@Slf4j
@Profile({ConfigProfiles.LOCAL, ConfigProfiles.DEVELOPMEMT, ConfigProfiles.STAGING})
public class SwaggerConfig {

	@Autowired
	private AppConfig appConfig;

	@Bean
	public Docket apiDocket() {
		log.debug("SwaggerConfig apiDocket start ... {}", appConfig.getActive());
		return new Docket(DocumentationType.SWAGGER_2)
				.consumes(getConsumeContentTypes())
				.produces(getProduceContentTypes())
				.apiInfo(getApiInfo())
	            .select()
//	            .apis(RequestHandlerSelectors.any())
	            .apis(RequestHandlerSelectors.basePackage(appConfig.getBasePackage()))
	            .paths(PathSelectors.any())
//	            .paths(PathSelectors.ant("/v2/**"))
	            .build();
	}

    private Set<String> getConsumeContentTypes() {
        Set<String> consumes = new HashSet<>();
        consumes.add("application/json;charset=UTF-8");
        consumes.add("application/x-www-form-urlencoded");
        return consumes;
    }

    private Set<String> getProduceContentTypes() {
        Set<String> produces = new HashSet<>();
        produces.add("application/json;charset=UTF-8");
        return produces;
	}
	
	private ApiInfo getApiInfo() {
		log.debug("SwaggerConfig getApiInfo start ... {}", appConfig.getActive());
	    return new ApiInfo(
	    		appConfig.getTitle() + " / " + appConfig.getActive(), 			// TITLE
	    		appConfig.getDescription(), 	// DESCRIPTION
	    		appConfig.getApiVersion(), 		// VERSION
	    		appConfig.getTermsServiceUrl(), // TERMS OF SERVICE URL
	            new Contact(appConfig.getContactName(),appConfig.getContactUrl(),appConfig.getContactEmail()), // "NAME","URL","EMAIL"
	            appConfig.getLicense(), 		// LICENSE
	            appConfig.getLicenseUrl(), 		// LICENSE URL
	            Collections.emptyList()
	    );
	}
	
}
