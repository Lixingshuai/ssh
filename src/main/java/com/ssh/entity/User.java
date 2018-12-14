package com.ssh.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.ssh.framework.base.pojo.AbstractEntity;

@SuppressWarnings("rawtypes")
@Entity
@Table(name = "t_user")
public class User implements AbstractEntity {
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
