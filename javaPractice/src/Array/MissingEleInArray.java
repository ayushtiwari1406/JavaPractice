package Array;

public class MissingEleInArray {

	public static void main(String[] args) {
		int[] input = { 1, 2, 3, 5, 6, 4, 8, 9 }; //45
		int result = missingEleInArray(input);
		
		System.out.println("Missing number in Array : " + result);
	}

	public static int missingEleInArray(int[] a) {
		int n = a.length+1;
		int sum = 0;
		int total = n * (n+1) / 2;

		for (int in : a) {
			sum = sum + in;
		}

		int difference = total-sum;
		return difference;
	}

}
