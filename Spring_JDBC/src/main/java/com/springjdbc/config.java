package com.springjdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class config {

	@Bean
	public DataSource getDataSource() { 
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/becoder"); 
		dataSource.setUsername("root");
		dataSource.setPassword("7489");
		return dataSource;
	}
	
	@Bean()
	public JdbcTemplate getJdbcTemplate() { 
		JdbcTemplate jdbctem = new JdbcTemplate(); 
		jdbctem.setDataSource(getDataSource());
		return jdbctem;
	}
}
