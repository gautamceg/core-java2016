package map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u1 = new User();
		u1.setId(1); u1.setName("aa");
		User u2 = new User();
		u2.setId(2); u2.setName("bb");
		User u3 = new User();
		u3.setId(3); u3.setName("cc");
		
		User testUser = new User();
		testUser.setId(3); testUser.setName("cc");
		User testUser1 = new User();
		testUser1.setId(2); testUser.setName("bb");
		
		Map<User,String> map = new HashMap<>();
		map.put(u1, "Pune");
		map.put(u2, "Bangalore");
		map.put(u3, "Kolkata");
		
		for(Entry<User, String> entry: map.entrySet()){
			System.out.println(entry.getKey().getId()+ entry.getKey().getName()+" : "+entry.getValue());
		}
		
		System.out.println("GET User :" + map.get(testUser));
		//System.out.println("GET User :" + map.get(testUser1));
		
		List<String> list = Arrays.asList("this", "that", "fat");
		for(String s: list)
			System.out.println(s);
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

	}

}


class User{
	private int id;
	private String name;
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
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		//return result;
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
		User other = (User) obj;
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
