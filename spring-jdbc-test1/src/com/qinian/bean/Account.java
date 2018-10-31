package com.qinian.bean;

import java.io.Serializable;

/**
 * 账号实体类
 * 
 * @author 宋敏
 * @Description: 账号实体，包含id,name,money3个属性
 */
public class Account implements Serializable {

	private static final long serialVersionUID = -2899308650992330134L;

	private Integer id;
	private String name;
	private Float money;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getMoney() {
		return money;
	}

	public void setMoney(Float money) {
		this.money = money;
	}

	public Account() {
		super();
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", money=" + money + "]";
	}

	public Account(Integer id, String name, Float money) {
		super();
		this.id = id;
		this.name = name;
		this.money = money;
	}
	

}
