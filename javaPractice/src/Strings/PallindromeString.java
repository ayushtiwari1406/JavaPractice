package Strings;

import java.util.Scanner;

public class PallindromeString {
private static Scanner s;
	public static void main(String[] args) {
 s = new Scanner(System.in);
 System.out.println("enter you string");
 String input = s.nextLine();
	String test = "";
	
	for (int i=input.length()-1; i >=0; i--) {
		test = test + input.charAt(i);
	}
	System.out.println("Input String : "+ input);
	System.out.println("Reversed String : " + test);
if(test.equalsIgnoreCase(test)) {
	System.out.println("Both the string mathced and its a Pallindrome");
}else {
	System.out.println("Both the string are not mathced and its not a Pallindrome");
}
}}
