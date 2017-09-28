package hackerRank;

import java.util.Scanner;

public class kangaroo {

	public static void main(String[] args) {
		
		Scanner in =new Scanner (System.in);
		int x1=in.nextInt();
		int v1=in.nextInt();
		int x2=in.nextInt();
		int v2=in.nextInt();
		
		if(x1>=0 && x1<=10000 && x2>=0 && x2<=10000 && v1>=1 && v1<=10000 && v2>=1 && v2<=10000 && ((x1<x2 && v1>v2)||(x2<x1 && v2>v1))){
			for(int i=0;i<100;i++){
				if(x1==x2){
					System.out.println("YES");
				}
				x1+=v1;
				x2+=v2;
			}
		}
		
		else{
			System.out.println("NO");
		}
		
		
	}

}


// passes all test cases
/* if((x1<x2) && (v1<v2))
        System.out.println("NO");
    else
    {        
        if((v1!=v2) && ((x2-x1)%(v1-v2))==0)
            System.out.println("YES");
        else
            System.out.println("NO");

    }
		*/
