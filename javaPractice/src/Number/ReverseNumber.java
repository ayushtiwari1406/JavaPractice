package Number;

import java.util.Scanner;

public class ReverseNumber {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("Enter the number, you want the reverse of");

		int number = s.nextInt();
		int result = ReverseInt(number);
		System.out.println("Input number is: " + number);
		System.out.println("Reversed number is: " + result);
	}

	public static int ReverseInt(int number) {

		int rev = 0;
		int t = number;

		while (t > 0) {
			
			rev = rev * 10 + t % 10;
			t = t / 10;
		}

		return rev;

	}

}
