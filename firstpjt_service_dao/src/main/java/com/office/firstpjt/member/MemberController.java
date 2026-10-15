package com.office.firstpjt.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController {
	
//	@Autowired
//	MemberService memberService;
	
	// 생성자 주입 : final 로 선언해 의존 객체가 바뀌지 않도록 한다
	private final MemberService memberService;
	
	@Autowired		// 생략가능
	public MemberController(MemberService memberService) {
		this.memberService = memberService;
	}

	// 회원가입
	@RequestMapping("/signUp")
	public String signUp() {
		System.out.println("[MemberController] signUp() called");
		
		// 뷰 이름 반환 : 뷰 리졸버가 sign_up 화면을 찾아 보여준다
		return "sign_up";
	}
	
	// 회원가입 확인(+MemberDto)
	@RequestMapping(value="/signUpConfirm", method=RequestMethod.POST)
	public String signUpConfirm(MemberDto memberDto) {
		System.out.println("[MemberController] signUpConfirm() called");
		
		System.out.println("m_Id : " + memberDto.getM_Id());
		System.out.println("m_Pw : " + memberDto.getM_Pw());
		System.out.println("m_Mail : " + memberDto.getM_Mail());
		System.out.println("m_Phone : " + memberDto.getM_Phone());
		System.out.println("m_Age : " + memberDto.getM_Age());
		
		// 1.new로 새로운 객체 생성
//		MemberService memberService = new MemberService();
//		memberService.SignUpConfirm(memberDto);
		
		// 2.xml을 이용해 IoC컨테이너 활용해 bean생성
//		@Autowired
//		MemberService memberService;
		memberService.signUpConfirm(memberDto);
		
		// 3.애너테이션을 활용해 bean생성(MemberService에서)
//		@Service
//		public class MemberService {}
		
		return "sign_up_ok";
	}
	
	
	// 로그인
	@RequestMapping("/signIn")
	public String signIn() {
		System.out.println("[MemberController] signIn() called");
		
		return "sign_in";
		
	}
	
	// 로그인 확인
	@RequestMapping(value="/signInConfirm", method=RequestMethod.POST)
	public String signInConfirm(MemberDto memberDto) {
		System.out.println("[MemberController] signInConfirm()");
		
		memberService.signUpConfirm(memberDto);
		
		return "sign_in_ok";
		
	}
	
	
	
}
