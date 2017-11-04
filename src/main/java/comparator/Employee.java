package comparator;

class Employee implements Comparable<Employee>{
	private String name;
	private int id;
	private int age;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int id, int age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int compareTo(Employee o) {
		if(this.getId() > o.getId())
			return 1;
		if(this.getId() == o.getId())
			return 0;
		return -1;
		
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", age=" + age + "]";
	}
	
	

}
