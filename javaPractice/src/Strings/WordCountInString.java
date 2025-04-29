package Strings;

public class WordCountInString {

	public static void main(String[] args) {
		String input = "TEST THE CODE in eclipse IDE";
		int count=0;

		/*
		 * for(int i=0; i<input.length(); i++) { if((input.charAt(i)==' ') &&
		 * (input.charAt(i+1) != ' ')) { count++; } }
		 */
		
		String [] arr = input.split(" ");
		
		for(int i=0;i<arr.length;i++) {
			count++;
		}
		
		
System.out.println(count);
	}

}
