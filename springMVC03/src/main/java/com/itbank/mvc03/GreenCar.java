package com.itbank.mvc03;

public class GreenCar implements Car {

	@Override
	public void open() {
		System.out.println("그린카를 열다");
	}

	@Override
	public void close() {
		System.out.println("그린카를 닫다");
	}

}
