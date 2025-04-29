package Array;

public class SumofEleInArray {

	public static void main(String[] args) {
		int[] input = { 1, 10 };
		int result = sumofEleInArray(input);
		System.out.println(result);
	}

	public static int sumofEleInArray(int[] ip) {

		int sum = 0;

		for (int in : ip) {
			sum = sum + in;
		}

		return sum;
	}

}
