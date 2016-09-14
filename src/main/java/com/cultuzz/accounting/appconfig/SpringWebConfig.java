package com.cultuzz.accounting.appconfig;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@EnableWebMvc
@EnableAspectJAutoProxy
@Configuration
@ComponentScan({"com.cultuzz.accounting.ws.rs.controller"})
public class SpringWebConfig extends WebMvcConfigurerAdapter{
	
	
	@Override
	public void configureMessageConverters(
			List<HttpMessageConverter<?>> converters) {
		// TODO Auto-generated method stub
		
		converters.add(xmlConverter());
		converters.add(jsonConverter());
	}
	
	
	@Bean
	MappingJackson2HttpMessageConverter jsonConverter(){
		MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
		return converter;
	}
	
	@Bean
	Jaxb2RootElementHttpMessageConverter xmlConverter(){
		Jaxb2RootElementHttpMessageConverter converter = new Jaxb2RootElementHttpMessageConverter();
		return converter;
	}
}
