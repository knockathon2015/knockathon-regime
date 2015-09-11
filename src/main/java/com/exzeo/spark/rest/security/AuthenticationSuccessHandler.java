package com.exzeo.spark.rest.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;

public class AuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {
	
	@Override
	public void onAuthenticationSuccess(final HttpServletRequest request,
            final HttpServletResponse response, final Authentication authentication)
            throws ServletException, IOException {
		response.setStatus(HttpServletResponse.SC_OK);
		
	}	
}