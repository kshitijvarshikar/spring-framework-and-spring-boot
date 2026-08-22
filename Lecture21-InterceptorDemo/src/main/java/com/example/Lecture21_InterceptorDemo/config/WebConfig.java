package com.example.Lecture21_InterceptorDemo.config;

import com.example.Lecture21_InterceptorDemo.interceptor.AuthenticationInterceptor;
import com.example.Lecture21_InterceptorDemo.interceptor.AuthorizationInterceptor;
import com.example.Lecture21_InterceptorDemo.interceptor.LoggingInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    private final LoggingInterceptor loggingInterceptor;
    private final AuthenticationInterceptor authenticationInterceptor;
    private final AuthorizationInterceptor authorizationInterceptor;

    public WebConfig(LoggingInterceptor loggingInterceptor,
                     AuthenticationInterceptor authenticationInterceptor,
                     AuthorizationInterceptor authorizationInterceptor) {

        this.loggingInterceptor = loggingInterceptor;
        this.authenticationInterceptor = authenticationInterceptor;
        this.authorizationInterceptor = authorizationInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(loggingInterceptor)
                .addPathPatterns("/api/**")
                .order(1);

        registry.addInterceptor(authenticationInterceptor)
                .addPathPatterns("/api/**")
                .excludePathPatterns(
                        "/api/auth/login",
                        "/api/public/**"
                )
                .order(2);

        registry.addInterceptor(authorizationInterceptor)
                .addPathPatterns("/api/**")
                .order(3);
    }
}