package hackerRank;

import java.util.Scanner;

public class divisibleSumPair {
	 static int divisibleSumPairs(int n, int k, int[] a) {
		int count=0;
		 for(int i=0;i<n;i++){
			
			 for(int j=0;j<i;j++){
				 int sum =a[i];
				 sum+=a[j];
				 if(sum%k==0) count++;
			 }
		 }
		 
		 
		 return count;
	        // Complete this function
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int k = in.nextInt();
	        int[] ar = new int[n];
	        for(int ar_i = 0; ar_i < n; ar_i++){
	            ar[ar_i] = in.nextInt();
	        }
	        int result = divisibleSumPairs(n, k, ar);
	        System.out.println(result);
	    }
}
