package com.office.firstpjt.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 회원가입·로그인 처리 로직을 담당하고, 실제 DB 작업은 MemberDao 에 맡긴다.
 */
@Service
//@Component
public class MemberService {

	final private MemberDao memberDao;
	
	@Autowired		// 의존 객체 자동 주입(DI, Dependency Injection)
	public MemberService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	/**
	 * 입력받은 회원 정보를 확인하고 MemberDao 에 저장을 요청한다.
	 *
	 * @param memberDto 가입할 회원 정보
	 * @return 항상 0
	 */
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
	
	/**
	 * 입력받은 아이디와 비밀번호로 로그인 확인을 MemberDao 에 요청한다.
	 *
	 * @param memberDto 로그인할 회원의 아이디와 비밀번호
	 */
	public void signInConfirm(MemberDto memberDto) {
		System.out.println("[MemberService] signInConfirm()");
		
		memberDao.selectMember(memberDto);
	}
	
	
}
