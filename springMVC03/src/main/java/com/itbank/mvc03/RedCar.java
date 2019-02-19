package com.itbank.mvc03;

public class RedCar implements Car {
	//정적속성=>변수
	//동적속성=>메소드
	public void open() {
		System.out.println("레드카를 열다.");
	}
	
	public void close() {
		System.out.println("레드카를 닫다.");
	}
}
