package com.meerket.project01.domain;

import java.sql.Timestamp;

// 공지사항 글
public class NoticePost {

	private int noticeNo;
	private String title;
	private String id;
	private String content;
	private String file1;
	private String img;
	private Timestamp regDate;
	
	public NoticePost() {}
	
	public NoticePost(int noticeNo, String title, String id, String content, String file1, String img, Timestamp regDate) {
		this.noticeNo = noticeNo;
		this.title =title;
		this.id = id;
		this.content = content;
		this.file1 = file1;
		this.img = img;
		this.regDate = regDate;
	}

	public int getNoticeNo() {
		return noticeNo;
	}

	public void setNoticeNo(int noticeNo) {
		this.noticeNo = noticeNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getFile1() {
		return file1;
	}

	public void setFile1(String file1) {
		this.file1 = file1;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Timestamp getRegDate() {
		return regDate;
	}

	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}
	
	
}
