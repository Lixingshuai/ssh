package com.ssh.framework.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EntityNotFoundException extends RepositoryException {
	private static final Logger logger = LoggerFactory.getLogger(EntityNotFoundException.class);
	private static final long serialVersionUID = 696937879336030508L;

	public EntityNotFoundException(Class<?> clazz, String id) {
		super(id);
		if (logger.isDebugEnabled()) {
			logger.debug(this.getMessage());
		}
	}
}
