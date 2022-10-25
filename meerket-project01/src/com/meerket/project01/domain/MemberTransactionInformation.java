package com.meerket.project01.domain;

import java.sql.Timestamp;

// 회원거래정보
public class MemberTransactionInformation {

	private int dealNo;
	private int count;
	private int gradeSum;
	private Timestamp regDate;
	private int userNo;
	
	public MemberTransactionInformation() {}
	
	public MemberTransactionInformation(int dealNo, int count, int gradeSum, Timestamp regDate,
			int userNo) {
		this.dealNo = dealNo;
		this.count = count;
		this.gradeSum = gradeSum;
		this.regDate = regDate;
		this.userNo = userNo;
	}

	public int getDealNum() {
		return dealNo;
	}

	public void setDealNum(int dealNum) {
		this.dealNo = dealNum;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getGradeSum() {
		return gradeSum;
	}

	public void setGradeSum(int gradeSum) {
		this.gradeSum = gradeSum;
	}

	public Timestamp getRegDate() {
		return regDate;
	}

	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}

	public int getUserNum() {
		return userNo;
	}

	public void setUserNum(int userNum) {
		this.userNo = userNum;
	}
	
}
