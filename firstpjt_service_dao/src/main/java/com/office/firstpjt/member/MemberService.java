package com.office.firstpjt.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//@Component
public class MemberService {

	final private MemberDao memberDao;
	
	@Autowired		// 의존 객체 자동 주입(DI, Dependency Injection)
	public MemberService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	public int signUpConfirm(MemberDto memberDto) {
		System.out.println("[MemberService] signUpConfirm()");
		
		System.out.println("M_id: " + memberDto.getM_Id());
		System.out.println("M_pw: " + memberDto.getM_Pw());
		System.out.println("M_mail: " + memberDto.getM_Mail());
		System.out.println("M_phone: " + memberDto.getM_Phone());
		System.out.println("M_age: " + memberDto.getM_Age());
		
		memberDao.insertMember(memberDto);
		
		return 0;
		
	}
	
	public void signInConfirm(MemberDto memberDto) {
		System.out.println("[MemberService] signUpConfirm()");
		
		memberDao.selectMember(memberDto);
	}
	
	
}
