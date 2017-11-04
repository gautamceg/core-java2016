package test;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		Map<Employee,String> map = new HashMap<Employee,String>();
		map.put(new Employee(111, "Krunal"), "MH");
		map.put(new Employee(222, "Rakesh"), "UK");
		map.put(new Employee(333, "Durgesh"), "BR");
		map.put(new Employee(444, "Gautam"), "KR");
		
		System.out.println(map.get(new Employee(444, "Gautam")));
		

	}

}

class Employee{
	private int id;
	private String name;
	public Employee() {	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		/*final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode()); */
		return 1;
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
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
