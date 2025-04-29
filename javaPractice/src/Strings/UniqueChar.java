package Strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class UniqueChar {
	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("Please provide your string");
		String input = s.nextLine();
		uniqueCharCheck(input);
	}

	public static void uniqueCharCheck(String input) {

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
				System.out.println("charater duplicate: " + sh + " " + map.get(sh));
			} else if (map.get(sh) == 1) {
				System.out.println("charater unique: " + sh + " " + map.get(sh));
			}
		}

	}

	/*
	 * public static void uniqueCharCheck(String input) { Set<Character> sh = new
	 * HashSet<Character>(); char[] ch = input.toCharArray();
	 * 
	 * for (char a : ch) { sh.add(a); } System.out.println(sh + " ");
	 */
}
