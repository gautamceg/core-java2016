package org.overloading;

public class OverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingDemo demo = new OverloadingDemo();
		demo.foo(null);
		demo.foo(2);
	}
	
	public void foo(int i){System.out.println("int");}
	public void foo(long a){System.out.println("long");}
	public void foo(Object obj){System.out.println("Object");}
	public void foo(String str){System.out.println("String");}
	//public void foo(Integer integer){System.out.println("Integer");}
	//compiler will be confused now

}
