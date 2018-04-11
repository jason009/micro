package com.micro.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan({"com.micro"})
@PropertySource(value = {"classpath:jdbc.properties"})
public class MicroAppConfig {
}
