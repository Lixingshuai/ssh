package com.ssh.framework.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * [定义实体已存在异常处理]
 * 
 * @author LiKai
 * @date 2016年9月14日 下午3:13:03
 * @company Gainet
 * @version 1.0
 * @copyright copyright (c) 2016
 */
public class EntityExistsException extends RepositoryException {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 2400192125854067992L;
	private static final Logger logger = LoggerFactory.getLogger(EntityExistsException.class);

	public EntityExistsException(Class<?> clazz, String id) {
		super(id);

		if (logger.isDebugEnabled()) {
			logger.debug(this.getMessage());
		}
	}
}
