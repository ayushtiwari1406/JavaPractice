package Number;

public class PrimeNumber {

	public static void main(String[] args) {

		boolean ip = isPrime(9);
		
		System.out.println("Prime condition for input number is : " + ip);
	}
public static boolean isPrime(int num) {
	
	for(int i=2; i<=num/2; i++) {
		
		if(num % i==0) {
			return false;
		}
	}
	return true;
	
}
}
