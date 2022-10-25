package com.meerket.project01.domain;

import java.sql.Timestamp;

// 마켓리뷰
public class MarketReview {

	private int reviewNo;
	private int productNo;
	private String userId;
	private String content;
	private int grade;
	private Timestamp regDate;
	
	public MarketReview() {}
	
	public MarketReview(int reviewNo, int productNo, String userId, String content, int grade, Timestamp regDate) {
		this.reviewNo = reviewNo;
		this.productNo = productNo;
		this.userId = userId;
		this.content = content;
		this.grade = grade;
		this.regDate = regDate;
	}

	public int getReviewNo() {
		return reviewNo;
	}

	public void setReviewNo(int reviewNo) {
		this.reviewNo = reviewNo;
	}

	public int getProductNo() {
		return productNo;
	}

	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public Timestamp getRegDate() {
		return regDate;
	}

	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}
	
	
	
}
