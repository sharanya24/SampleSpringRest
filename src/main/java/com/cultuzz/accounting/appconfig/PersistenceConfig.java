package com.cultuzz.accounting.appconfig;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;
import org.springframework.orm.hibernate3.HibernateTransactionManager;
import org.springframework.orm.hibernate3.annotation.AnnotationSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.mchange.v2.c3p0.DriverManagerDataSource;


@Configuration
@EnableTransactionManagement
@ComponentScan({ "com.cultuzz.accounting" })
//@PropertySource({"classpath:application.properties"})
public class PersistenceConfig {
	
//	@Value("${jdbc.driverClassName}")     private String driverClassName;
//    @Value("${jdbc.url}")                 private String url;
//    @Value("${jdbc.username}")             private String username;
//    @Value("${jdbc.password}")             private String password;
    
    @Value("${hibernate.dialect}")         private String hibernateDialect;
    @Value("${hibernate.show_sql}")     private String hibernateShowSql;
    
//    @Autowired
//    Environment environment;
    
    
	 
	   @Bean
	   public AnnotationSessionFactoryBean sessionFactory() {
	      AnnotationSessionFactoryBean sessionFactory = new AnnotationSessionFactoryBean();
	      sessionFactory.setDataSource(getDataSource());
	      sessionFactory.setPackagesToScan(new String[] { "com.cultuzz.accounting.hbm.accounting" });
	      sessionFactory.setHibernateProperties(getHibernateProperties());
	      return sessionFactory;
	   }

	   @Bean
	   public DataSource getDataSource()
	    {
	        
	        
//	        ds.setDriverClass(driverClassName);
//	        ds.setJdbcUrl(url);
//	        ds.setUser(username);
//	        ds.setPassword(password);        
//	        return ds;
		   
		   //System.out.println("driver name "+environment.getProperty("jdbc.driverClassName"));
		   
		   final JndiDataSourceLookup dsLookup = new JndiDataSourceLookup();
	        dsLookup.setResourceRef(true);
	        DataSource dataSource = dsLookup.getDataSource("java:jboss/datasources/AccountingDataSource");
	        return dataSource;
		   
	    }
	   @Bean
	   public HibernateTransactionManager transactionManager() {
	      HibernateTransactionManager txManager = new HibernateTransactionManager();
	      txManager.setSessionFactory(sessionFactory().getObject());

	      return txManager;
	   }

	   @Bean
	   public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
	      return new PersistenceExceptionTranslationPostProcessor();
	   }

	   @Bean
	    public Properties getHibernateProperties()
	    {
	        Properties properties = new Properties();
	        properties.put("hibernate.dialect", hibernateDialect);
	        properties.put("hibernate.show_sql", hibernateShowSql);
	        
	        return properties;
	    }
}
