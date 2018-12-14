package com.ssh.framework.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServiceException extends BaseException {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -2771269964091200762L;
	private static final Logger logger = LoggerFactory.getLogger(ServiceException.class);

	public ServiceException(String message) {
		super(message);
		logger.error(message);
	}

	public ServiceException(Throwable cause) {
		super(cause);
		logger.error(this.getMessage());
	}

	public ServiceException(String message, Throwable cause) {
		super(message, cause);
		logger.error(message + "," + cause.getClass().getName() + ":" + cause.getMessage());
	}
}
