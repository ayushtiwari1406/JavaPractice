package Strings;

public class DupWordsInString {

	public static void main(String[] args) {
		
		String Input = "JAVA IS THE LANGAUGE AND JAVA IS THE ISLAND";
		
		DupWordsInString DWS = new DupWordsInString();
		DWS.checkCharDup(Input);
		
	}
public void checkCharDup(String str) {
	
	str = str.toUpperCase();
	
	String[] strarr = str.split(" ");
	
	for(int i=0; i<strarr.length; i++) {
		
		for(int j=i+1; j<strarr.length; j++) {
			
			if(strarr[i].equalsIgnoreCase(strarr[j])) {
				System.out.println(strarr[i] + " is duplicate. ");
			}	
		}
	}
	
	
}
}
