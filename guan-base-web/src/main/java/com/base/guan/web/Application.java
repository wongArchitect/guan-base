package com.base.guan.web;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Application
 * 启动类
 *
 * @author lishudong
 * @version 1.0
 * @date 2019/7/9
 */
@EnableCaching
@SpringBootApplication
@ComponentScan(basePackages={"com.base.guan.web.*"})
@EnableScheduling
@EnableAsync
public class Application extends SpringBootServletInitializer {

    /**
     * Application
     */
    public Application() {
        super();
        setRegisterErrorPageFilter(false);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        application.bannerMode(Banner.Mode.OFF);
        return application.sources(Application.class);
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    /**
     * 启动方法
     *
     * @param args args
     */
    public static void main(String[] args) {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(Application.class);
        builder.bannerMode(Banner.Mode.OFF);
        builder.run(args);
        System.out.println("启动主程序成功" );
    }
}
