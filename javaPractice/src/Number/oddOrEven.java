package Number;

public class oddOrEven {

	public static void main(String[] args) {
		isOddEven(679);
	}

	
	
	public static void isOddEven(int user_input) {
		
		//Scanner s = new Scanner(System.in);
		//System.out.println("Enter a number : ");
		
		//int user_input = s.nextInt();
		
		if(user_input%2==0) {
			System.out.println(user_input + " is Even!!");
		}
		else
		{
			System.out.println(user_input + " is Odd!!");
		}
		
		
	}
}
