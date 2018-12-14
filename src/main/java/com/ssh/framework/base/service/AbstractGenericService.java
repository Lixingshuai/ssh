package com.ssh.framework.base.service;

import com.ssh.framework.base.dao.AbstractGenericDao;

public class AbstractGenericService {

	private AbstractGenericDao abstractGenericDao;

	public AbstractGenericDao getAbstractGenericDao() {
		return abstractGenericDao;
	}

	public void setAbstractGenericDao(AbstractGenericDao abstractGenericDao) {
		this.abstractGenericDao = abstractGenericDao;
	}

}
