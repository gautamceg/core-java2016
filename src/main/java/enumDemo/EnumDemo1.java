package enumDemo;

public class EnumDemo1 {
	enum Mobile{
		APPLE, SAMSUNG, NOKIA;
	}
	public static void main(String[] args) {
		
		for(Mobile mobile : Mobile.values())
				System.out.println(mobile.values());
		Mobile m = Mobile.SAMSUNG;
		switch(m){
		case APPLE:
			System.out.println("apple");
			break;
		case SAMSUNG:
			System.out.println("samsung");
			break;
		case NOKIA:
			System.out.println("nokia");
			break;
		}
		

	}

}
