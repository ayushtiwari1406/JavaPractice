package Array;

public class MaxInTwoDimArray {
	public static void main(String[] args){
				int[][] ip = {{1,2,3},{4,95,6},{7,8,9}};
				int result = maxInTwoDimArray(ip);
				System.out.println(result);
	}
	public static int maxInTwoDimArray(int [][] input) {
		
		int max = input[0][0];
		
		for(int i = 0;i<input.length;i++) {
			for(int j=0;j<input.length;j++) {
				//System.out.println(input[i][j]);
				if(input[i][j]>max) {
					max = input[i][j];
				}
			}
		}
		
		return max;
	}
}

