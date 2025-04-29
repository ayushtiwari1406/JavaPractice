package Number;

public class PallindromeNumber {

	public static void main(String[] args) {
		boolean result = isPallindrome(1);
		
		System.out.println("Is input number Pallindrome: "+ result);
	}
	
	public static boolean isPallindrome(int number) {
		int temp = number;
		int reverse = 0;
		
		while(temp>0) {
			reverse = reverse*10 + temp%10;
			temp = temp/10;
		}
		System.out.println("Input number: "+ number);
		System.out.println("Reversed number: "+reverse);
		if(number==reverse) {
			return true;
		}
		
		return false;
		
	}

}
