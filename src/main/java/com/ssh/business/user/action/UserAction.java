package com.ssh.business.user.action;

import com.ssh.business.user.service.UserService;

public class UserAction {
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}
