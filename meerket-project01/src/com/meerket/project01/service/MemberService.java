package com.meerket.project01.service;



import java.util.List;

import org.springframework.stereotype.Service;

import com.meerket.project01.domain.Member;

@Service
public interface MemberService {

	public abstract List<Member> memberList();
	
	public int login(String userId, String pass);
	
	
	public Member getMember(String userId);
	
	// īī�� ��ū �޼���
	
	//public String getAccessToken (String authorize_code);
	
	
	// ���̵� �ߺ� üũ
	public boolean overlapIdCheck(String userId);
	
	// ȸ�� ���� ����
	public void addMember(Member member);
	
	// ��й�ȣ üũ
	public boolean memberPassCheck(String userId, String pass);
	
	// ȸ�� ����  ����
	public void updateMember(Member member);

	
	
}
