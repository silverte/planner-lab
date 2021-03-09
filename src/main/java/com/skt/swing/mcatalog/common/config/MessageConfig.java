package com.skt.swing.mcatalog.common.config;

import com.skt.swing.mcatalog.common.utils.MessageUtil;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;


@Configuration
public class MessageConfig {

	@Value("${spring.messages.basename}")
	private String messagesBasename = null;

	@Value("${spring.messages.encoding}")
	private String messagesEncoding = null;

	@Value("${spring.messages.cache-duration}")
	private int messagesCacheSeconds;

	@Bean("messageSource")
	public MessageSource getMessageSource() {
		String[] i18n = messagesBasename.split(",");

	    ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
	    messageSource.setBasenames(i18n[0], i18n[1]);
		messageSource.setDefaultEncoding(messagesEncoding);
		messageSource.setCacheSeconds(messagesCacheSeconds); //reload messages every 10 seconds

	    return messageSource;
	}

	@Bean
	public MessageSourceAccessor getMessageSourceAccessor() {
		MessageSourceAccessor messageSourceAccessor = new MessageSourceAccessor(getMessageSource());

		MessageUtil.setMessageSourceAccessor(messageSourceAccessor);

	    return messageSourceAccessor;
	}
}
