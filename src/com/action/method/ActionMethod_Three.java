package com.action.method;

import com.opensymphony.xwork2.ActionSupport;

public class ActionMethod_Three extends ActionSupport {

	public String list() throws Exception {
		System.out.println("���ò�ѯ�ķ���");
		return NONE;
	}

	public String add() throws Exception {
		System.out.println("������ӵķ���");
		return NONE;
	}

	public String edit() throws Exception {
		System.out.println("�����޸ĵķ���");
		return NONE;
	}

	public String delete() throws Exception {
		System.out.println("����ɾ���ķ���");
		return NONE;
	}
}
