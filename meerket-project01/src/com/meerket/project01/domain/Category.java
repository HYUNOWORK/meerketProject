package com.meerket.project01.domain;

// 카테고리
public class Category {

	private int categoryNo;
	private String categoryName;
	private String description;
	
	public Category() {}
	
	public Category(int categoryNo, String categoryName, String description) {
		
		this.categoryNo = categoryNo;
		this.categoryName = categoryName;
		this.description = description;
	}

	public int getCategoryNo() {
		return categoryNo;
	}

	public void setCategoryNo(int categoryNo) {
		this.categoryNo = categoryNo;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
