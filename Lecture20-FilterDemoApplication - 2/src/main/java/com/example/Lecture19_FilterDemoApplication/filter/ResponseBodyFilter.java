package com.example.Lecture19_FilterDemoApplication.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.util.ContentCachingResponseWrapper;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

//@Component
public class ResponseBodyFilter implements Filter {

    @Override
    public void doFilter(
            ServletRequest request,
            ServletResponse response,
            FilterChain chain
    ) throws IOException, ServletException {

        HttpServletResponse httpServletResponse =
                (HttpServletResponse) response;

        ContentCachingResponseWrapper wrappedResponse =
                new ContentCachingResponseWrapper(httpServletResponse);

        chain.doFilter(request, wrappedResponse);

        byte[] originalBodyBytes =
                wrappedResponse.getContentAsByteArray();

        String originalBody =
                new String(originalBodyBytes, StandardCharsets.UTF_8);

        String modifiedBody =
                """
                        {
                            "originalResponse": %s,
                            "appName": "Student Management System"
                        }
                        """.formatted(originalBody);

        wrappedResponse.resetBuffer();
        wrappedResponse.getWriter().write(modifiedBody);
        wrappedResponse.copyBodyToResponse();
    }
}