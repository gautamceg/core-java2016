package accessModifiers;

public class AccessModi {
	
	private void foo(){
		System.out.println("private foo");
	}

	public static void main(String[] args) {
		new AccessModi().foo();
	}

}
