package test;

public class Test8 {

	public static void main(String[] args) {
		int i=1;
		System.out.println(i==2 || i==3);
		System.out.println(SingletonDemo.getInstance() == SingletonDemo.getInstance());
		System.out.println(SingletonDemo.getInstance().getSomething());
		//-------------
		

	}

}

class SingletonDemo{
	private String SOME_THING = "something";
	private static SingletonDemo singletonDemo;
	private SingletonDemo(){};
	public static SingletonDemo getInstance(){
		if(singletonDemo==null)
			singletonDemo = new SingletonDemo();
		return singletonDemo;
	}
	public String getSomething(){
		return SOME_THING;
	}
	
}
class PrototypeDemo{
	
}
