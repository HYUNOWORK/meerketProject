package com.meerket.project01.domain;

import java.sql.Timestamp;

// 사기신고
public class ReportFraud {

	private int reportFraudNo;
	private String reporter;
	private String respondent;
	private String content;
	private Timestamp regDate;
	private String state;
	
	public ReportFraud() {}
	
	public ReportFraud(int reportFraudNo, String reporter, String respondent, String content, Timestamp regDate, String state) {
		this.reportFraudNo = reportFraudNo;
		this.reporter = reporter;
		this.respondent = respondent;
		this.content = content;
		this.regDate = regDate;
		this.state = state;
	}

	public int getReportFraudNo() {
		return reportFraudNo;
	}

	public void setReportFraudNo(int reportFraudNo) {
		this.reportFraudNo = reportFraudNo;
	}

	public String getReporter() {
		return reporter;
	}

	public void setReporter(String reporter) {
		this.reporter = reporter;
	}

	public String getRespondent() {
		return respondent;
	}

	public void setRespondent(String respondent) {
		this.respondent = respondent;
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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
}
