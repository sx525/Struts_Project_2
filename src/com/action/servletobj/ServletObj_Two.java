package com.action.servletobj;

import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;

public class ServletObj_Two extends ActionSupport implements
		ServletRequestAware, ServletResponseAware, ServletContextAware {

	private HttpServletRequest request;
	private HttpServletResponse response;
	private HttpSession session;
	private ServletContext servletContext;

	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
		if (this.request != null) {
			this.session = this.request.getSession();
		}
	}

	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}

	public void setServletContext(ServletContext servletContext) {
		this.servletContext = servletContext;

	}

	public String execute() throws Exception {

		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		out.println("Servlet中的对象使用<br/><br/>");
		out.println("Request对象 = " + request.getContextPath() + "<br/><br/>");
		out.println("Session对象 = " + session.getId() + "<br/><br/>");

		out.println("servletContext对象 = "
				+ servletContext.getRealPath("/index.jsp") + "<br/><br/>");
		return NONE;
	}

}
