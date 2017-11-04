package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorDemo {

	public static void main(String[] args) {
		// ------------- Employee sor -----------
		Employee e1 = new Employee("A",99,35);
		Employee e2 = new Employee("B",33,25);
		Employee e3 = new Employee("C",55,21);
		List<Employee> emplist = new ArrayList<>();
		emplist.add(e1);
		emplist.add(e2);
		emplist.add(e3);
		
		Collections.sort(emplist);
		System.out.println(emplist);
		
		// ---------- String sort ---------
		List<String> strList = new ArrayList<>();
		strList.add("p");
		strList.add("l");
		strList.add("a");
		strList.add("z");
		Collections.sort(strList);
		System.out.println(strList);
		
		// ------------ User sort ---------------
		User u1 = new User("A",99,35);
		User u2 = new User("B",33,25);
		User u3 = new User("C",55,21);
		List<User> userList = new ArrayList<>();
		userList.add(u1);
		userList.add(u2);
		userList.add(u3);
		
		Collections.sort(userList, new UserComparator());
		System.out.println(userList);
		
		//-------------------Tree set and comparable and comparator
		Set<Employee> empSet = new TreeSet<>();
		empSet.add(e1);
		empSet.add(e2);
		empSet.add(e3);
		System.out.println(empSet);
		
		Set<User> userSet = new TreeSet<>(new UserComparator());
		userSet.add(u1);
		userSet.add(u2);
		userSet.add(u3);
		System.out.println(userSet);

	}

}
class UserComparator implements Comparator<User>{

	@Override
	public int compare(User o1, User o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}
