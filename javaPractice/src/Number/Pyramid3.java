package Number;

import java.util.Scanner;

public class Pyramid3 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
Scanner s;
s = new Scanner(System.in);
System.out.println("entr the iteration");
int in = s.nextInt();
		for(int i=1; i<in;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
