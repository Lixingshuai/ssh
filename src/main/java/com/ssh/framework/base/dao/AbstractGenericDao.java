package com.ssh.framework.base.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;

import com.ssh.framework.base.pojo.AbstractEntity;
import com.ssh.framework.exception.RepositoryException;

public interface AbstractGenericDao {

	/**
	 * [根据ID读取持久化对象] <br>
	 * 
	 * @param clazz 要读取的类
	 * @param id    Serializable 表的主键数值
	 * @return POJO
	 * @throws EntityNotFoundException 实体不存在 <br>
	 */
	public <T extends AbstractEntity<?>> T load(Class<T> clazz, Serializable id) throws EntityNotFoundException;

	/**
	 * 
	 * /** 功能说明：保存!
	 *
	 * @param <T> POJO 要保存的对象!
	 * 
	 * @throws EntityNotFoundException 实体不存在!
	 **/
	public <T extends AbstractEntity<?>> void save(T pojo) throws EntityExistsException;

	/**
	 * 功能说明：更新!
	 *
	 * @param <T> POJO 要保存的对象!
	 * 
	 * @throws EntityNotFoundException 实体不存在!
	 **/
	public <T extends AbstractEntity<?>> void update(T pojo) throws EntityExistsException;

	/**
	 * 功能说明：保存或更新!
	 *
	 * @param <T> POJO 要保存的对象!
	 * 
	 * @throws EntityNotFoundException 实体不存在!
	 **/
	public <T extends AbstractEntity<?>> void saveOrUpdate(T pojo) throws EntityExistsException;

	/**
	 * 功能说明：删除方法!
	 *
	 * @param    <T> clazz 要删除的对象!
	 * 
	 * @param id Serializable 要删除对象的主键数值!
	 *
	 * @throws EntityNotFoundException 实体已存在!
	 **/
	public <T extends AbstractEntity<?>> void delete(Class<T> clazz, Serializable id) throws EntityNotFoundException;

	/**
	 * 功能说明：删除方法!
	 *
	 * @param <T> pojo 要删除的对象!
	 *
	 * @throws EntityNotFoundException 实体已存在!
	 **/
	public <T extends AbstractEntity<?>> void delete(T pojo) throws EntityNotFoundException;

	/**
	 * 功能说明：要据条件查询!
	 *
	 * @param       <T> pojo type
	 * @param where JPQL where 语句
	 *
	 * @return 查询对象的集合
	 **/
	public <T extends AbstractEntity<?>> List<T> findBy(Class<T> clazz, String where) throws RepositoryException;

	/**
	 * 功能说明：要据条件查询!
	 *
	 * @param        <T> pojo type
	 * @param where  JPQL where 语句 例如： where name=:name
	 * @param params 参数
	 *
	 * @return 查询对象的集合
	 **/
	public <T extends AbstractEntity<?>> List<T> findBy(Class<T> clazz, String where, Map<String, Object> params);

	/**
	 * 功能说明：要据条件查询!
	 *
	 * @param        <T> pojo type
	 * @param where  JPQL where 语句 例如： where name=?
	 * @param values 参数
	 *
	 * @return 查询对象的集合
	 **/
	public <T extends AbstractEntity<?>> List<T> findBy(Class<T> clazz, String where, Object[] values);

	/**
	 * 通过jpql语句查询单个实体对象
	 *
	 * @param jpql
	 *
	 * @return 返回结果为单个对象
	 **/
	public Object loadAbstractEntityByQL(String jpql) throws RepositoryException;

	/**
	 * 通过jpql语句查询单个实体对象
	 *
	 * @param hql
	 * @param params
	 *
	 * @return 返回结果为单个对象
	 **/
	public Object loadAbstractEntity(String hql, Map<String, Object> params) throws RepositoryException;

	/**
	 * 通过jpql语句查询单个实体对象
	 *
	 * @param hql
	 * @param params
	 *
	 * @return 返回结果为单个对象
	 **/
	public Object loadAbstractEntity(String hql, Object... values) throws RepositoryException;

