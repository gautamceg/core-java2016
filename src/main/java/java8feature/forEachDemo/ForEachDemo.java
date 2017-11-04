package java8feature.forEachDemo;

import java.util.Arrays;
import java.util.List;
//for each loop java 8
public class ForEachDemo {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(4,5,6,7,8);
		//previously 1
		for(int i=0; i<values.size(); i++){
			System.out.println(values.get(i));
		}
		//previously 2
		for(int i : values){
			System.out.println(i);
		}
		
		//java8
		values.forEach(i -> System.out.println(i));
	}

}
