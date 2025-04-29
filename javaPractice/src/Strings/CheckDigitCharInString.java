package Strings;

public class CheckDigitCharInString {

	public static void main(String[] args) {
		
		String ip = "A14061995";
		boolean result = isNumeric(ip);
		System.out.println("Input string contaings only digits : "+ result);
		StringBuilder Digit = new StringBuilder();
		StringBuilder Char = new StringBuilder();
		
		
		for(char ch: ip.toCharArray()) {
			if(Character.isDigit(ch)) {
				Digit.append(ch);
			}else {
				Char.append(ch);
			}
		}
		System.out.print("Digit cases: "+Digit);
		System.out.println();
		System.out.print("Character cases: "+Char);
	}
public static boolean isNumeric(String ip) {
	for(char ch : ip.toCharArray()) {
		if(!Character.isDigit(ch)) {
			return false;
		}
	}
	return true;
}
}

