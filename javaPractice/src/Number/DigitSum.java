package Number;

import java.util.Scanner;

public class DigitSum {
	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);

		System.out.println("Enter the number:");
		int input = s.nextInt();

		sumupdigits(input);

	}

	public static void sumupdigits(int number) {
		
		int sum = 0;
		int temp = number;
		while (temp > 0) {
			sum = sum + temp % 10;
			temp = temp / 10;
		}
		System.out.println("Sum of digits in " + number + " is :" + sum);
	}
}
