package com.gmail.klewzow.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import org.thymeleaf.templatemode.TemplateMode;

@Configuration
@ComponentScan("com.gmail.klewzow")
public class SpringConfiguration {

    private ApplicationContext applicationContext;
    private WebMvcConfig webMvcConfig;

    @Autowired
    public SpringConfiguration(ApplicationContext applicationContext, WebMvcConfig webMvcConfig) {
        this.applicationContext = applicationContext;
        this.webMvcConfig = webMvcConfig ;
        this.webMvcConfig.setApplicationContext(applicationContext);
    }

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }
}
