package mixed;

public class HelloWorld {
	public static void main(String[] args){
		Person p = new Person();
		System.out.println(p.setName("gautam").setAge(30).toString());
	}
	public int square(int size){
		return size*size;
	}
	public int countChar(String input){
		int count = 0;
		for(int i=0;i<input.length();i++){
			if(input.charAt(i)=='a' || input.charAt(i)=='A')
				count++;
		}
		return count;
	}
	
}
