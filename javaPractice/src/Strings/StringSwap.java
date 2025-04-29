package Strings;

public class StringSwap {

	public static void main(String[] args) {
String one = "Hello";
String two = "World";

//add both the string 
one = one+two;
System.out.println("one + two : " + one);

two = one.substring(0, (one.length()-two.length()));
System.out.println("two : " + two);

one = one.substring(two.length());
System.out.println("one : " + one);
	}

}
