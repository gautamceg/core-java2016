package multithreading;

class Q{
	int num;
	boolean produced = false;
	public synchronized void put(int num){
		if(produced){
			try{wait();}catch(Exception e){e.printStackTrace();}
		}
		this.num = num;
		System.out.println("PUT num: "+num);
		produced = true;
		notify();
	}
	public synchronized void get(){
		if(!produced){
			try{wait();}catch(Exception e){e.printStackTrace();}
		}
		System.out.println("GET num: "+num);
		System.out.println("-------------");
		produced = false;
		notify();
	}
}
//Producer
class Producer implements Runnable{

	Q q;
	public Producer(Q q) {
		this.q = q;
		Thread t = new Thread(this, "Producer");
		t.start();
	}
	@Override
	public void run() {
		int i=0;
		while(true){
			q.put(i++);
			try{Thread.sleep(500);}catch(Exception e){e.printStackTrace();}
		}
		
	}
	
}
//Consumer
class Consumer implements Runnable{
	Q q;
	public Consumer(Q q) {
		this.q = q;
		Thread t = new Thread(this, "Consumer");
		t.start();
	}
	@Override
	public void run() {
		while(true){
			q.get();
			try{Thread.sleep(5000);}catch(Exception e){e.printStackTrace();}
		}
		
	}
	
}
public class InterThread {

	public static void main(String[] args) {
		Q q = new Q();
		new Producer(q);
		new Consumer(q);

	}

}
