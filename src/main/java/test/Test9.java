package test;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(foo(1));

	}
	static int foo(int i){
		try{
			System.out.println("try");
			int x = 1/0;
			return 10;
		}catch(Exception e){
			System.out.println("catch");
			System.out.println(e.getMessage());
			return 20;
		}finally{
			System.out.println("finally");
			return 30;
		}
	}

}
