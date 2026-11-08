package com.office.firstpjt.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 회원가입·로그인 화면 요청을 받아 MemberService 에 처리를 맡기고 뷰 이름을 반환한다.
 */
@Controller
public class MemberController {
	
	// 생성자 주입 : final 로 선언해 의존 객체가 바뀌지 않도록 한다
	private final MemberService memberService;
	
	@Autowired		// 생략가능
	public MemberController(MemberService memberService) {
		this.memberService = memberService;
	}

	/**
	 * 회원가입 화면(sign_up)을 돌려준다.
	 *
	 * @return 뷰 이름 sign_up
	 */
	@RequestMapping("/signUp")
	public String signUp() {
		System.out.println("[MemberController] signUp() called");
		
		// 뷰 이름 반환 : 뷰 리졸버가 sign_up 화면을 찾아 보여준다
		return "sign_up";
	}
	
	/**
	 * 회원가입 폼(POST)으로 받은 정보를 MemberService 에 넘겨 가입을 처리한다.
	 *
	 * @param memberDto 폼에서 전달된 회원 정보
	 * @return 뷰 이름 sign_up_ok
	 */
	@RequestMapping(value="/signUpConfirm", method=RequestMethod.POST)
	public String signUpConfirm(MemberDto memberDto) {
		System.out.println("[MemberController] signUpConfirm() called");
		
		System.out.println("m_Id : " + memberDto.getM_Id());
		System.out.println("m_Pw : " + memberDto.getM_Pw());
		System.out.println("m_Mail : " + memberDto.getM_Mail());
		System.out.println("m_Phone : " + memberDto.getM_Phone());
		System.out.println("m_Age : " + memberDto.getM_Age());
		
		// MemberService 는 직접 new 하지 않고, 스프링이 @Service 로 만들어 둔 bean 을 주입받아 쓴다.
		memberService.signUpConfirm(memberDto);
		
		return "sign_up_ok";
	}
	
	
	/**
	 * 로그인 화면(sign_in)을 돌려준다.
	 *
	 * @return 뷰 이름 sign_in
	 */
	@RequestMapping("/signIn")
	public String signIn() {
		System.out.println("[MemberController] signIn() called");
		
		return "sign_in";
		
	}
	
	/**
	 * 로그인 폼(POST)으로 받은 아이디와 비밀번호를 MemberService 에 넘겨 로그인을 확인한다.
	 *
	 * @param memberDto 폼에서 전달된 아이디와 비밀번호
	 * @return 뷰 이름 sign_in_ok
	 */
	@RequestMapping(value="/signInConfirm", method=RequestMethod.POST)
	public String signInConfirm(MemberDto memberDto) {
		System.out.println("[MemberController] signInConfirm()");
		
		memberService.signInConfirm(memberDto);
		
		return "sign_in_ok";
		
	}
	
	
	
}
