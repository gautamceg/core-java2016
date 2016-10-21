package exception;

import java.io.IOException;

public class ExceptionDemo {
	public static void main(String[] args) {
		
	}
}

class A{
	public void foo() throws IOException{
		
	}
}

class B extends A{
	@Override
	public void foo() throws IOException {
		// TODO Auto-generated method stub
		try {
			//super.foo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}