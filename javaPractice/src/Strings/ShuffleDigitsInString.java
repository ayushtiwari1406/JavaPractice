package Strings;

public class ShuffleDigitsInString {

	public static void main(String[] args) {

		
		String in = "0000002345678900011";
		StringBuilder digit = new StringBuilder();
		StringBuilder zeros = new StringBuilder();
		
		for (char ch : in.toCharArray()) {
			if(ch != '0') {
				digit.append(ch);
			}else {
				zeros.append(ch);
			}
		}
		System.out.println(digit.toString()+zeros.toString());
	}

}
