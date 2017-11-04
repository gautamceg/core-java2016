package amazon.socialMedia.bookReadSurvey;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class DemoMain {

	public static void main(String[] args) {
		BooksReadSurvey bsr = new BooksReadSurvey();
		Map<String,Long> booksMap = bsr.prepareBooksReadMap();
		System.out.println("Un-sorted Map: "+booksMap);
		
		//short HashMap based by value
		System.out.println("Sorted by value: "+sortByValue(booksMap));
		

	}
	
	public static Map<String,Long> sortByValue(Map<String,Long> unsortedMap){
		
		List<Map.Entry<String,Long>> list = new LinkedList<>(unsortedMap.entrySet());
		
		Collections.sort(list, new Comparator<Map.Entry<String,Long>>() {

			@Override
			public int compare(Entry<String, Long> o1, Entry<String, Long> o2) {
		
				return - o1.getValue().compareTo(o2.getValue());
			}
		});
		
		Map<String,Long> sortedMap = new LinkedHashMap<>();
		for(Map.Entry<String, Long> entry : list){
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}

}
