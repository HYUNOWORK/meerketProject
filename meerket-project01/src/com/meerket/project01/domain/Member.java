package com.meerket.project01.domain;

import java.sql.Timestamp;

// member 
public class Member {

	private int userNo;
	private String userId;
	private String name;
	private String nickname;
	private String pass;
	private String securityNumber;
	private String phone;
	private String email;
	private String address1;
	private String address2;
	private String zipcode;
	private String introduction;
	private String  image;
	private Timestamp regDate;
	
	public Member() {}
	public Member(int userNo, String userId, String name, String nickname, String pass, String securityNumber,
				String phone, String email, String address1, String address2, String zipcode,
				String introduction, String image, Timestamp regDate) {
		
		this.userNo = userNo;
		this.userId = userId;
		this.name = name;
		this.nickname = nickname;
		this.pass = pass;
		this.securityNumber = securityNumber;
		this.phone = phone;
		this.email = email;
		this.address1 = address1;
		this.address2 = address2;
		this.zipcode = zipcode;
		this.introduction = introduction;
		this.image = image;
		this.regDate = regDate;
	}
	
	public int getUserNum() {
		return userNo;
	}
	public void setUserNum(int userNum) {
		this.userNo = userNum;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getSecurityNumber() {
		return securityNumber;
	}
	public void setSecurityNumber(String securityNumber) {
		this.securityNumber = securityNumber;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getzipcode() {
		return zipcode;
	}
	public void setzipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Timestamp getRegDate() {
		return regDate;
	}
	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}

}
