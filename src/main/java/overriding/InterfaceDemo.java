package overriding;

interface Int{
	public void foo();
}
class Impl implements Int{

	@Override
	public void foo() {
		System.out.println("foo");
		
	}
	
	public void bar(){
		System.out.println("bar");
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Int a = new Impl();
		a.foo();

	}

}
