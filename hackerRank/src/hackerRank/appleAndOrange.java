package hackerRank;

import java.util.Scanner;

public class appleAndOrange {

	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		int s=in.nextInt();
		int t=in.nextInt();
		int a=in.nextInt();
		int b=in.nextInt();
		int m=in.nextInt();
		int n=in.nextInt();
		int [] apple=new int [m];
		int [] orange=new int [n];
		int countap=0;
		int countor=0;
		for(int i =0;i<m;i++){
			apple[i]=in.nextInt();
			
			if(((a + apple[i])<=t) && ((a+apple[i])>=s)){
				countap++;
			}
			
		}
		for(int i =0;i<n;i++){
			orange[i]=in.nextInt();
			if(((b + orange[i])<=t) && ((b+orange[i])>=s)){
				countor++;
			}
		}
		
		System.out.println(countap);
		System.out.println(countor);
	}

}
