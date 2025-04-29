package Number;

import java.util.Scanner;

public class CountDigit {
	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = s.nextInt();
		int result = CountDigitInNumber(number);
		System.out.println("Digit count in given number :"+ result);
	}

	public static int CountDigitInNumber(int number) {

		int a = 0;
		if (number < 0) {
			number = number * -1;
		} else if (number == 0) {
			number = 1;
		}
		while (number > 0) {
			number = number / 10;
			a++;
		}
		return a;
	}
}
