package com.action.param;

import java.util.List;

import com.bean.UserBean;
import com.util.BaseAction;

public class ParamAction_One extends BaseAction {
	/**
	 * 属性驱动来接收值：通过单个属性接收
	 */
	private String username;
	private String password;
	private String gender;
	private List<String> like;

	/**
	 * 属性驱动来接收值：通过Bean来接收
	 */
	private UserBean userBean;

	public UserBean getUserBean() {
		return userBean;
	}

	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<String> getLike() {
		return like;
	}

	public void setLike(List<String> like) {
		this.like = like;
	}

	@Override
	public String execute() throws Exception {

		return null;
	}

	public String requestObj() throws Exception {

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");

		System.out.println("username =" + username);
		System.out.println("password =" + password);
		System.out.println("gender =" + gender);

		return NONE;
	}

	public String modelObj() throws Exception {

		System.out.println("username =" + this.username);
		System.out.println("password =" + this.password);
		System.out.println("gender =" + this.gender);

		System.out.println("like =" + this.like);
		return NONE;
	}

	public String modelObj_Bean() throws Exception {

		System.out.println("username =" + this.getUserBean().getUsername());
		System.out.println("password =" + this.getUserBean().getPassword());
		System.out.println("gender =" + this.getUserBean().getGender());

		System.out.println("like =" + this.getUserBean().getLike());
		return NONE;
	}
}
