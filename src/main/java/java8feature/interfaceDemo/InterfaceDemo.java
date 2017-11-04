package java8feature.interfaceDemo;

interface Phone{
	void call();
	default void message(){
		System.out.println("message sent");
	}
}

class AndroidPhone implements Phone{

	@Override
	public void call() {
		System.out.println("Android Call");
	}
	
}
public class InterfaceDemo {
	public static void main(String[] args) {
		Phone p = new AndroidPhone();
		p.call();
		Phone p1 = new Phone() {
			
			@Override
			public void call() {
				System.out.println("call- annoymous");
				
			}
		};
		p1.call();
	}
}


