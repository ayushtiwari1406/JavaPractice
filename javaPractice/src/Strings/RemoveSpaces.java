package Strings;

public class RemoveSpaces {

	public static void main(String[] args) {
		String result = removeSpace("Remove     the spaces in between");
		System.out.println(result);
	}

	public static String removeSpace(String in) {

		in = in.toLowerCase();
		String temp = " ";

		for (int i = 0; i < in.length(); i++) {

			// in = in.replace(" ", "");
			if (in.charAt(i) != ' ') {
				temp = temp + in.charAt(i);
				temp = temp.trim();
			}
		}

		// return in;
		return temp;
	}
}
