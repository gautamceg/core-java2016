package overloading;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 d1 = new Demo1();
		B b = new B();
		A a = new B();
		
		A ab = new B();
		
		b.stat();
		ab.stat();
		
	}
	public void show(A a){a.foo();}
	public void show(B b){b.foo();}

}

class A{
	public void foo(){
		System.out.println("A foo");
	}
	static void stat(){
		System.out.println("A stat");
	}
}
class B extends A{
	public void foo() {
		System.out.println("B foo");
	}
	
	static void stat(){
		System.out.println("B stat");
	}
	
}
