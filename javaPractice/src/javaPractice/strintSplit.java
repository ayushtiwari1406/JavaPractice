package javaPractice;

public class strintSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a = "Current  I/ndia";
stringMethod(a);
	}

	public static void stringMethod(String a) {
	String ar = 	a.split("/")[1].trim();
		System.out.print(ar);
	}
	
}
