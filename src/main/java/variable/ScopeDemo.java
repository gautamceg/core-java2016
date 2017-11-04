package variable;

public class ScopeDemo {
	
	int a;
	int b;
	public void foo(){
		a=0;
		b=0;
		int c[]={0};
		bar(b,c);
		System.out.println(a+ " : " + b + " : " + c[0]);
	}
	
	public void bar(int b, int c[]){
		a=1;
		b=1;
		c[0]=1;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScopeDemo sd = new ScopeDemo();
		sd.foo();

	}
	
}
