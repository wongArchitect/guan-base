package com.base.guan.web.configure;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.ErrorPageRegistrar;
import org.springframework.boot.web.server.ErrorPageRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.web.context.request.RequestContextListener;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Web全局配置
 *
 * @author lishudong
 * @version 1.0
 * @date 2019/11/11
 */
@Configuration
public class MyWebMvcConfigurer implements WebMvcConfigurer, ErrorPageRegistrar {

    /**
     * 处理静态页面
     *
     * @param registry registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/templates/**").addResourceLocations("classpath:/templates/");
    }

    /**
     * 处理错误页面
     *
     * @param registry registry
     */
    @Override
    public void registerErrorPages(ErrorPageRegistry registry) {
        ErrorPage[] errorPages = new ErrorPage[3];
        errorPages[0] = new ErrorPage(HttpStatus.UNAUTHORIZED, "/static/error/401.html");
        errorPages[1] = new ErrorPage(HttpStatus.NOT_FOUND, "/static/error/404.html");
        errorPages[2] = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/static/error/500.html");
        registry.addErrorPages(errorPages);
    }

    /**
     * 加载Request上下文监听器
     *
     * @return RequestContextListener
     */
    @Bean
    public RequestContextListener requestContextListener() {
        return new RequestContextListener();
    }
}