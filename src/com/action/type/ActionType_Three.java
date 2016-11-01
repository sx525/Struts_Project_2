package com.action.type;

import com.opensymphony.xwork2.ActionSupport;

public class ActionType_Three extends ActionSupport {

	/**
	 * 继承父类的意义：可以直接使用ActionSuppport中定义好的方法，用于Struts与页面的交互操作。
	 */
	@Override
	public String execute() throws Exception {
		System.out.println("第三种Action类型，继承ActionSupport对象");
		return null;
	}

}
