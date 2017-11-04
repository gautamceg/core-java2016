package amazon.socialMedia.bookReadSurvey;

import java.util.List;

public class PersonProfile {

	private String name;
	private List<String> booksName;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getBooksName() {
		return booksName;
	}
	public void setBooksName(List<String> booksName) {
		this.booksName = booksName;
	}
	
	
}
