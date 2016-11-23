package org.program;

import java.util.HashMap;
import java.util.Map;

public class LetterCountDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "HELLO WORLD";
		char [] cArray = str.replaceAll("\\s", "").toCharArray();
		Map<Character, Integer> map = new HashMap<>(); 
		for(char c: cArray){
			if(map!= null && map.containsKey(c)){
				map.put(c, map.get(c)+1);
			}
			else
				map.put(c, 1);
		}
		System.out.println(map);

	}

}

/**
 * Hello World
H - 1
E - 1
L - 3
O - 2
W - 1
R - 1
D - 1
 */
