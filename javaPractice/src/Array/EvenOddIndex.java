package Array;

public class EvenOddIndex {

	public static void main(String[] args) {
		int[] a = {1, 2, 5, 6, 87};
		evenOddIndex(a);
	}
	public static void evenOddIndex(int[] ip) {
		
		int even = 0;
		int odd = 0;
		
		for (int i=0; i<ip.length;i++) {
			if(i%2==0) {
				even++;
				System.out.println("even : "+ip[i]);
			}else {
				odd++;
				System.out.println("odd : "+ip[i]);
			}
		}
		System.out.println("count of even index : "+ even);
		System.out.println("count of odd index : "+ odd);
	}

}
