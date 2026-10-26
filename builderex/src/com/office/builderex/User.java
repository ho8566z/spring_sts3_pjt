package com.office.builderex;

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
	
	public User(Builder builder) {
		this.name = builder.name;
		this.age = builder.age;
		this.mail = builder.mail;
		this.phone = builder.phone;
	}
	
	public static class Builder {
		private String name;
		private int age;
		private String mail;
		private String phone;
		
		// 필수정보
		public Builder(String name, int age) {
			this.name = name;
			this.age = age;
		}
		
		// 추가정보 1
		public Builder mail(String mail) {
			this.mail = mail;
			return this;
		}
		
		// 추가정보 2
		public Builder phone(String phone) {
			this.phone = phone;
			return this;
		}
	
		public User build() {
			return new User(this);
		}
	}
	
	
}
