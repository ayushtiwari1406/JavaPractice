package Strings;

public class SmallCaseLargeCase {

	public static void main(String[] args) {
		caseSensitive("To CHECK the CAse SenSITivITY");
	}
public static void caseSensitive(String ip){
	
	StringBuilder lowercase = new StringBuilder();
	StringBuilder uppercase = new StringBuilder();
	
	
	for(char ch: ip.toCharArray()) {
		if(Character.isLowerCase(ch)) {
			lowercase.append(ch);
		}else {
			uppercase.append(ch);
		}
	}
	System.out.print("Lower cases: "+lowercase);
	System.out.println();
	System.out.print("Uppercase cases: "+uppercase);
}
}
