package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DupCharInString {

	public static void main(String[] args) {
		checkDupChar("baaarbaarbaar baarbaarbaar");
	}

	public static void checkDupChar(String input) {
		char[] chararr = input.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (char ch : chararr) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		Set<Character> set = map.keySet();
		for (char sh : set) {
			if (map.get(sh) > 1) {
				System.out.println(sh + " occurance is " + map.get(sh) + " times");
			}
		}
	}
}
