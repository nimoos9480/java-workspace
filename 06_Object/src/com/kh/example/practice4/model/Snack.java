package com.kh.example.practice4.model;

public class Snack {
	
	private String kind;
	private String name;
	private String flavor;
	private int numOf;
	private int price;
	
	public Snack() {}	// 기본 생성자 : 입력안하면 인식 안됨(Snack s = new Snack(); 인식안됨)
	
//	alt + shift + s => 자동완성
	public Snack(String kind, String name, String flavor, int numOf, int price) {
		this.kind = kind;
		this.name = name;
		this.flavor = flavor;
		this.numOf = numOf;
		this.price = price;
	}
	
	public String getkind () {
		return kind;
	}
	
	public void setKind(String kind) {
		this.kind = kind;
		}
	
	public String getname () {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
		}
	
	public String getflavor () {
		return flavor;
	}
	
	public void setFlavor(String flavor) {
		this.flavor = flavor;
		}
	
	public int getnumOf () {
		return numOf;
	}
	
	public void setNumOf(int numOf) {
		this.numOf = numOf;
		}
	
	public int getprice () {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
		}

	
	@Override
	public String toString() {
		return "Snack [kind=" + kind + ", name=" + name + ", flavor=" + flavor + ", numOf=" + numOf + ", price=" + price
				+ "]";
	}

	
	
	

}
