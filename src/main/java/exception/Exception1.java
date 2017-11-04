package exception;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(foo());

	}
	
	static int foo(){
		try{
			int a = 1/0;
			return a;
			
		}catch(ArrayIndexOutOfBoundsException aiofbex){
			System.out.println(aiofbex.getMessage());
			System.out.println("1 exception caught");
		}catch(ArithmeticException aex){
			System.out.println(aex.getMessage());
			System.out.println("2 exception caught");
		}
		return 0;
	}

}
