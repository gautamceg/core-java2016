package packA;

class Adefault{
	public int publicField = 1;
	protected int protectedField = 2;
	int defaultField = 3;
	private int priaveField = 4;
	
	public void publicMethod(){
		System.out.println("A.publicMethod");
	}
	protected void protectedMethod(){
		System.out.println("A.protectedMethod");
	}
	void defaultMethod(){
		System.out.println("A.defaultMethod");
	}
	private void privateMethod(){
		System.out.println("A.privateMethod");
	}
}
