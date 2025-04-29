package Number;

public class PrimeNumSeries extends PrimeNumber{

	public static void main(String[] args) {
 getPrime(10);
	}
	
	public static void getPrime(int num) {
		
		for (int i=0; i<=num; i++) {
			boolean ip = isPrime(i);
			
			System.out.println(i + " is prime: " + ip);
		}
	}

}
