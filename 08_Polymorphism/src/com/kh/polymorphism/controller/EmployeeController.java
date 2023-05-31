package com.kh.polymorphism.controller;

import com.kh.polymorphism.model.child.Engineer;
import com.kh.polymorphism.model.parent.Employee;

public class EmployeeController {
	
	// Employee의 객체배열과 이름을 가지고 와서 일치한 사람 반환하는 메서드
	public Employee findEmployeeByName(Employee[] ea, String name) {
//		Employee emp = null;  // 안해도 되긴 함
		
		for(Employee employee : ea) {
			if(employee.getName().equals(name)) {
//				emp = employee;
				return employee; // null 값 지정 안했을 때
//				} return emp; // 1번
			}
		} 

		
//		for (int i = 0; i < ea.length; i++) {
//			if (ea[i].getName().equals(name)) {
//				return ea[i];
//			}
//		}
		return null;

	}
	
	// 연봉 계산 메서드 : engineer인 경우 보너스가 있음!
	public int getAnnaulSalary(Employee e) {
		
		int AnnualSalary = e.getSalary() *12;
		
		// instanceof 연산자 - import 해주기
		//  => 어떤 클래스 형의 객체(인스턴스)의 주소를 참조하고 있는지 확인할 때 사용
		if(e instanceof Engineer) {
			Engineer eg = (Engineer) e; // 부모에서 자식으로 강제 형 변환!
			AnnualSalary += eg.getBonus();
//			return ((Engineer) e).getBonus() + e.getSalary()*12;
		}
		return AnnualSalary;
	}
	
	
	// 전체 연봉 총 합계 메서드
	public int getTotalCoast(Employee[]ea) {
		
		int total = 0;
		
		for(Employee employee : ea) { // Employee는 객체의 자료형(String/int 같은거), employee는 임의로 설정한 변수(배열 내의 각각의 값), ea는 임의로 정한 배열명
			total += getAnnaulSalary(employee);			
		}
		
	return total;

}
	


}
