package com.office.builderex;

/**
 * 회원 정보(이름, 나이, 메일, 연락처)를 담는 클래스.
 * Builder 로만 만들 수 있고, 이름과 나이는 필수 정보이다.
 */
public class User {
	
	/*
	 * 회원정보: 
	 * 		*이름, *나이, 
	 * 		이메일, 연락처
	 */
	private String name;
	private int age;
	private String mail;
	private String phone;
	
	/** Builder 에 모인 값으로 User 를 만든다. */
	public User(Builder builder) {
		this.name = builder.name;
		this.age = builder.age;
		this.mail = builder.mail;
		this.phone = builder.phone;
	}
	
	/**
	 * User 를 단계별로 조립하는 Builder.
	 * 필수 정보(이름, 나이)는 생성자로, 추가 정보(메일, 연락처)는 메서드 체이닝으로 받는다.
	 */
	public static class Builder {
		private String name;
		private int age;
		private String mail;
		private String phone;
		
		/** 필수 정보(이름, 나이)를 받아 Builder 를 만든다. */
		public Builder(String name, int age) {
			this.name = name;
			this.age = age;
		}
		
		/** 추가 정보인 메일을 설정하고 Builder 자신을 돌려준다. */
		public Builder mail(String mail) {
			this.mail = mail;
			return this;
		}
		
		/** 추가 정보인 연락처를 설정하고 Builder 자신을 돌려준다. */
		public Builder phone(String phone) {
			this.phone = phone;
			return this;
		}
	
		/** 지금까지 입력한 값으로 User 를 만든다. */
		public User build() {
			return new User(this);
		}
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", mail=" + mail + ", phone=" + phone + "]";
	}
	
	
}
