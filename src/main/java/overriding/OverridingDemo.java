package overriding;
class A{
	public static String A_SATIC = "A_SATIC";
	public void fooA(){
		System.out.println("fooA");
	}
	public void bar(){
		System.out.println("A bar");
	}
	private void show(){
		System.out.println("A show");
	}
	
	public static void doSomething(){
		System.out.println("A doSomething");
	}
}
class B extends A{
	public static String B_SATIC = "B_SATIC";
	public void fooB(){
		System.out.println("fooB");
	}
	
	@Override
	public void bar(){
		System.out.println("B bar");
	}
	
	void show(){
		System.out.println("B show");
	}
	
	public static void doSomething(){
		System.out.println("B doSomething");
	}
	
}

public class OverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A x = new B();
		x.bar();
		x.fooA();
		System.out.println(x.A_SATIC);
		//x.doSomething(); -- A
	}

}
