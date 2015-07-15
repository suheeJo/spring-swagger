package com.suhee.swagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableWebMvc
@EnableSwagger2
@ComponentScan(basePackages="com.suhee.swagger")
public class MvcConfig{

	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
	@Bean
    public Docket swaggerSpringMvcPlugin() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo());
    }
	
	private ApiInfo apiInfo() {
		ApiInfo apiInfo = new ApiInfo(
				"My Apps API Title", "My Apps API Description", "1.0",
				"My Apps API terms of service", "My Apps API Contact Email",
				"My Apps API Licence Type", "My Apps API License URL");
		return apiInfo;
	}
}
