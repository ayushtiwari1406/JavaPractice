
package Array;

import java.util.HashSet;
import java.util.Set;

public class ArrayCommonEle {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		int[] b = { 4, 5, 6, 8, 9, 0 };

		Set<Object> result = findCommon(a, b);
		System.out.println("common element :" +result);
	}

	public static Set<Object> findCommon(int[] a, int[] b) {

		Set<Object> set1 = new HashSet<Object>();
		Set<Object> common = new HashSet<Object>();

		for (int num : a) {
			set1.add(num);
		}

		for (int num : b) {
			if (set1.contains(num)) {
				common.add(num);
			}
		}
		return common;
	}

}
