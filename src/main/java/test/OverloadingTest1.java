package test;

public class OverloadingTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Foo f = new Foo();
		f.print(null);

	}

}

class Foo{
	public void print(Object o){
		System.out.println("object");
	}
	public void print(String s){
		System.out.println("String");
	}
}
