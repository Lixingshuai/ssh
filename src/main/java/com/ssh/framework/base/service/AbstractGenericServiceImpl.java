package com.ssh.framework.base.service;

import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ssh.framework.base.dao.AbstractGenericDao;
import com.ssh.framework.base.pojo.AbstractEntity;

public class AbstractGenericServiceImpl {

	protected Logger logger = LoggerFactory.getLogger(this.getClass().getName());

	protected AbstractGenericDao abstractGenericDao;

	public <T extends AbstractEntity<?>> T load(Class<T> clazz, Serializable id) {
		return abstractGenericDao.load(clazz, id);
	}

	public <T extends AbstractEntity<?>> T get(Class<T> clazz, Serializable id) {
		return abstractGenericDao.get(clazz, id);
	}

	public <T extends AbstractEntity<?>> void save(T pojo) {
		abstractGenericDao.save(pojo);
	}

	public AbstractGenericDao getAbstractGenericDao() {
		return abstractGenericDao;
	}

	public void setAbstractGenericDao(AbstractGenericDao abstractGenericDao) {
		this.abstractGenericDao = abstractGenericDao;
	}

}
