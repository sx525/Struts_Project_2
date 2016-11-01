package com.action.param;

import com.bean.UserBean;
import com.opensymphony.xwork2.ModelDriven;
import com.util.BaseAction;

public class ParamAction_Two extends BaseAction implements
		ModelDriven<UserBean> {
	private UserBean userBean;

	public UserBean getModel() {
		userBean = new UserBean();
		return userBean;
	}

	@Override
	public String execute() throws Exception {
		System.out.println("username =" + this.userBean.getUsername());
		System.out.println("password =" + this.userBean.getPassword());
		System.out.println("gender =" + this.userBean.getGender());

		System.out.println("like =" + this.userBean.getLike());
		return NONE;
	}
}
