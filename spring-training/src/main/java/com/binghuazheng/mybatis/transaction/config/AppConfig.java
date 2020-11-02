package com.binghuazheng.mybatis.transaction.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.io.IOException;


/**
 * @ClassName AppConfig
 * @Description TODO
 * @Author Administrator
 * @Date 2020/11/2 21:31
 * @Version 1.0
 */
@Configuration
@EnableTransactionManagement
@PropertySource("classpath:/application.properties")
@MapperScan("com.binghuazheng.mybatis.transaction.mapper")
@ComponentScan("com.binghuazheng.mybatis.transaction.service")
public class AppConfig {

	@Value("${mysql.url}")
	private String url;

	@Value("${mysql.driver}")
	private String driver;

	@Value("${mysql.username}")
	private String username;

	@Value("${mysql.password}")
	private String password;

	/**
	 * 数据源
	 *
	 * @return DataSource
	 */
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl(url);
		dataSource.setDriverClassName(driver);
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		return dataSource;
	}

	/**
	 * SqlSessionFactoryBean
	 *
	 * @return SqlSessionFactoryBean
	 */
	@Bean
	public SqlSessionFactoryBean sqlSessionFactoryBean() throws IOException {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource());
		PathMatchingResourcePatternResolver patternResolver = new PathMatchingResourcePatternResolver();
		Resource[] xmlResources = patternResolver.getResources("classpath*:/mapper/*.xml");
		sqlSessionFactoryBean.setMapperLocations(xmlResources);
		return sqlSessionFactoryBean;
	}

	/**
	 * PlatformTransactionManager
	 *
	 * @return PlatformTransactionManager
	 */
	@Bean
	public PlatformTransactionManager transactionManager() {
		return new DataSourceTransactionManager(dataSource());
	}






}
