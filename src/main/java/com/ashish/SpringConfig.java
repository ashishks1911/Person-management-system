 package com.ashish;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan( basePackages = "com.ashish")
public class SpringConfig 
{
	@Bean
	public DataSource getDataSource()
	{
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost/springmvc");
		ds.setUsername("root");
		ds.setPassword("12345");
		return ds;
	}
	@Bean
	public LocalSessionFactoryBean sessionFactory()
	{
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(getDataSource());
		sessionFactory.setPackagesToScan("com.ashish.models");
		sessionFactory.setHibernateProperties(hibernateProperties());
		return sessionFactory;
	}
	
	@Bean
	public ViewResolver abc()
	{
		InternalResourceViewResolver res = new InternalResourceViewResolver("/pages/",".jsp");
		return res;
	}
	private Properties hibernateProperties()
	{
		Properties properties = new Properties();
		properties.put("hibernate.dialect","org.hibernate.dialect.MySQL5Dialect");
		properties.put("hibernate.show_sql","true");
		properties.put("hibernate.hbm2ddl.auto","update");
		return properties;
	}
}
