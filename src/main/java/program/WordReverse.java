package program;

public class WordReverse {
	static String str = "My name is Gautam @ 1";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(str);
		reverseString(str);
		

	}
	
	static void reverseString(String str){
		String [] words = str.split("\\s");
		String reversedWord="";
		for(String word : words){
			StringBuilder sb = new StringBuilder(word);
			reversedWord += sb.reverse().toString() + " ";
		}
		System.out.println(reversedWord);
	}

}
