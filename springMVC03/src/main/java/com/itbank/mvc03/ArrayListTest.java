package com.itbank.mvc03;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("나는 문자.");
		list.add('상');
		list.add(100);  //boxing-->upcasting
		list.add(111.22);
		
		System.out.println(list);
		
		String s = (String)list.get(0); //downcasting
		int i = (int)list.get(2);//unboxing->downcasting
		
		
//		    unboxing
//		int <----- Integer
//		    ------>
//			boxing
	}

}
