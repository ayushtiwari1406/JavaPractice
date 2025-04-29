package Strings;

public class CharAtEvenIndex {

	public static void main(String[] args) {
		charAtEvenIndex("character at evne index");
	}
	
	public static void charAtEvenIndex(String in) {
		in = in.toLowerCase();
		System.out.println(in.length());
		
		for(int i=0; i <=in.length()-1; i++) {
			if(i%2==0) {
				System.out.print(in.charAt(i) + " ");
				//System.out.print(" ");
			}/*else {
				System.out.print("odd indexs: " + in.charAt(i));
			*/}
		}
		
	}

