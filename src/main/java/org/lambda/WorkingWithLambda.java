package org.lambda;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

interface Calc{
	int add(int a, int b);
}
interface Printer{
	void printDate();
}

public class WorkingWithLambda {

	public static void main(String[] args) {
		Calc c1 = (a,b)->{return a+b;};
		System.out.println(c1.add(10, 20));
		String name = "ddddddd";
		Printer p1 = ()->System.out.println(new Date());
		p1.printDate();
		//
		test_forEach();
	}
	
	private static void test_forEach(){
		List<Integer> list = Arrays.asList(1,2,3,5,4,7,9,8,10);
		//find the double of first even no which is greater then 3
		System.out.println(
				list.stream()
					.filter(n-> n>3)
					.filter(n-> n%2==0)
					.map(n-> n*2)
					.findFirst()
				);
	}
}
