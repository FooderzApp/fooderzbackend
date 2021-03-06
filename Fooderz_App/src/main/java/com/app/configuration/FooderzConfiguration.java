package com.app.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class FooderzConfiguration {

	@Bean
	public Docket fooderzAPI() {
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("com.app"))
				.build();
	}

//	private ApiInfo metaData() {
//		ApiInfo apiInfo = new ApiInfo("Spring Boot REST API", "Spring Boot REST API for FOODERZ app", "1.0",
//				"Terms of service",
//				new Contact("John Thompson", "https://springframework.guru/about/", "john@springfrmework.guru"),
//				"Apache License Version 2.0", "https://www.apache.org/licenses/LICENSE-2.0");
//		return apiInfo;
//	}
}
