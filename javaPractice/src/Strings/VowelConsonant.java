package Strings;

public class VowelConsonant {

	public static void main(String[] args) {
		String ip = "asdfghjklqwertyuiopzxcvbnmaaaa";
		checkVowelConsonant(ip);
	}
public static void checkVowelConsonant(String input) {
	input = input.toLowerCase();
	int vowel = 0, consonant = 0;
	char[] chararr = input.toCharArray();
	
	for(char a : chararr) {
		
		if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
			vowel++;
		}else {
			consonant++;
		}
	}
	System.out.println("Count of vowels in the string : " + vowel);
	System.out.println("Count of consonant in the string : " + consonant);
}
}
