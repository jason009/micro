package com.micro.web.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MicroWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] { MicroAppConfig.class };
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] { MicroWebConfig.class };
    }

    protected String[] getServletMappings() {
        return new String[] { "/*" };
    }
}
