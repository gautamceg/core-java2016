package test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map = new HashMap<>();
		System.out.println(map.put(1,"one"));
		System.out.println(map.put(1,"two"));
		Set<String> set = new HashSet<>();
		System.out.println(set.add("hello"));
		System.out.println(set.add("hello"));
		System.out.println("==============");
		
		Map<Integer,String> tmap = new TreeMap<>();
		tmap.put(2, "two");
		tmap.put(1, "one");
		System.out.println(tmap);
		System.out.println(tmap.containsValue("one"));
	}

}
