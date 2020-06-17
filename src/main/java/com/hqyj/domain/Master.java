package com.hqyj.domain;

import java.util.Date;

/**
 *  标准类：
 *   固定写法
 * @author daimn
 * 
 *   `sys_id` char(6) NOT NULL,
  `account` varchar(15) NOT NULL,
  `password` varchar(18) NOT NULL,
  `name` varchar(15) NOT NULL,
  `sex` char(1) NOT NULL,
  `entry_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`sys_id`)
  j2ee_master 表，这是超级管理员信息表，
包括管理员 ID、管理员登录账户、
管理员登录密码、管理员的名字、
管理员性别和管理员账号的登记时间

 *
 */
public class Master {
	private String sysid;
	 private String account;// 账户
	 private String password;//密码
	 private String name;// 姓名
	 private String sex;
	 private Date  entry_time;
	public Master() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Master(String sysid, String account, String password, String name, String sex, Date entry_time) {
		super();
		this.sysid = sysid;
		this.account = account;
		this.password = password;
		this.name = name;
		this.sex = sex;
		this.entry_time = entry_time;
	}
	public String getSysid() {
		return sysid;
	}
	public void setSysid(String sysid) {
		this.sysid = sysid;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getEntry_time() {
		return entry_time;
	}
	public void setEntry_time(Date entry_time) {
		this.entry_time = entry_time;
	}
	@Override
	public String toString() {
		return "Master [sysid=" + sysid + ", account=" + account + ", password=" + password + ", name=" + name
				+ ", sex=" + sex + ", entry_time=" + entry_time + "]";
	}
	 
	 
	

}
