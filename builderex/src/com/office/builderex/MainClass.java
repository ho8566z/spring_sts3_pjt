package com.office.builderex;

public class MainClass {
	
	public static void main(String[] args) {
		
		User user = new User.Builder("gildong", 20)
//					.mail("gildong@gmail.com")
					.phone("010-1234-5678")
					.build();
		// build 패턴은 필수정보를 받은 다음에, 추가 정보를 넣으면 입력되는 추가정보의 유형에 입력된다.
		
	}

}
