package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RandomValHashCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("Gautam", 30);
		Employee e2 = new Employee("Manish", 40);
		Employee e3 = new Employee("Dipesh", 50);
		
		Map<Employee, String> map = new HashMap<>();
		map.put(e1, "Bhagalpur");
		map.put(e2, "Mujaffarpur");
		map.put(e3, "Jamshedpur");
		
		
		Employee findEmp = new Employee("Gautam", 30);
		System.out.println(map.get(findEmp));
		

	}

}

class Employee{
	private String name;
	private int age;
	
	
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	@Override
	public int hashCode() {
		/*final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;*/
		
		int result = new Random().nextInt(50);
		System.out.println(result);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
	
}
