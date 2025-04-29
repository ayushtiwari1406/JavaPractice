package Strings;

public class CharOccuranceInString {

	public static void main(String[] args) {
		int result =charOccuranceInString("ABCDEFcccG",'c');
System.out.println(result);
	}

public static int charOccuranceInString(String S, char ch) {
	int count =0;
	S = S.toLowerCase();
	for (int i=0;i<S.length();i++){
		if(S.charAt(i)==ch) {
			count++;
		}
	}
	return count;
}
}
