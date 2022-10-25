package com.meerket.project01.domain;

import java.sql.Timestamp;

// 커뮤니티 글
public class CommunityPost {

	private int communityNo;
	private String id;
	private String title;
	private String area;
	private String content;
	private String img;
	private int recommend;
	private Timestamp regDate;
	private int readCount;
	
	public CommunityPost() {}
	
	public CommunityPost(int communityNo, String id, String title, String area, String content, String img,
						int recommend, Timestamp regDate, int readCount) {
		this.communityNo = communityNo;
		this.id = id;
		this.title = title;
		this.area = area;;
		this.content = content;
		this.img = img;
		this.recommend = recommend;
		this.regDate = regDate;
		this.readCount = readCount;
	}

	public int getCommunity_no() {
		return communityNo;
	}

	public void setCommunity_no(int community_no) {
		this.communityNo = community_no;
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

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public int getRecommend() {
		return recommend;
	}

	public void setRecommend(int recommend) {
		this.recommend = recommend;
	}

	public Timestamp getReg_date() {
		return regDate;
	}

	public void setReg_date(Timestamp reg_date) {
		this.regDate = reg_date;
	}

	public int getRead_count() {
		return readCount;
	}

	public void setRead_count(int read_count) {
		this.readCount = read_count;
	}
	
	
}
