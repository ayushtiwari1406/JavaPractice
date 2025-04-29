package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DupWordInString {

	public static void main(String[] args) {
		DupWordInString cd = new DupWordInString();
		
		String input = "JAVA IS THE LANGAUGE AND JAVA IS THE ISLAND and java is very famous";
		cd.checkDups(input);
	}

	public void checkDups(String str) {
		
		str = str.toUpperCase();
		String [] strarr = str.split(" ");
		
		Map<String,Integer>map = new HashMap<String,Integer>();	
		
		for(String str1 :strarr ) {
			
			if(map.containsKey(str1)){
				map.put(str1, map.get(str1)+1);
			}
			else {
				map.put(str1, 1);
			}
		}
				
		Set<String> set = map.keySet();
		for(String word:set) {
			if(map.get(word)>1) {
				System.out.println(word +" occurance : "+map.get(word));
			}
			else {
				System.out.println(word + " is Unique.");
			}
		}
	}
}
