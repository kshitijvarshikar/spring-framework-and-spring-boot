package com.example.Lecture19_FilterDemoApplication.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class DummyFilter implements Filter {

    @Override
    public void doFilter(
            ServletRequest request,
            ServletResponse response,
            FilterChain chain
    ) throws IOException, ServletException {

        HttpServletRequest httpServletRequest =
                (HttpServletRequest) request;

        String uri = httpServletRequest.getRequestURI();

        if (!uri.startsWith("/api/")) {
            chain.doFilter(request, response);
        }

        System.out.println("Dummy filter called");
        chain.doFilter(request, response);
    }
}
