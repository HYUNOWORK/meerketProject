package com.meerket.project01.domain;

// 관심상품
public class InterestedItems {

	private int attentionNo;
	private int userNo;
	private int productNo;
	
	public InterestedItems() {}
	
	public InterestedItems(int attentionNo, int userNo, int productNo) {
		this.attentionNo = attentionNo;
		this.userNo = userNo;
		this.productNo = productNo;
	}

	public int getAttentionNo() {
		return attentionNo;
	}

	public void setAttentionNo(int attentionNo) {
		this.attentionNo = attentionNo;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public int getProductNo() {
		return productNo;
	}

	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}
	
	
}
