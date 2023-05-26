package com.kh.example.practice5.controller;

import com.kh.example.practice4.model.Snack;
import com.kh.example.practice5.model.Employee;

public class EmployeeController {

	
	private Employee employee = new Employee();
	
	public void add(int empNo, String name, char gender, String phone) {
		employee.setEmpNo(empNo);
		employee.setName(name);
		employee.setGender(gender);
		employee.setPhone(phone);
		
	}
	
	// 오버로딩!!
	public void add(int empNo, String name, char gender, String phone, String dept, int salary, double bonus) {
		this.add(empNo, name, gender, phone); // 변수뿐만 아니라 메소드도 자기자신을 가르킬 수 있다!!
		employee.setDept(dept);
		employee.setSalary(salary);
		employee.setBonus(bonus);
		
	}
	public void modify(String phone) {
		employee.setPhone(phone);
	}
	public void modify(int salary) {
		employee.setSalary(salary);
	}
	public void modify(double bonus) {
		employee.setBonus(bonus);

	}
	
	public Employee info() {
		return this.employee;
	}
	
	
}

