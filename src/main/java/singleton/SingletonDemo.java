package singleton;

public class SingletonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonDemo s1 = new SingletonDemo();
		System.out.println("First= "+s1.getInstance1());
		s1= new SingletonDemo();
		
		System.out.println("Second= "+s1.getInstance1());
	}
	private static SingletonDemo singletonDemo;
	private SingletonDemo(){}
	public synchronized SingletonDemo getInstance1(){
		if(singletonDemo==null)
			return new SingletonDemo();
		return singletonDemo;
	}

}

