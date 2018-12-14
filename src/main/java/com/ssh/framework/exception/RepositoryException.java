package com.ssh.framework.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RepositoryException extends BaseException {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -8161853458732041340L;
	private static final Logger logger = LoggerFactory.getLogger(RepositoryException.class);

	/**
	 * Creator
	 * 
	 * @param message
	 */
	public RepositoryException(String message) {
		super(message);
		logger.error(message);
	}

	/**
	 * Creator
	 * 
	 * @param cause
	 */
	public RepositoryException(Throwable cause) {
		super(cause);
		logger.error(getMessage());
	}

	/**
	 * Creator
	 * 
	 * @param message
	 * @param cause
	 */
	public RepositoryException(String message, Throwable cause) {
		super(message, cause);
		logger.error(message + "," + cause.getClass().getName() + ":" + cause.getMessage());
	}
}
