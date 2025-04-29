package Strings;

import java.util.HashSet;
import java.util.Set;

public class DupWordsInString2 {

	public static void main(String[] args) {
		
		String Input = "JAVA IS THE LANGAUGE AND JAVA IS THE ISLAND and";
		
		DupWordsInString2 DWS = new DupWordsInString2();
		DWS.checkCharDup(Input);
		
	}
public void checkCharDup(String str) {
	
	str = str.toUpperCase();
	
	String[] strarr = str.split(" ");
	
	Set<String> set = new HashSet<>();
	
	for(String word:strarr) {
		if(set.add(word)==false) {
			System.out.println(word + " is duplicate.");
		}
	}
	
}
}
