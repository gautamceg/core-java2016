package passBy;

import java.util.ArrayList;
import java.util.List;

public class PassByDemo {

	public static void main(String[] args) {
		String s = "Hello";
		String strObj = new String("strObj");
		Integer inte = new Integer(10);
		Employee e = new Employee("Gautam");
		List<String> list = new ArrayList<>(); list.add("first");
		new PassByDemo().doSomeThing(e, s, strObj, inte, list);
		
		System.out.println(e.getName() + " : " 
							+ s + " : " 
							+ strObj + " : " 
							+ inte + " : "
							+ list);

	}
	
	void doSomeThing(Employee e, String s, String strObj, Integer i, List list){
		e.setName("Altered Name");
		s=s+"World";
		strObj=strObj + "World";
		i=i+10;
		list.add("second");
	}

}
