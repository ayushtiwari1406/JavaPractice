package Number;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int arm =0, temp,a,num=153;
		temp=num;
		while(temp>0) {
			a = temp%10;
			temp=temp/10;
			arm = arm+a*a*a;
		}
		if(arm==num) {
			System.out.println("armstrong number");
		}
		else {
			System.out.println("not an armstrong number");
		}
	}

}
