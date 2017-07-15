package com.theaudiochef.web.repository;
//package com.theaudiochef.web.repository;
//
//import java.util.Properties;
//
//import javax.persistence.EntityManagerFactory;
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.orm.jpa.vendor.HibernateJpaDialect;
//import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;
//import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//@Configuration
//@EnableTransactionManagement
//@EnableJpaRepositories(entityManagerFactoryRef = "entityManagerFactory", transactionManagerRef = "transactionManager", basePackages = {
//		"com.theaudiochef.web.repository"})
//public class TestRepositoryConfig {
//	
//	@Bean
//	public DataSource dataSource(){
//		DriverManagerDataSource dataSource = new DriverManagerDataSource();
//		
//		dataSource.setDriverClassName("org.h2.Driver");
//		dataSource.setUrl("jdbc:h2:mem:audiochef;DB_CLOSE_DELAY=-1");
//		dataSource.setUsername("sa");
//		dataSource.setPassword("");
//		
//		return dataSource;
//	}
//	
//	@Primary
//	@Bean(name = "entityManagerFactory")
//	public LocalContainerEntityManagerFactoryBean entityManagerFactory(@Qualifier("dataSource") DataSource dataSource){
//		LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
//		entityManagerFactoryBean.setDataSource(dataSource);
//		entityManagerFactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
//		entityManagerFactoryBean.setJpaDialect(new HibernateJpaDialect());
//		entityManagerFactoryBean.setPersistenceUnitName("TestPersistenceUnit");
//		entityManagerFactoryBean.setPackagesToScan("com.theaudiochef.web");
//		entityManagerFactoryBean.setJpaProperties(additionalProperties());
//		
//		return entityManagerFactoryBean;
//	}
//	
//	private Properties additionalProperties(){
//		Properties jpaProperties = new Properties();
//		jpaProperties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
//		jpaProperties.put("hibernate.show_sql", "true");
//		jpaProperties.put("hibernate.format_sql", "true");
//		jpaProperties.put("hibernate.hdm2ddl.auto", "create");
//		jpaProperties.put("hibernate.default_schema", "public");
//		jpaProperties.put("hibernate.ejb.naming_strategy", "org.hibernate.cfg.ImprovedNamingStrategy");
//		
//		return jpaProperties;
//	}
//	
//	@Primary
//	@Bean(name = "transactionManager")
//	public PlatformTransactionManager localTransactionManager(@Qualifier("entityManagerFactory") EntityManagerFactory entityManagerFactory){
//		return new JpaTransactionManager(entityManagerFactory);
//	}
//	
//	@Primary
//	@Bean
//	public HibernateJpaSessionFactoryBean sessionFactory(){
//		return new HibernateJpaSessionFactoryBean();
//	}
//
//}
