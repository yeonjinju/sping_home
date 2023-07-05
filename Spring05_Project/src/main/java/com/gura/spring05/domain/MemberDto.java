package com.gura.spring05.domain;

import java.sql.Date;

public class MemberDto {
/*
 * -- 사용자 회원 정보를 저장할 테이블
CREATE TABLE tbl_member (
    userId      VARCHAR2(50)    not null,
    userPass    VARCHAR2(100)   not null,
    userName    VARCHAR2(30)    not null,
    userPhon    VARCHAR2(20)    not null,
    userAddr1   VARCHAR2(20)    null,
    userAddr2   VARCHAR2(50)    null,
    userAddr3   VARCHAR2(50)    null,
    regiDate    DATE            default sysdate,
    verify      NUMBER          default 0,
    primary key(userId)
);
 */
	

	private String userPass;
	private String userName;
	private String userPhon;
	private String userAddr1;
	private String userAddr2;
	private String userAddr3;
	private Date regDate;
	private int verify;
	
	public MemberDto () {}
	
	public MemberDto(String userId, String userPass, String userName, String userPhon, String userAddr1,
			String userAddr2, String userAddr3, Date regDate, int verify) {
		super();
		this.userId = userId;
		this.userPass = userPass;
		this.userName = userName;
		this.userPhon = userPhon;
		this.userAddr1 = userAddr1;
		this.userAddr2 = userAddr2;
		this.userAddr3 = userAddr3;
		this.regDate = regDate;
		this.verify = verify;
	}

	
	private String userId;
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhon() {
		return userPhon;
	}

	public void setUserPhon(String userPhon) {
		this.userPhon = userPhon;
	}

	public String getUserAddr1() {
		return userAddr1;
	}

	public void setUserAddr1(String userAddr1) {
		this.userAddr1 = userAddr1;
	}

	public String getUserAddr2() {
		return userAddr2;
	}

	public void setUserAddr2(String userAddr2) {
		this.userAddr2 = userAddr2;
	}

	public String getUserAddr3() {
		return userAddr3;
	}

	public void setUserAddr3(String userAddr3) {
		this.userAddr3 = userAddr3;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public int getVerify() {
		return verify;
	}

	public void setVerify(int verify) {
		this.verify = verify;
	}


	
}
