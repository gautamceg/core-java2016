package amazon.socialMedia.bookReadSurvey;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BooksReadSurvey {

	private Map<String,Long> booksReadMap;

	private static List<PersonProfile> personProfileList;
	static{
		PersonProfile p1 =new PersonProfile();
		PersonProfile p2 =new PersonProfile();
		PersonProfile p3 =new PersonProfile();
		PersonProfile p4 =new PersonProfile();
		p1.setBooksName(Arrays.asList("bookA","bookB","bookC"));
		p2.setBooksName(Arrays.asList("bookA","bookD","bookE"));
		p3.setBooksName(Arrays.asList("bookA","bookD","bookC"));
		p4.setBooksName(Arrays.asList("bookA","bookP","bookC"));
		
		personProfileList = new ArrayList<>();
		personProfileList.add(p1);
		personProfileList.add(p2);
		personProfileList.add(p3);
		personProfileList.add(p4);
	}
	
	public Map<String,Long> prepareBooksReadMap(){
		booksReadMap = new HashMap<>();
		for(PersonProfile person : personProfileList){
			for(String bookName : person.getBooksName()){
				booksReadMap.put(bookName, (booksReadMap.get(bookName) !=null) ? (booksReadMap.get(bookName) + 1) : 1 );
			}
		}
		return booksReadMap;
	}
	
	
}
