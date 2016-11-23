package org.test;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new A());
		t1.setPriority(5);
		t1.start();
		TT t2 = new TT();
		t2.setPriority(10);
		t2.start();
		
		t1.yield();
		

	}

}
class A implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
		System.out.println("thead is running....");
		}
		
	}
	
}

class TT extends Thread{
	public void run(){
		while(true)
		System.out.println("TT Is running ........>>>");
	}
}
