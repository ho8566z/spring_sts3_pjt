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
