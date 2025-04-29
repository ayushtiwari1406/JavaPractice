package Array;

import java.util.ArrayList;

public class FirstAndLastEle {

	public static void main(String[] args) {
		String[] a = { "apple", "samsung", "nokia","XIOMI","123" };
		findElements(a);
	}

	public static void findElements(String[] input) {
 
		String firstElement = null;
		String LastElement = null;

		ArrayList<String> in = new ArrayList<String>();

		for (String i : input) {
			in.add(i);
		}

		if (!in.isEmpty()) {
			firstElement = in.get(0);
			LastElement = in.get(in.size() - 1);
		}
			
		System.out.println("First Element : " + firstElement);
		System.out.println("Last Element : " + LastElement);

	}

}
