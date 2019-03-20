package com.ssh.entity;

import com.ssh.framework.base.pojo.AbstractEntity;

public class User implements AbstractEntity<Integer> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7751173336552753992L;

	private int id;

	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
