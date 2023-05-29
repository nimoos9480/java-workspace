package com.kh.example.practice5;

import java.util.Scanner;

import com.kh.example.practice5.controller.EmployeeController;
import com.kh.example.practice5.model.Employee;

public class Application {
	
	Scanner sc = new Scanner(System.in);
	Employee viewEmployee = new Employee();
	EmployeeController employeeController= new EmployeeController();
	
	
	public static void main(String[] args) {
		
		Application app = new Application();
		
		boolean check = true;
		while(check) {
			int option = app.employeeMenu();  // = employeeMenu의 return 값 불러오기
			switch(option) {
			case 1: app.insertEmp(); break;
			case 2: app.updateEmp(); break;
			case 3: app.printEmp(); break;
			case 9: System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	
		
//		for (int i = 1;; i++) {
//			int option = app.employeeMenu(); // = employeeMenu의 return 값 불러오기
//			if (option == 1)
//				app.insertEmp();
//			else if (option == 2)
//				app.updateEmp();
//			else if (option == 3)
//				app.printEmp();
//			else if (option == 9) {
//				System.out.println("프로그램을 종료합니다.");
//				break;
//			}
//
//		}}

	}
		
		public int employeeMenu() { // 메인메뉴 출력

			System.out.println("1. 사원정보 추가");
			System.out.println("2. 사원정보 수정");
			System.out.println("3. 사원정보 출력");
			System.out.println("9. 프로그램 종료");
			
			System.out.print("메뉴 번호를 누르세요 : ");
			return Integer.parseInt(sc.nextLine());
			
			// 초기화

		}

		public void insertEmp() { // 저장할 데이터를 사용자에게 받는 메소드

			System.out.print("사원번호 : ");
			int empNo = Integer.parseInt(sc.nextLine());  // nextLine 통일~

			System.out.print("사원이름 : ");
			String name = sc.nextLine();

			System.out.print("사원성별 : ");
			char gender = sc.nextLine().charAt(0); 

			System.out.print("전화번호 : ");
			String phone = sc.nextLine();

			System.out.print("추가 정보를 더 입력하시겠습니까(y/n) : ");
			String add = sc.nextLine();
			
				if (add.equals("y")) {
					System.out.print("사원부서 : ");
					String dept = sc.nextLine();

					System.out.print("사원연봉 : ");
					int salary = Integer.parseInt(sc.nextLine());

					System.out.print("보너스 율 : ");
					double bonus = Double.parseDouble(sc.nextLine());
					

					employeeController.add(empNo, name, gender, phone, dept, gender, bonus); // 입력받은 데이터를 컨트롤러 값에 넣어주는 것

				} else { // n인 경우
					employeeController.add(empNo, name, gender, phone);
				}
			}

		

		public void updateEmp() { // 수정할 데이터를 사용자에게 받는 메소드
		
				System.out.println("사원의 어떤 정보를 수정하시겠습니까? : ");

				System.out.println("1. 전화번호");
				System.out.println("2. 사원연봉");
				System.out.println("3. 보너스 율");
				System.out.println("9. 돌아가기");

				System.out.print("메뉴 번호를 누르세요 : ");
				int menu = Integer.parseInt(sc.nextLine());

				switch (menu) {
				case 1:
					System.out.print("전화 번호 입력 : ");
					String phone = sc.nextLine();
					employeeController.modify(phone);  // 수정값을 컨트롤러에 넣기
					break; // 까먹지 말기

				case 2:
					System.out.print("사원연봉 : ");
					int salary = Integer.parseInt(sc.nextLine());
					employeeController.modify(salary);
					break;

				case 3:
					System.out.print("보너스 율 : ");
					double bonus = Double.parseDouble(sc.nextLine());
					employeeController.modify(bonus);
					break;

				case 9:
					System.out.println("프로그램을 종료합니다.");
					break;
				}
			}


		public void printEmp() { // 데이터를 출력하는 메소드
			System.out.println(employeeController.info());
		
		}

	

}
		
