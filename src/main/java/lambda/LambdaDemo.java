package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaDemo {

	public static void main(String[] args) {
		Person p1 = new Person("ba1", 10);
		Person p2 = new Person("a2", 20);
		Person p3 = new Person("za3", 30);
		Person p4 = new Person("a4", 40);
		Person p5 = new Person("xa5", 50);
		
		List<Person> personList = Arrays.asList(p1,p2,p3,p4,p5);
		System.out.println(personList);
		Collections.sort(personList, (P1,P2)->P1.getName().compareTo(P2.getName()));
		//Collections.sort(personList, (PP1)->);
		System.out.println(personList);
		
		personList.sort((P1,P2)->P2.getName().compareTo(P1.getName()));
		System.out.println(personList);
		
		List<String> list = Arrays.asList("a","b","z","t");
		list.replaceAll(operator->operator.toUpperCase());
		System.out.println(list);
		list.replaceAll(String::toUpperCase);
		System.out.println(list);
		
		//Two level comparison
		//list.sort(Comparator.comparing(Person::getAge).thenComparing(Person::getName()));
		
	}

}
