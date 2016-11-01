package com.action.type;

public class ActionType_Two implements com.opensymphony.xwork2.Action {
	/**
	 * 实现接口的意义：直接接口中定义的常量
	 */
	public String execute() throws Exception {
		System.out.println("第二种Action类型，实现Action接口");
		return null;
	}

}
