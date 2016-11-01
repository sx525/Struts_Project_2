package com.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter;

public class StrutsFilter extends StrutsPrepareAndExecuteFilter {

	@Override
	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		/**
		 * 思路：根据请求的地址来决定要不要调用Struts的过滤器。
		 * 
		 * 如果请求的地址中包含/servlet/。如果包含，说明请求到Servlet.
		 */
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;
		String requestURI = request.getRequestURI();

		System.out.println(requestURI);
		if (requestURI.indexOf("/servlet/") != -1) {
			chain.doFilter(request, response);
		} else {
			super.doFilter(request, response, chain);
		}
	}
}
