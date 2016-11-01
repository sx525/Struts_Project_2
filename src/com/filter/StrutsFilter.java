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
		 * ˼·����������ĵ�ַ������Ҫ��Ҫ����Struts�Ĺ�������
		 * 
		 * �������ĵ�ַ�а���/servlet/�����������˵������Servlet.
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
