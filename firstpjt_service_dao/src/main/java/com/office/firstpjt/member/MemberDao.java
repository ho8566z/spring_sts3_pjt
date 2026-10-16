package com.office.firstpjt.member;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Repository;

//@Service
//@Component
/**
 * 회원 정보를 저장·조회하는 DAO. DB 대신 HashMap(MEMBER_DB)에 보관한다.
 */
@Repository
public class MemberDao {
	
	final private Map<String, MemberDto> MEMBER_DB = new HashMap<String, MemberDto>();

	/**
	 * 회원 정보를 아이디를 키로 MEMBER_DB 에 저장하고 전체 목록을 출력한다.
	 *
	 * @param memberDto 저장할 회원 정보
	 */
	public void insertMember(MemberDto memberDto) {
		System.out.println("[MemberDao] insertMember()");
		
		System.out.println("Dao-M_id: " + memberDto.getM_Id());
		System.out.println("Dao-M_pw: " + memberDto.getM_Pw());
		System.out.println("Dao-M_mail: " + memberDto.getM_Mail());
		System.out.println("Dao-M_phone: " + memberDto.getM_Phone());
		System.out.println("Dao-M_age: " + memberDto.getM_Age());
		
		MEMBER_DB.put(memberDto.getM_Id(), memberDto);
		
		printAllMember();
		
	}
	
	/** MEMBER_DB 에 저장된 모든 회원 정보를 콘솔에 출력한다. */
	private void printAllMember() {
		System.out.println("[MemberDao] printAllMember()");
		
		Set<String> keys = MEMBER_DB.keySet();
		Iterator<String> iterator = keys.iterator();
		
		while (iterator.hasNext()) {
			String m_id = iterator.next();
			MemberDto memberDto = MEMBER_DB.get(m_id);
			
			System.out.println("Dao2-M_id : " + memberDto.getM_Id());
			System.out.println("Dao2-M_pw : " + memberDto.getM_Pw());
			System.out.println("Dao2-M_mail : " + memberDto.getM_Mail());
			System.out.println("Dao2-M_phone : " + memberDto.getM_Phone());
			System.out.println("Dao2-M_age : " + memberDto.getM_Age());
		}
		
	}

	/**
	 * 아이디로 회원을 찾아 비밀번호가 같으면 로그인 성공을 출력한다.
	 *
	 * @param memberDto 로그인할 회원의 아이디와 비밀번호
	 */
	public void selectMember(MemberDto memberDto) {
		System.out.println("[MemberDao] selectMember()");
		
		MemberDto selectedMemberDto = MEMBER_DB.get(memberDto.getM_Id());
		if (selectedMemberDto != null && 
				selectedMemberDto.getM_Pw().equals(memberDto.getM_Pw())) {
			System.out.println("SIGN IN SUCCESS!!");
			
		} else {
			System.out.println("SIGN IN FAIL!!");
			
		}
		
	}
	
}
