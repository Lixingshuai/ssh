package com.ssh.framework.exception;

/**
 * [定义基础异常处理]
 * 
 * @author LiKai
 * @date 2016年9月14日 下午3:10:11
 * @company Gainet
 * @version 1.0
 * @copyright copyright (c) 2016
 */
public class BaseException extends RuntimeException {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1916666162255424434L;

	public BaseException(String message) {
		super(message);
	}

	public BaseException(String message, Throwable cause) {
		super(message, cause);
	}

	public BaseException(Throwable cause) {
		super(cause);
	}
}
