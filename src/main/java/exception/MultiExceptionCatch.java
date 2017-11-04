package exception;

public class MultiExceptionCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(foo());

	}
	static int foo(){
		try{
			int a = 1/2;
			int x=1;
			do{
				System.out.println(x);
				x++;
			}while(x<5);
			return a;
			
		}catch(ArrayIndexOutOfBoundsException | ArithmeticException ex){
			System.out.println(ex.getMessage());
			System.out.println("exception caught");
		}
		return 0;
	}

}
