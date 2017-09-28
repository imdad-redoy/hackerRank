package hackerRank;

import java.util.Scanner;

public class stair {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		int size=s.nextInt();
		
		for(int i=1;i<=size;i++){
			for(int j=size-1;j>=i;j--){
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--){
				System.out.print("#");
			}
			System.out.println();
		}
		
		
	}

}
