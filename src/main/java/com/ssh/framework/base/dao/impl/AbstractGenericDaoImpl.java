package com.ssh.framework.base.dao.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ssh.framework.base.dao.AbstractGenericDao;
import com.ssh.framework.base.pojo.AbstractEntity;
import com.ssh.framework.exception.RepositoryException;

public class AbstractGenericDaoImpl implements AbstractGenericDao {

	private SessionFactory sessionFactory;

	public <T extends AbstractEntity<?>> T load(Class<T> clazz, Serializable id) throws EntityNotFoundException {
		Session session = sessionFactory.getCurrentSession();
		return session.load(clazz, id);
	}

	public <T extends AbstractEntity<?>> T get(Class<T> clazz, Serializable id) throws EntityNotFoundException {
		Session session = sessionFactory.getCurrentSession();
		return session.get(clazz, id);
	}

	public <T extends AbstractEntity<?>> void save(T pojo) throws EntityExistsException {
		Session session = sessionFactory.getCurrentSession();
		session.save(pojo);
	}

	public <T extends AbstractEntity<?>> void update(T pojo) throws EntityExistsException {
		Session session = sessionFactory.getCurrentSession();
		session.update(pojo);
	}

	public <T extends AbstractEntity<?>> void saveOrUpdate(T pojo) throws EntityExistsException {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(pojo);
	}

	public <T extends AbstractEntity<?>> void delete(Class<T> clazz, Serializable id) throws EntityNotFoundException {
		Session session = sessionFactory.getCurrentSession();
		session.delete(clazz.getName(), id);
	}

	public <T extends AbstractEntity<?>> void delete(T pojo) throws EntityNotFoundException {
		Session session = sessionFactory.getCurrentSession();
		session.delete(pojo);
	}

	public <T extends AbstractEntity<?>> List<T> findBy(Class<T> clazz, String where) throws RepositoryException {
		Session session = sessionFactory.getCurrentSession();
		return null;
	}

	public <T extends AbstractEntity<?>> List<T> findBy(Class<T> clazz, String where, Map<String, Object> params) {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends AbstractEntity<?>> List<T> findBy(Class<T> clazz, String where, Object[] values) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object loadAbstractEntityByQL(String jpql) throws RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public Object loadAbstractEntity(String hql, Map<String, Object> params) throws RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public Object loadAbstractEntity(String hql, Object... values) throws RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends AbstractEntity<?>> T loadAbstractEntity(Class<T> clazz, String where, Object... values)
			throws RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Object> queryPageRetrunList(int currentPageIndex, int pageSize, String hql, Object... values)
			throws RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Object> queryPageByParamsRetrunList(int currentPageIndex, int pageSize, String hql,
			Map<String, Object> params) throws RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Object> findByQL(String jpql) throws RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public int batchHandle(String queryString, Object[] values) throws RepositoryException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int queryCount(String hql, Object... values) throws RepositoryException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int queryCount(String hql, Map<String, Object> params) throws RepositoryException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int querySqlCount(String sql) throws RepositoryException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int querySqlCount(String sql, Object[] values) throws RepositoryException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int querySqlCount(String sql, Map<String, Object> params) throws RepositoryException {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Object> queryByParamsRetrunList(String hql, Map<String, Object> params) throws RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Object> queryByValuesRetrunList(String hql, Object... values) throws RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public <T extends AbstractEntity<?>> List<T> queryByHql(String hql) throws RepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Map<String, Object>> queryNativeSql(String queryString) {
		Session session = sessionFactory.getCurrentSession();
		SQLQuery query = session.createSQLQuery(queryString);
		return query.list();
	}

	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> queryNativeSQLByParams(String queryString, Object[] params) {
		Session session = sessionFactory.getCurrentSession();
		SQLQuery query = session.createSQLQuery(queryString);
		for (int i = 0; i < params.length; i++) {
			query.setParameter(i, params[i]);
		}
		return query.list();
	}

	public int updateNativeSql(String updateString) {
		Session session = sessionFactory.getCurrentSession();
		SQLQuery query = session.createSQLQuery(updateString);
		return query.executeUpdate();
	}

	public int updateNativeSqlByParams(String updateString, Object[] params) {
		Session session = sessionFactory.getCurrentSession();
		SQLQuery query = session.createSQLQuery(updateString);
		for (int i = 0; i < params.length; i++) {
			query.setParameter(i, params[i]);
		}
		return query.executeUpdate();
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
