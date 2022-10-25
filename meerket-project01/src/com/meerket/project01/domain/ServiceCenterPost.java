package com.meerket.project01.domain;

import java.sql.Timestamp;

// 서비스센터 글
public class ServiceCenterPost {

	private int serviceNo;
	private int categoryNo;
	private String id;
	private String title;
	private String content;
	private Timestamp regDate;
	private String file1;
	
	public ServiceCenterPost() {}
	
	public ServiceCenterPost(int serviceNo, int categoryNo, String id, String title, String content, Timestamp regDate, 
			String file1) {
		
		this.serviceNo = serviceNo;
		this.categoryNo = categoryNo;
		this.id = id;
		this.title = title;
		this.content = content;
		this.regDate = regDate;
		this.file1 = file1;
	}

	public int getServiceNo() {
		return serviceNo;
	}

	public void setServiceNo(int serviceNo) {
		this.serviceNo = serviceNo;
	}

	public int getCategoryNo() {
		return categoryNo;
	}

	public void setCategoryNo(int categoryNo) {
		this.categoryNo = categoryNo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getRegDate() {
		return regDate;
	}

	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}

	public String getFile1() {
		return file1;
	}

	public void setFile1(String file1) {
		this.file1 = file1;
	}
	
	
}
