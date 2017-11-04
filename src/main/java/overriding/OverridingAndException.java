package overriding;

import java.io.IOException;

class AAA{
	public void one() throws IOException
	{
		System.out.println("AAA one");
	}
}
class BBB extends AAA{
	
	public void one() throws ArithmeticException{
		System.out.println("BBB one");
	}
	
}

public class OverridingAndException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
