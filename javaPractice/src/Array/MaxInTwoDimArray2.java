package Array;

public class MaxInTwoDimArray2 {
	public static void main(String[] args) {
		int[][] ip = { { 1, -2, 3 }, { 4, 95, 6 }, { 7, 8, 9 } };
		MaxInTwoDimArray(ip);
	}

	public static void MaxInTwoDimArray(int[][] input) {

		int min = input[0][0];
		int col = 0;
		int maxincol = 0;

		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				// System.out.println(input[i][j]);
				if (input[i][j] < min) {
					min = input[i][j];
					col = j;
				}
				for (int k = 0; k < input.length; k++) {
					if (input[k][col] > maxincol) {
						maxincol = input[k][col];
					}
				}
			}
		}
		System.out.println("Minimum value in the array : " + min);
		System.out.println("Maximum value in same column which hold minimum value in array : " + maxincol);
	}
}
