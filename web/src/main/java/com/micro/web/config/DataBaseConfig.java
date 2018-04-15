package com.micro.web.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;
@Configuration
public class DataBaseConfig {
    @Bean
    public DataSource dataSource() {
        DataSource dataSource = new DruidDataSource();

        return dataSource;
    }
}
