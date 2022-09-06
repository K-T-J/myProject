package com.study.myProject.swagger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;

import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {

	//localhost:8080/swagger.ui/index.html
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.OAS_30)
				.useDefaultResponseMessages(false) //기본으로 세팅되는 200, 401, 403, 404 aptlwl vytl
				.select()
				.apis(RequestHandlerSelectors.any())//모든 controller들이 있는 패키지를 탐색해서 aPI문서를 만든다.
				.paths(PathSelectors.any())
				.build()
				.apiInfo(apiInfo());
				
	}
	
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("[MyProject] API")
				.description("[MyProject] API")
				.version("1.0")
				.build();
	}
	
}
