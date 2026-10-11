package com.office.firstpjt.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 회원 관련 요청(회원가입, 로그인)을 처리하는 컨트롤러.
 */
@Controller
public class MemberController {

	// 회원가입
	@RequestMapping("/signUp")
	public String signUp() {
		System.out.println("[MemberController] signUp()");
		
		return "sign_up";
	}
	
	// 로그인
	@RequestMapping("/signIn")
	public String signIn() {
		System.out.println("[MemberController] signIn()");
		
		return "sign_in";
	}
	
}
