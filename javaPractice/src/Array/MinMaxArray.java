
package Array;

public class MinMaxArray {

	public static void main(String[] args) {
		int input[] = { 0, 1, 3, 4, 99999, 44, 2,-26 };
		minMaxArray(input);
	}

	public static void minMaxArray(int[] a) {

		int smallest = a[0];
		int largest = a[0];
		
		if(a.length == 0 ) {
			throw new IllegalArgumentException("Array must not be Empty.");
		}

		for (int num : a) {

			if (num < smallest) {
				smallest = num;
			}

			else if (num > largest) {
				largest = num;
			}
		}
		System.out.println("smallest : " + smallest);
		System.out.println("largest : " + largest);
	}
}
