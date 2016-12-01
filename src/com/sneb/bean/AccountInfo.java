package com.sneb.bean;

/**
 * AccountInfo entity. @author MyEclipse Persistence Tools
 */

public class AccountInfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private String userId;
	private String nickname;
	private String userRealname;

	// Constructors

	/** default constructor */
	public AccountInfo() {
	}

	/** full constructor */
	public AccountInfo(String userId, String nickname, String userRealname) {
		this.userId = userId;
		this.nickname = nickname;
		this.userRealname = userRealname;
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

	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getUserRealname() {
		return this.userRealname;
	}

	public void setUserRealname(String userRealname) {
		this.userRealname = userRealname;
	}

}