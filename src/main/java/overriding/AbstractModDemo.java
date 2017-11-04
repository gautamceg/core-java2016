package overriding;

abstract class Abs1{
	public Abs1(){
		System.out.println("abs1 super");
		foo();
	}
	abstract void foo();
}
class Chalu extends Abs1{
	public Chalu() {
		System.out.println("Chalu constructor");
	}

	@Override
	void foo() {
		System.out.println("foo");
		
	}
}
public class AbstractModDemo {

	public static void main(String[] args) {
		Abs1 a = new Chalu();
		

	}

}
