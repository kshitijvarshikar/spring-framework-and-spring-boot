package com.example.Lecture19_FilterDemoApplication.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.UUID;

//@Component
public class AuthenticationFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request,
                         ServletResponse response,
                         FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest httpServletRequest =
                (HttpServletRequest) request;

        HttpServletResponse httpServletResponse =
                (HttpServletResponse) response;

        String token = httpServletRequest.getHeader("token");

        if (token == null || !token.equals("12345")) {
            httpServletResponse.setStatus(httpServletResponse.SC_UNAUTHORIZED);
            httpServletResponse.setContentType("application/json");
            httpServletResponse.getWriter().write("""
                    {
                        "message": "Authentication is Required"
                    }
                    """);
            return;
        }

        chain.doFilter(request, response);

    }
}
