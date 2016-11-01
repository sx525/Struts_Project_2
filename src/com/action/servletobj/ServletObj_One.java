package com.action.servletobj;

import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.PageContext;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class ServletObj_One extends ActionSupport {

	public String execute() throws Exception {
		/**
		 * 调用ServletActionContext对象的静态方法。
		 */

		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");

		HttpSession session = request.getSession();

		PrintWriter out = response.getWriter();

		PageContext pageContext = ServletActionContext.getPageContext();

		ServletContext servletContext = ServletActionContext
				.getServletContext();

		out.println("Servlet中的对象使用<br/><br/>");
		out.println("Request对象 = " + request.getContextPath() + "<br/><br/>");
		out.println("Session对象 = " + session.getId() + "<br/><br/>");

		out.println("servletContext对象 = "
				+ servletContext.getRealPath("/index.jsp") + "<br/><br/>");
		return NONE;
	}
}
