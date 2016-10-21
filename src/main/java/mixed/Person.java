package mixed;

public class Person {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public Person setName(String name) {
		this.name = name;
		return this;
	}
	public int getAge() {
		return age;
		
	}
	public Person setAge(int age) {
		this.age = age;
		return this;
	}
	@Override
	public String toString() {
		return "My name is"+name+ "and my age is "+age;
	}
	
}
