package com.office.builderex;

/**
 * Builder 패턴으로 User 를 만들어 보는 예제.
 */
public class MainClass {
	
	/** 필수 정보(이름, 나이)와 연락처만 넣어 User 를 만들고 출력한다. 메일은 생략할 수 있다. */
	public static void main(String[] args) {
		
		User user = new User.Builder("gildong", 20)
//					.mail("gildong@gmail.com")
					.phone("010-1234-5678")
					.build();
		System.out.println(user);
		// build 패턴은 필수정보를 받은 다음에, 추가 정보를 넣으면 입력되는 추가정보의 유형에 입력된다.
		
	}

}
