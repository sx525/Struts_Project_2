package com.action.response;

import java.util.ArrayList;
import java.util.List;

import com.bean.UserBean;
import com.util.BaseAction;

public class ResponseAction extends BaseAction {
	private String username;
	private UserBean userBean;
	private List<UserBean> userList = null;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public UserBean getUserBean() {
		return userBean;
	}

	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;
	}

	public List<UserBean> getUserList() {
		return userList;
	}

	public void setUserList(List<UserBean> userList) {
		this.userList = userList;
	}

	@Override
	public String execute() throws Exception {
		/**
		 * 为属性赋值
		 */
		username = "admin";
		List<String> likeList = new ArrayList<String>();
		likeList.add("爱好1");
		likeList.add("爱好5");
		likeList.add("爱好6");

		userBean = new UserBean();
		userBean.setUsername("用户名");
		userBean.setPassword("123444");
		userBean.setGender("男");
		userBean.setLike(likeList);

		userList = new ArrayList<UserBean>();
		for (int i = 1; i < 10; i++) {
			UserBean userBean = new UserBean();
			userBean.setUsername("list中的username = " + i);
			userBean.setPassword("123444");
			if (i % 2 == 0) {
				userBean.setGender("男");
			} else {
				userBean.setGender("女");
			}

			userBean.setLike(likeList);
			userList.add(userBean);
		}

		return SUCCESS;
	}

}
