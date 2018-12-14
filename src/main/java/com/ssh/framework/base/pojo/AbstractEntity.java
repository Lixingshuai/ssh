package com.ssh.framework.base.pojo;

import java.io.Serializable;

public interface AbstractEntity<T extends Serializable> extends Serializable {

	/**
	 * 功能说明：读取代理ID的数据!
	 *
	 * @return T 定义代理ID!
	 **/
	public T getId();

}
