package hackerRank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class timecoversion {
    static String timeConversion(String s) {
    	String hr=s.substring(0, 2);
    	int hrs=Integer.parseInt(hr);
    	String mode=s.substring(8,10);
        String min=s.substring(3, 5);
         int mins=Integer.parseInt(min);
        String sec=s.substring(6, 8);
         int secs=Integer.parseInt(sec);
         
        if(hrs>0 && hrs<13 && secs>=0 && secs<60 && mins>=0 && mins<60 ){
         if(mode.equals("PM")){
           if(hrs==12){
               hrs-=12;
           }
             hrs+=12;
            hr=Integer.toString(hrs);
        }
        
        return hr + s.substring(2,8);
        }
		return null;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}












/*public class Solution {

	  public static void main(String[] args) {
	        
			Scanner scan = new Scanner(System.in);
	        String time = scan.next();
	        String tArr[] = time.split(":");
	        String AmPm = tArr[2].substring(2,4);
	        int hh,mm,ss;
	        hh = Integer.parseInt(tArr[0]);
	        mm = Integer.parseInt(tArr[1]);
	        ss = Integer.parseInt(tArr[2].substring(0,2));
	        
	        String checkPM = "PM",checkAM ="AM";
	        int h = hh;
	        if(AmPm.equals(checkAM) && hh==12)
	        	h=0;
	        else if(AmPm.equals(checkPM)&& hh<12)
	        	h+=12;
	        
	        System.out.printf("%02d:%02d:%02d",h,mm,ss);
	    }
	}*/
