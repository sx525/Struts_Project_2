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
		 * ����ServletActionContext����ľ�̬������
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

		out.println("Servlet�еĶ���ʹ��<br/><br/>");
		out.println("Request���� = " + request.getContextPath() + "<br/><br/>");
		out.println("Session���� = " + session.getId() + "<br/><br/>");

		out.println("servletContext���� = "
				+ servletContext.getRealPath("/index.jsp") + "<br/><br/>");
		return NONE;
	}
}
