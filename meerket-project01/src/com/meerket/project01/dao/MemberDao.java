package com.meerket.project01.dao;

import java.util.List;

import com.meerket.project01.domain.Member;

public interface MemberDao {

	public abstract List<Member> memberList();
	
	public int login(String userId, String pass);
	
	public Member getMember(String userId);
	
	// ȸ�� ������ ȸ�� ���̺� ����
	public void addMember(Member member);
	
	// ȸ�� ���� ���� �� ��й�ȣ üũ �޼���
	public boolean memberPassCheck(String userId, String pass);
	
	// ȸ�� ������ ȸ�� ���̺��� �����ϴ� �޼���
	public void updateMember(Member member);
	
	
	
	
}
