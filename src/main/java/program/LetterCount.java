package program;

import org.apache.commons.lang3.StringUtils;

public class LetterCount {

	public static void main(String[] args) {
		countChar("Hello World");
		characterFrequencyDemo("Hello World");
		
		String name = "GAUTAM";
		String tempName = "";
		for(int i=0 ; i<name.length() ; i++){
			int count =1;
			if(StringUtils.contains(tempName, name.charAt(i))){
				System.out.println(name.charAt(i)+" = "+count++);
			}
			if(!StringUtils.contains(tempName, name.charAt(i))){
				System.out.println(name.charAt(i)+" = "+count++);
				tempName = tempName + name.charAt(i);
			}
		}
	}
	static void countChar(String str){
		int[] counts = new int[(int) Character.MAX_VALUE];
		for (int i = 0; i < counts.length; i++) {
		    if (counts[i] > 0)
		        System.out.println("Number of " + (char) i + ": " + counts[i]);
		}
	}
	//character frequency demo
	static void characterFrequencyDemo(String str){
		char[] c = str.toCharArray();
		int counter = 0;
		for(int i=0; i<str.length(); i++){
			for(int j=0; j<str.length(); ++j){
				if(c[j] == c[i]){
					counter++;
				}
			}
			System.out.println("The character "+ c[i] + "is present "+counter+"times");
		}
	}
}
