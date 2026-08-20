package com.example.Lecture19_FilterDemoApplication.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.UUID;

@Component
@Order(2)
public class LoggingFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request,
                         ServletResponse response,
                         FilterChain chain)
            throws IOException, ServletException {

        long startTime = System.currentTimeMillis();

        HttpServletRequest httpRequest =
                (HttpServletRequest) request;

        HttpServletResponse httpResponse =
                (HttpServletResponse) response;

        // Generate Unique Req Id
        String requestId = UUID.randomUUID().toString();
        httpResponse.setHeader("X-Request-ID", requestId);

        // Request Log
        System.out.println("Incoming Request: "
                + httpRequest.getMethod() + " "
                + httpRequest.getRequestURI());

        try {
            chain.doFilter(request, response);
        }
        finally {
            long duration = System.currentTimeMillis() - startTime;

            // Response Status Log
            System.out.println("Response Status: "
                    + httpResponse.getStatus());

            System.out.println("Response Time: " + duration);
        }





/*
        // entering
        System.out.println("Request entered in Logging Filter");

        chain.doFilter(request, response);

        // leaving
        System.out.println("Request exiting in Logging Filter");
*/
    }
}
