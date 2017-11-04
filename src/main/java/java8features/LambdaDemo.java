package java8features;

interface A {
	void show();
}

class foo implements A {

	@Override
	public void show() {
		System.out.println("Hello");
	}
}

public class LambdaDemo {

	public static void main(String[] args) {
		A obj;
		obj = new A() {
			@Override
			public void show() {
				System.out.println("Just Showing");
			}
		};
		obj.show();
		// lambda expression
		obj = ()-> System.out.println("Heloo");
		obj.show();
	}
}
