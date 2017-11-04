package comparator;

class User {
	private String name;
	private int id;
	private int age;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String name, int id, int age) {
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
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", age=" + age + "]";
	}
	
	
}
