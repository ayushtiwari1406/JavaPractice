package Array;

import java.util.ArrayList;

public class UniqueNumberInArray {

	public static void main(String[] args) {
		int[] input = {2,10,10,999,2,10};
		uniqueNumberInArray(input);
	}

	public static void uniqueNumberInArray(int[] in) {

		ArrayList<Integer> li = new ArrayList<Integer>();
		
		for (int i = 0; i < in.length; i++) {
			int k = 0;
			if (!li.contains(in[i])) {
				li.add(in[i]);
				k++;

				for (int j = i + 1; j < in.length; j++) {
					if (in[i] == in[j]) {
						k++;
					}
				} 
				if (k == 1) {

					System.out.println("unique : " + in[i]);
				}
			}

		}
	}

}
