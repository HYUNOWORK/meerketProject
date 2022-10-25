package com.meerket.project01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meerket.project01.dao.MemberDao;
import com.meerket.project01.domain.Member;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDao memberDao;

	public void serMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	
	@Override
	public List<Member> memberList() {
	return memberDao.memberList();
	}
	
	
	// 
	@Override
	public int login(String userId, String pass) {

		return memberDao.login(userId, pass);
	}

	// 
	@Override
	public Member getMember(String userId) {

		return memberDao.getMember(userId);
	}


	// 
	@Override
	public boolean overlapIdCheck(String userId) {
		Member member = memberDao.getMember(userId);
		System.out.println("overlapIdCheck - member : " + member);
		if (member == null) {
			return false;
		}
		return true;
	}

	// 
	@Override
	public void addMember(Member member) {
		memberDao.addMember(member);
	}
	
	
	// 
	@Override
	public boolean memberPassCheck(String userId, String pass) {
	
		return memberDao.memberPassCheck(userId, pass);
	}

	// 
	@Override
	public void updateMember(Member member) {
		memberDao.updateMember(member);
		
	}






}
