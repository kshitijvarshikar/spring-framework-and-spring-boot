package com.example.Lecture21_InterceptorDemo.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import java.io.IOException;

@Component
public class AuthenticationInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws IOException {

        System.out.println("Authentication Interceptor Called");

        String apiKey = request.getHeader("x-api-key");

        System.out.println("API Key: " + apiKey);

        if (!"secret123".equals(apiKey)) {

            System.out.println("Authentication Failed");

            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            response.getWriter().write("Invalid or missing API Key");

            return false;
        }

        System.out.println("Authentication Successful");

        return true;
    }
}