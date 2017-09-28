package hackerRank;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class positiveNegativeeroFractions {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Enter the size of array");
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		int size=Integer.parseInt(br.readLine());
		double positive=0, negative=0,zero=0;
		double pf=0, nf=0,zf=0;
		int [] arr=new int [size];
		
		for(int i=0;i<size;i++){
			arr[i]=Integer.parseInt(br.readLine());
			
			float ch =arr[i];
			
			if(ch>0){
				positive++;
			}
			else if(ch<0){
				negative++;
			}
			else if(ch==0){
				zero++;
			}
			
		}
		pf=positive/size;
		
		
		nf=negative/size;
		zf=zero/size;
		System.out.printf("%.4f", pf);
		System.out.println();
		System.out.printf("%.4f", nf);
		System.out.println();
		System.out.printf("%.4f", zf);
	

	}

	

}
