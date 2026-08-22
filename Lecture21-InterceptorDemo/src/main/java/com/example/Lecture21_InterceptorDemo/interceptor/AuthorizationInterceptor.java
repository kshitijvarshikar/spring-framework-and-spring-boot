package com.example.Lecture21_InterceptorDemo.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import java.io.IOException;

@Component
public class AuthorizationInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws IOException {

        System.out.println("Authorization Interceptor Called");

        String userRole = request.getHeader("x-user-role");

        System.out.println("User Role: " + userRole);

        if (!"ADMIN".equals(userRole)) {

            System.out.println("Authorization Failed");

            response.setStatus(HttpServletResponse.SC_FORBIDDEN);
            response.setContentType("application/json");

            response.getWriter().write(
                    "{\n" +
                            "    \"message\": \"You are not authorized to perform this action\"\n" +
                            "}"
            );

            return false;
        }

        System.out.println("Authorization Successful");

        return true;
    }
}