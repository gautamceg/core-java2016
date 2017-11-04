package test;

class Ag{
	public static void foo(){
		System.out.println("A foo");
	}
	public void boo(){
		System.out.println("A boo");
	}
	public void personalAg(){
		System.out.println("A personal");
	}
}

class Bg extends Ag{
	public static void foo(){
		System.out.println("B foo");
	}
	public void boo(){
		System.out.println("B boo");
	}
	public void showBg(){
		System.out.println("Show Bg");
	}
}
public class Test11 {

	public static void main(String[] args) {
		Ag a = new Bg();
		a.foo();
		a.boo();
		a.personalAg();
		

	}

}
