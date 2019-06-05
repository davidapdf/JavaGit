package com.example.gitLab.config;
import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
	public Docket eventoApi() {
		return new Docket(DocumentationType.SWAGGER_2) //.groupName("api")
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.example.gitLab"))
				.paths(regex("/api.*"))
				.build()
				.apiInfo(metaInfo());
	}

	
	private Predicate<String> regex(String string) {
		return Predicates.and(
				PathSelectors.regex("/api.*"),
				Predicates.not(PathSelectors.regex("/error.*")));
	}


	private ApiInfo metaInfo() {
		ApiInfo apiInfo = new ApiInfo(
				"Eventos API REST",
				"API Rest de cadastro de eventos",
				"1.0",
				"Terms of Service",
				new Contact("David Alexandre de Paula Dias Filho", "https://www.linkedin.com/in/david-alexandre-de-paula-dias-filho-54a96291",
						"david.paula.dias@everis.com"),
				"Apache License Version 2.0",
				"https://www.apache.org/licenses/LICENSE-2.0.html", new ArrayList<VendorExtension>()
				);
		return apiInfo;
	}
}
