package Array;

import java.util.Scanner;

public class SearchElement {
private static Scanner s;
	public static void main(String[] args) {
s = new Scanner(System.in);
System.out.println("enter the value you want to serach the index in given array.");
int target = s.nextInt();
int []a = {1,2,3,4,4,5,6,8,9,0,66,4};

searchElement(a,target);
//System.out.println("Index of "+ target + " in given array is : "+result);
	}
public static void searchElement(int []a , int target) {
	System.out.println("array size: "+ a.length);
	for (int i = 0; i<a.length; i++) {
		if(a[i]==target) {
			//return i;
			System.out.println("first indexe is : "+i);
		}
		/*
		 * for(int j = i+1; j<a.length; j++) { if(a[j]==target) {
		 * System.out.println("next indexes are : "+j); } break; }
		 */
	}
	
	
	
	
	//return -1;// if element not found
	System.out.println("element not found");
	
}
}
