package Number;

import java.util.Scanner;

public class Factorial {
private static Scanner S;
	public static void main(String[] args) {

		int Fact = 1;
		 S = new Scanner(System.in);
		
	System.out.println("Enter the number you want the facorial of:");
	
	int number = S.nextInt();
	
	for (int i=1; i<=number; i++){
		Fact = Fact*i;
		
	}
	System.out.println(Fact);
	}

}
