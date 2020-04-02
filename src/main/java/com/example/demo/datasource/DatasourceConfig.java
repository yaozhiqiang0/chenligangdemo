package com.example.demo.datasource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/*@Configuration*/
public class DatasourceConfig {

    @Bean("primaryDataSource")
    @Qualifier("primaryDataSource")
    @ConfigurationProperties(prefix="spring.datasource.primary")
    public DataSource primaryDataSource(){
        return DataSourceBuilder.create().build();
    }

    @Bean("secoundaryDataSource")
    @Qualifier("secoundaryDataSource")
    @ConfigurationProperties(prefix ="spring.datasource.secoundary")
    public DataSource SecoundDataSource(){
        return DataSourceBuilder.create().build();
    }

    @Bean("primaryJdbcTemplate")
    public JdbcTemplate primaryJdbcTemplate(@Qualifier("primaryDataSource")DataSource dataSource ){
        return new JdbcTemplate(dataSource);
    }

    @Bean("secoundaryJdbcTemplate")
    public JdbcTemplate secoundJdbcTemplate(@Qualifier("secoundaryDataSource")DataSource dataSource ){
        return new JdbcTemplate(dataSource);
    }
}
