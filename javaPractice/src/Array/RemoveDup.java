
package Array;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDup {

	public static void main(String[] args) {
		int [] ip = {1,1,2,2,3,4,5,999,999,9999,999,6,7,70,0,0,0,0,0,7,7};
		removeDup(ip);
	}
public static void removeDup(int[] a) {
	Set<Integer> set = new HashSet<Integer>();
	
	for (int ip : a) {
		set.add(ip);
	}
	Iterator<Integer> it = set.iterator();
	
	while(it.hasNext()) {
		System.out.print(it.next()+ " ");
		
	}
}
}
