package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest1 {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("A", 1);
		
		System.out.println(map.get("A"));
		System.out.println(map.get("B"));
		

	}

}
