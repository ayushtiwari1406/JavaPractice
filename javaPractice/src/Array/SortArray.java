package Array;

public class SortArray {

	public static void main(String[] args) {
		int[] a = { 1, 2, 5, 6, 87, 999, 34, 3, 4, 9, 7, 0 };
		sortArray(a);
	}

	public static void sortArray(int[] a) {
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] > a[i]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int num : a) {
			System.out.print(num + " ");
		}
	}

}
