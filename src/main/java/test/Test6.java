package test;

import static org.mockito.Matchers.intThat;

import java.util.ArrayList;
import java.util.Arrays;

public class Test6 {
	
	public static void main(String[] args) {
		String name="ram";
		new Foo1().m1(name);
		System.out.println(name);
		
		String s1= "hello";
		String s2 = new String(s1);
		String s3 = "hello";
		System.out.println(s1.equals(s2));
		System.out.println(s2==s3);
		
		
		ArrayList<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(-1);
		a.add(-2);
		a.add(4);
		removeNegative(a);
		
	}
	
	public static void removeNegative(ArrayList<Integer> a){
		int i=0;
		while(i<a.size()){
			if(a.get(i)<0){
				a.remove(i);
			}
		}
		System.out.println("Non-negative "+a);
	}
}
class Foo1{
	public void m1(String name){
		name = "HELLO - "+name;
		
	}
}

interface I{
	String f();
}
class C implements I{

	@Override
	public String f() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
