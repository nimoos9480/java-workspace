package com.kh.array.practice2.controller;

import com.kh.array.practice2.model.Member;

public class MemberController {
	
	private Member[] mArr = new Member[3];
	public int count = 0;
	
//	public void insertMember(String id, String name, String password, String email, char gender, int age) // 1번 방식
	//	mArr[count++] = new Member(id, name, password, email, gender, age);

	public void insertMember(Member m) { // Member 객체를 객체배열에 저장 (Member의 m은 매개변수) // 2번 방식
		// 객체 배열에 객체 하나씩 추가한다고 생각!
		// count를 인덱스라고 생각!
		// score[0] = 100;
		// stuArr[0] = new Student("김길동", "자바", 100);
		
//		mArr[count++] = new Member(m.getId(), m.getName(), m.getPassword(), m.getEmail(), m.getGender(), m.getAge());
		mArr[count++] = m; // m은 Application에서 정의했음
	
		
	}
	
	public boolean updateMember(String id, String name, String password, String email) { // Id로 조회된 회원의 정보 수정
		// checkId 활용  <-- index
		// 추가처럼 수정도 같은 방식! 해당 인덱스 값에 넣는 방식!
		// setter 이용!
		
		int index = this.checkId(id);
		if(index!=-1) { // 기존 회원일 때
			mArr[index].setName(name);
			mArr[index].setPassword(password);
			mArr[index].setEmail(email);
			return true;
		}
		return false;
	} 

	public int checkId(String id) { // Id로 회원 조회
		// 객체 배열 값들 for문 돌려서~ 일치한 지 확인해서 return값 
		for(int i=0; i<mArr.length; i++) {
			if(mArr[i]!=null && mArr[i].getId().equals(id)) { // 배열에서 얻어온 id가 null이 아니고 회원 id와 동일할 때
				return i; // 인덱스를 반환
			}
		}
		return -1; // 일치하지 않으면 -1로 반환(배열이 0부터 시작하니까 보통)
	}
	
	public Member[] printAll() { // Member객체 반환
		return mArr;
	}
	

}