	/**
	 * [要据条件查询!]
	 *
	 * @param        <T> pojo type
	 * @param where  JPQL where 语句
	 * @param values
	 *
	 * @return 返回结果为单个对象
	 **/
	public <T extends AbstractEntity<?>> T loadAbstractEntity(Class<T> clazz, String where, Object... values)
			throws RepositoryException;

	/**
	 * 分页查询通过jpql语句
	 *
	 * @param                  <T>
	 * @param currentPageIndex 当前页数
	 * @param pageSize         一页最大记录数
	 * @param params           查询条件
	 *
	 * @return 返回Page对象
	 **/
	public List<Object> queryPageRetrunList(int currentPageIndex, int pageSize, String hql, Object... values)
			throws RepositoryException;

	/**
	 * 分页查询通过jpql语句
	 *
	 * @param                  <T>
	 * @param currentPageIndex 当前页数
	 * @param pageSize         一页最大记录数
	 * @param params           查询条件
	 *
	 * @return 返回List对象
	 **/
	public List<Object> queryPageByParamsRetrunList(int currentPageIndex, int pageSize, String hql,
			Map<String, Object> params) throws RepositoryException;

	/**
	 * 通过jpql语句查询
	 *
	 * @param jpql
	 *
	 * @return 返回查询结果集合
	 **/
	public List<Object> findByQL(String jpql) throws RepositoryException;

	/**
	 * 批量更新、删除对象
	 *
	 * @param queryString HQL形式的更新或删除语句
	 * @param values      参数数组
	 *
	 * @return 更新或删除的数据条数
	 **/
	public int batchHandle(String queryString, Object[] values) throws RepositoryException;

	/**
	 * 分页总数
	 *
	 * @param hql
	 * @param values 参数数组
	 *
	 * @return int
	 **/
	public int queryCount(String hql, Object... values) throws RepositoryException;

	/**
	 * 分页总数
	 *
	 * @param hql
	 * @param params 参数数组
	 *
	 * @return int
	 **/
	public int queryCount(String hql, Map<String, Object> params) throws RepositoryException;

	/**
	 * 分页总数
	 *
	 * @param sql
	 *
	 * @return int
	 **/
	public int querySqlCount(String sql) throws RepositoryException;

	/**
	 * 分页总数
	 *
	 * @param sql
	 * @param values 参数数组
	 *
	 * @return int
	 **/
	public int querySqlCount(String sql, Object[] values) throws RepositoryException;

	/**
	 * 分页总数
	 *
	 * @param sql
	 * @param params 参数数组
	 *
	 * @return int
	 **/
	public int querySqlCount(String sql, Map<String, Object> params) throws RepositoryException;

	/**
	 * 查询通过jpql语句
	 *
	 * @param        <T>
	 * @param hql    查询语名定义
	 * @param params 查询条件
	 *
	 * @return 返回List对象
	 **/
	public List<Object> queryByParamsRetrunList(String hql, Map<String, Object> params) throws RepositoryException;

	/**
	 * 查询通过jpql语句
	 *
	 * @param        <T>
	 * @param hql    查询语名定义
	 * @param params 查询条件
	 *
	 * @return 返回List对象
	 **/
	public List<Object> queryByValuesRetrunList(String hql, Object... values) throws RepositoryException;

	/**
	 * 查询通过jpql语句
	 *
	 * @param        <T>
	 * @param hql    查询语名定义
	 * @param params 查询条件
	 *
	 * @return 返回List对象
	 **/
	public <T extends AbstractEntity<?>> List<T> queryByHql(String hql) throws RepositoryException;

	/**
	 * 查询原生SQL
	 *
	 * @param             <T>
	 * @param queryString 查询语名定义
	 *
	 * @return 返回List对象
	 **/
	public List<Map<String, Object>> queryNativeSql(String queryString);

	/**
	 * 查询原生SQL
	 *
	 * @param             <T>
	 * @param queryString 查询语名定义
	 *
	 * @return 返回List对象
	 **/
	public List<Map<String, Object>> queryNativeSQLByParams(String queryString, Object[] params);

	public int updateNativeSql(String updateString);

	public int updateNativeSqlByParams(String updateString, Object[] params);

}
