package sep_18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class main { 
  static ArrayList<Integer> al=new ArrayList<>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0){
	    	int n=sc.nextInt();
	    	al=new ArrayList<>();
	    	if(solve(1,n,0)) {

	    		Collections.sort(al);
	    		for(Integer val:al) {
	    			System.out.print(val);
	    		}
	    		System.out.println();
	    	}
	    	else {
	    		System.out.println(-1);
	    	}
	    	
	    }
 	 }
public static boolean solve(int lst,int d,int sum) {
	if(d==0) {
		int sqrt=(int)Math.sqrt(sum);
		if(sqrt*sqrt==sum)
			return true; return false;
	}
	for(int i=lst;i<10;i++) {
		al.add(i);
	  int s=sum+i*i;
	  boolean ans=solve(i,d-1,s);
	  if(ans==true)return true;
	  al.remove(al.size()-1);
	}
	return false;
}
}
