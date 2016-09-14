package com.cultuzz.accounting.appconfig;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.io.ClassPathResource;

@Import({PersistenceConfig.class})
@Configuration
@ComponentScan({"com.cultuzz.accounting"})
public class SpringRootConfig {
	
	@Bean
    public PropertyPlaceholderConfigurer getPropertyPlaceholderConfigurer()
    {
				
        PropertyPlaceholderConfigurer ppc = new PropertyPlaceholderConfigurer();
        ppc.setLocation(new ClassPathResource("application.properties"));
        ppc.setIgnoreUnresolvablePlaceholders(true);
        return ppc;
    }
}
