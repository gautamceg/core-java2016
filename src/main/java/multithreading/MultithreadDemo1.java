package multithreading;

public class MultithreadDemo1 {

	public static void main(String[] args) {
		ReadWriteSave rws = new ReadWriteSave();
		Thread t1 = new Thread(rws);
		Thread t2 = new Thread(rws);
		Thread t3 = new Thread(rws);
		t1.start();t2.start();t3.start();
		
	}

}

class ReadWriteSave implements Runnable{

	int counter;
	@Override
	public void run() {
		
		synchronized(this){
			System.out.println("Counter Readed value :"+Thread.currentThread().getName() + read());
			System.out.println("Write Counter value :"+Thread.currentThread().getName()  + write());
		}
	}
	
	private int read(){
		return counter;
	}
	private int write(){
		return counter++;
	}
	
	
}
