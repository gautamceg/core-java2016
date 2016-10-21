package test;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Alpha{
	public String name ="someone";
	public int age = 20;
	private String email ="something@some";
	protected int id =111;
	int a=100;
}

class Beta extends Alpha{
	void print(){
		System.out.println("name "+name);
		System.out.println("age "+20);
		System.out.println("id "+id);
		System.out.println("a "+a);
	}
}
