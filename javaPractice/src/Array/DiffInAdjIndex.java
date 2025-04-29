package Array;

public class DiffInAdjIndex {

	public static void main(String[] args) {
		int[] input = { 1, 2, 84, 7, 9, 70 };

		int diff = 0, sub = 0;

		for (int i = 1; i < input.length; i++) {

			sub = input[i] - input[i - 1];

			if (sub > diff) {
				diff = sub;
			}

		}
		System.out.println(diff);
	}

}
