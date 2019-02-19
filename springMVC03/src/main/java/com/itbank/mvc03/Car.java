package com.itbank.mvc03;

public interface Car {
//인터페이스는 기능만을 명세하는 역할
//추상메소드로만 들어감. 일반변수 불가. 
//객체 생성 불가.
	/*
	 * public void test() { System.out.println(); }
	 */
	public abstract void open();
	public abstract void close();

}