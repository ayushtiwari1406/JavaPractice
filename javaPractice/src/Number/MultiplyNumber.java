package Number;

public class MultiplyNumber {

	public static void main(String[] args) {
		int input = 5;
		int iteration = 5;
		multiplyNumber(input, iteration);
	}

	public static void multiplyNumber(int input, int iteration) {
		int k = 0;
		int sum = 0;

		while (k < iteration) {
			sum = sum + input;
			k++;
		}
		System.out.println(sum);
	}
}
