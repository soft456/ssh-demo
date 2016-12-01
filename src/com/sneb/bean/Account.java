package com.sneb.bean;

/**
 * Account entity. @author MyEclipse Persistence Tools
 */

public class Account implements java.io.Serializable {

	// Fields

	private Integer id;
	private String userId;
	private String userEmail;
	private String userMobile;
	private String userPwd;
	private Short userStatus;
	private String demo;

	// Constructors

	/** default constructor */
	public Account() {
	}

	/** minimal constructor */
	public Account(Integer id, String userId, Short userStatus) {
		this.id = id;
		this.userId = userId;
		this.userStatus = userStatus;
	}

	/** full constructor */
	public Account(Integer id, String userId, String userEmail,
			String userMobile, String userPwd, Short userStatus, String demo) {
		this.id = id;
		this.userId = userId;
		this.userEmail = userEmail;
		this.userMobile = userMobile;
		this.userPwd = userPwd;
		this.userStatus = userStatus;
		this.demo = demo;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserMobile() {
		return this.userMobile;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public String getUserPwd() {
		return this.userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public Short getUserStatus() {
		return this.userStatus;
	}

	public void setUserStatus(Short userStatus) {
		this.userStatus = userStatus;
	}

	public String getDemo() {
		return this.demo;
	}

	public void setDemo(String demo) {
		this.demo = demo;
	}

}