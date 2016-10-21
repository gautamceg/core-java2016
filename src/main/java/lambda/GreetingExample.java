package lambda;
interface Greeting{
	public void sayHello(String name);
}

public class GreetingExample {

	public static void main(String[] args) {
		Greeting ge = new Greeting() {
			
			@Override
			public void sayHello(String name) {
				System.out.println("Hello " +name);
				
			}
		};
		greet(ge, "Gautam");
		greet(n->System.out.println("Hello..."+n),"ABCD");
	}
	private static void greet(Greeting greeting,String name){
		greeting.sayHello(name);
	}

}
