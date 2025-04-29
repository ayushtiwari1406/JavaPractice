package Array;

public class DupStringInArray {

	public static void main(String[] args) {
String[] a = {"java","sql","JaVa","SQL","C++","C"};
dupStringInArray(a);
	}
	
public static void dupStringInArray(String[] ip) {
	
	for (int i = 0; i < ip.length; i++) {
		for (int j = i+1; j < ip.length; j++) {
			if(ip[i].equalsIgnoreCase(ip[j])) {
				System.out.println("Duplicate : "+ ip[i]);
			}
		}
	}
}
}
