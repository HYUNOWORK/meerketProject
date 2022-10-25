package com.meerket.project01.domain;

import java.sql.Timestamp;

// 마켓상품
public class MarketPost {

	private int productNo;
	private int categoryNo;
	private String userId;
	private String productName;
	private String productState;
	private String content;
	private int price;
	private String mainImg;
	private String subImg;
	private int recommend;
	private int readCount;
	private Timestamp regDate;
	
	public MarketPost() {}
	
	public MarketPost(int productNo, int categoryNo, String userId, String productName, String productState, String content,
						int price, String mainImg, String subImg, int recommend, int readCount, Timestamp regDate) {
		this.productNo = productNo;
		this.categoryNo = categoryNo;
		this.userId = userId;
		this.productName = productName;
		this.productState = productState;
		this.content = content;
		this.price = price;
		this.mainImg = mainImg;
		this.subImg = subImg;
		this.recommend = recommend;
		this.readCount = readCount;
		this.regDate = regDate;
		
	}

	public int getProductNo() {
		return productNo;
	}

	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}

	public int getCategoryNo() {
		return categoryNo;
	}

	public void setCategoryNo(int categoryNo) {
		this.categoryNo = categoryNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductState() {
		return productState;
	}

	public void setProductState(String productState) {
		this.productState = productState;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getMainImg() {
		return mainImg;
	}

	public void setMainImg(String mainImg) {
		this.mainImg = mainImg;
	}

	public String getSubImg() {
		return subImg;
	}

	public void setSubImg(String subImg) {
		this.subImg = subImg;
	}

	public int getRecommend() {
		return recommend;
	}

	public void setRecommend(int recommend) {
		this.recommend = recommend;
	}

	public int getReadCount() {
		return readCount;
	}

	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}

	public Timestamp getRegDate() {
		return regDate;
	}

	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}
	
	
}
