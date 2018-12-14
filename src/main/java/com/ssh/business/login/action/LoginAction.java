package com.ssh.business.login.action;

import com.ssh.business.login.service.LoginService;
import com.ssh.framework.base.action.BaseAction;

public class LoginAction extends BaseAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private LoginService loginService;

	public String login() {
		return loginService.login();
	}

	public LoginService getLoginService() {
		return loginService;
	}

	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

}
