package hackerRank;



	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;

	public class minMax {
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        long[] arr = new long[5];
	        long temp;
	            long max = 0, min= 0 , sum =0;
	            arr[0] = max = min = sum = in.nextLong(); //Read the first value outside the loop, to handle min calculation
	            for (int i = 1; i < 5; i++) {
	                arr[i] = in.nextLong();
	                if(arr[i]>max) {
	                	max = arr[i];
	                }
	                else if(arr[i]<min) { 
	                	min = arr[i];
	                }
	                sum += arr[i];
	            }
	            System.out.println( (sum - max) + " " + (sum - min));
	           
	        }
	}


