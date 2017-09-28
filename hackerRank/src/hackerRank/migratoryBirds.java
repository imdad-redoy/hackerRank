package hackerRank;

import java.util.Scanner;

public class migratoryBirds {
	   static int migratoryBirds(int n, int[] a) {
		   int one = 0,two = 0,three = 0,four = 0,five = 0;
		   int [] count=new int [6];
		   int max=0;
		   int res=0;
		   for(int i=0;i<n;i++){
			int temp=a[i];
			   count[temp]++;
		   }
		   for(int i=0;i<6;i++){
				if(max<count[i]){
					max=count[i];
					res=i;
				}
			   }
		   return res;
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] ar = new int[n];
	        for(int ar_i = 0; ar_i < n; ar_i++){
	            ar[ar_i] = in.nextInt();
	        }
	        int result = migratoryBirds(n, ar);
	        System.out.println(result);
	    }
	
}
