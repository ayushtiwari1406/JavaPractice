package Array;

public class ArraySpecialChar {

	public static void main(String[] args) {

		String [] input = {"1","3","6","8","s","!"};
		int result= arraySpecialChar(input);
		System.out.println("Sum of only integers of array : " + result);
	}
public static int arraySpecialChar(String[] a) {
	
	
	int sum = 0;
	for (String ip : a) {
		try {
			int num = Integer.parseInt(ip);
			sum+=num;
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
	}
	return sum;
}
}
