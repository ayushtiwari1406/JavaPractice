package Array;

import java.util.HashSet;
import java.util.Set;

public class DupStringInArray2 {

	public static void main(String[] args) {
String[] a = {"java","sql","JaVa","c++","C++","C"};
dupString(a);
	}
	
public static void dupString(String[] ip) {
	
Set<String> set = new HashSet<String>();

for (String in : ip) {
	in = in.toLowerCase();
	if(set.add(in)==false) {
		System.out.println("Duplicate : "+ in);
	}
}
}
}
