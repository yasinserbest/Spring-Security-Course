package com.example.securitydemo;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;

@Component
public class CustomAccessDeniedHandler implements AccessDeniedHandler {

    @Override
    public void handle(jakarta.servlet.http.HttpServletRequest request, 
                      jakarta.servlet.http.HttpServletResponse response, 
                      AccessDeniedException accessDeniedException) throws java.io.IOException, 
                                                                         jakarta.servlet.ServletException {
        // Set the response status to 403 Forbidden
        response.setStatus(HttpServletResponse.SC_FORBIDDEN);
        
        // Optionally, send a custom error message
        response.getWriter().write("Access Denied: You do not have permission to access this resource.");
    }
}



