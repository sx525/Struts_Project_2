package com.action.type;

import com.opensymphony.xwork2.ActionSupport;

public class ActionType_Three extends ActionSupport {

	/**
	 * �̳и�������壺����ֱ��ʹ��ActionSuppport�ж���õķ���������Struts��ҳ��Ľ���������
	 */
	@Override
	public String execute() throws Exception {
		System.out.println("������Action���ͣ��̳�ActionSupport����");
		return null;
	}

}
