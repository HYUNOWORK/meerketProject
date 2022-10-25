package com.meerket.project01.domain;

import java.sql.Timestamp;

// 커뮤니티 댓글
public class CommunityReply {

	private int communityNo;
	private int replyNo;
	private String replyWriter;
	private String replyContent;
	private Timestamp regDate;
	private int replyDepth; // 댓글의 깊이
	private String replyGroup; // 대댓글일 경우  모댓글이 누군지 저장
	
	public CommunityReply() {}
	
	public CommunityReply(int communityNo, int replyNo, String replyWriter, String replyContent, Timestamp regDate,
			int replyDepth, String replyGroup) {
		this.communityNo = communityNo;
		this.replyNo = replyNo;
		this.replyWriter = replyWriter;
		this.replyContent = replyContent;
		this.regDate = regDate;
		this.replyDepth = replyDepth;
		this.replyGroup = replyGroup;
	}

	public int getCommunityNo() {
		return communityNo;
	}

	public void setCommunityNo(int communityNo) {
		this.communityNo = communityNo;
	}

	public int getReplyNo() {
		return replyNo;
	}

	public void setReplyNo(int replyNo) {
		this.replyNo = replyNo;
	}

	public String getReplyWriter() {
		return replyWriter;
	}

	public void setReplyWriter(String replyWriter) {
		this.replyWriter = replyWriter;
	}

	public String getReplyContent() {
		return replyContent;
	}

	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}

	public Timestamp getRegDate() {
		return regDate;
	}

	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}

	public int getReplyDepth() {
		return replyDepth;
	}

	public void setReplyDepth(int replyDepth) {
		this.replyDepth = replyDepth;
	}

	public String getReplyGroup() {
		return replyGroup;
	}

	public void setReplyGroup(String replyGroup) {
		this.replyGroup = replyGroup;
	}
	
	
}
