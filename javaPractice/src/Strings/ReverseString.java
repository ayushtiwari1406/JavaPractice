package Strings;

import java.util.Scanner;

public class ReverseString {
	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		System.out.println("Enter your String");

		String input = sc.nextLine();

		System.out.println("Input String: " + input);

		String result = revString(input);

		System.out.println("Reversed String: " + result);
	}

	public static String revString(String S) {

		String ch = "";

		for (int i = S.length() - 1; i >= 0; i--) {

			ch = ch + S.charAt(i);

		}

		return ch;
	}

}
