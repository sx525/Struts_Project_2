package com.action.method;

import com.opensymphony.xwork2.ActionSupport;

public class ActionMethod_Three extends ActionSupport {

	public String list() throws Exception {
		System.out.println("调用查询的方法");
		return NONE;
	}

	public String add() throws Exception {
		System.out.println("调用添加的方法");
		return NONE;
	}

	public String edit() throws Exception {
		System.out.println("调用修改的方法");
		return NONE;
	}

	public String delete() throws Exception {
		System.out.println("调用删除的方法");
		return NONE;
	}
}
