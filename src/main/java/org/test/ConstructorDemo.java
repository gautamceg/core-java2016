package org.test;

public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method");
		new ConstructorDemo();
	}
	public ConstructorDemo() {
		System.out.println("Default constructor");
	}
	static{
		System.out.println("Static block");
	}

}

