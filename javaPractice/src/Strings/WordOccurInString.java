package Strings;

import java.util.HashMap;
import java.util.Map;
public class WordOccurInString {

	public static void main(String[] args) {
		String input = "java to test java code using java code compiler for java";
		Map<String,Integer> map = new HashMap<String,Integer>();
		for (String s : input.split(" ")) {
		if(map.containsKey(s)) {
			map.put(s, map.get(s)+1);
		}else {
			map.put(s,1);
		}
		}
		System.out.println(map);
		
		
}
	}

