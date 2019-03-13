/**
 * copyright © 2018 Techpert It Solutions Private Limited
 */
package com.infogain.springbootcrudrest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;

/**
 * Techpert:Bahikhata : 0.0.1 :This class is used
 * 
 * @author Rudhra Koul
 *
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

	/**
	 * 
	 */
	public SwaggerConfig() {
		// TODO Auto-generated constructor stub
	}

	@Bean
	public Docket customersApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors
						.basePackage("com.infogain.springbootcrudrest.controller")).paths(regex("/api/v1.*"))
				.build();
	}
}
