package test;

import java.util.HashMap;

public class Test10 {

	public static void main(String[] args) {
		String a = "hello";
		String b = "Hello";
		String c = new String("hello");
		String d = new String("Hello");
		
		HashMap map = new HashMap();
		map.put(a, "1");
		map.put(b, "2");
		map.put(c, "3");
		map.put(d, "4");
		
		System.out.println(map.size());
		
		///////////////
		String s = "x";
		switch(s){
		case "a":
			System.out.println("a");
		default:
			System.out.println("default");
		case "b":
			System.out.println("b");
		case "c":
			System.out.println("c");
			break;
		}
		
	}

}
