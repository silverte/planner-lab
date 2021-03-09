package com.skt.swing.mcatalog.common.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class AppConfig {

	//기본
	@Value("${spring.application.name}")
	private String appName;

	@Value("${spring.application.base-package}")
	private String basePackage;

	@Value("${spring.profiles.active}")
	private String active;

	public boolean isLocal() {
		return ConfigProfiles.LOCAL.equals(this.active);
	}

	public boolean isDevelopment() {
		return ConfigProfiles.DEVELOPMEMT.equals(this.active);
	}

	public boolean isStaging() {
		return ConfigProfiles.STAGING.equals(this.active);
	}

	public boolean isProduction() {
		return ConfigProfiles.PRODUCTION.equals(this.active);
	}

	//swagger 사용

	@Value("${swagger-info.api-version:}")
	private String apiVersion;

	@Value("${swagger-info.title:}")
	private String title;

	@Value("${swagger-info.description:}")
	private String description;

	@Value("${swagger-info.terms-service-url:}")
	private String termsServiceUrl;

	@Value("${swagger-info.license:}")
	private String license;

	@Value("${swagger-info.license-url:}")
	private String licenseUrl;

	@Value("${swagger-info.contact.name:}")
	private String contactName;

	@Value("${swagger-info.contact.url:}")
	private String contactUrl;

	@Value("${swagger-info.contact.email:}")
	private String contactEmail;
}
