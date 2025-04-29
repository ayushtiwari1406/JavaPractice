package Number;

import java.util.Scanner;

public class Fabonacci {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Inter the count of iteration for febonacci series");
		int iteration = s.nextInt();
		checkFabonacci(iteration);
	}
public static void checkFabonacci(int noofiteration) {
	
	int  next = 0 ; int first = 0; int second = 1;
	
	for(int i=0; i<=noofiteration;i++) {
		
		System.out.print(first + " ");
		next = first+second;
		first = second;
		second = next;
	}
	
}
}
