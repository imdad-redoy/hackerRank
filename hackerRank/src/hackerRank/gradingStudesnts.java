package hackerRank;

import java.util.Scanner;

public class gradingStudesnts {

	public static void main(String[] args) {

	Scanner in=new Scanner (System.in);
	int students=in.nextInt();
	int []a=new int [students];
	for(int i=0;i<students;i++){
		int marks=in.nextInt();
		int multiple = 0;
		if(marks>=0 && marks<=100){
			a[i]=marks;
			
	
			
			if(marks>=38){
				int m=marks;
				for(int j=1;j<=5;j++){
					if((m+j)%5==0){
						multiple=m+j;
					}
					
				}
				if((multiple-marks)<3){
					a[i]=multiple;
				}
				
			}
			
		}
		
	}
	
	for(int k=0;k<students;k++){
		System.out.println(a[k]);
	}
	
	
	}
}