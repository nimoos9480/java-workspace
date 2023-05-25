package com.kh.example.practice4;

import java.util.Scanner;

import com.kh.example.practice4.controller.SnackController;
import com.kh.example.practice4.model.Snack;

public class Run {
	
//	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {  // static 메소드 안에서 사용할 수 없는 것 : 인스턴스 변수, 인스턴스 메서드
		
//		Snack s = new Snack();
		SnackController scr = new SnackController();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("스낵류를 입력하세요.");
		
		System.out.print("종류 : ");
		String kind = sc.nextLine();
//		s.setKind(sc.nextLine()); 
		/* => String kind = sc.nextLine();
		 *    s.setKind(kind);
		 * */ 
	
		System.out.print("이름 : ");
		String name = sc.nextLine();
//		s.setName(sc.nextLine());
		
		System.out.print("맛 : ");
//		s.setFlavor(sc.nextLine());
		String flavor = sc.nextLine();
		
		System.out.print("개수 : ");
//		s.setNumOf(sc.nextInt());
//		s.setNumOf(Integer.parseInt(sc.nextLine()));
		int numOf = Integer.parseInt(sc.nextLine());
		
		System.out.print("가격 : ");
//		s.setPrice(sc.nextInt());
//		s.setPrice(Integer.parseInt(sc.nextLine()));
		int price = Integer.parseInt(sc.nextLine());
		
		Snack s = new Snack(kind, name, flavor, numOf, price);
		
		if(scr.saveData(s)) {
		
		System.out.println("저장 완료되었습니다.");
		System.out.println(scr.confirmData());
		
		}
		
//		System.out.println(s);
//		System.out.println(s.getkind()+"("+s.getname()+"-"+s.getflavor()+") "+ s.getnumOf()+"개 "+s.getprice()+"원");
		

	}

}
