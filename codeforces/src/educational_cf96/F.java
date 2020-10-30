package educational_cf96;

import java.util.ArrayList;
import java.util.Scanner;



import java.util.*;
import java.io.*;

public class F {

	
	
	public static class pair implements Comparable<pair> {
		long f;
		long s,th;

		pair(long x, long y,long z) {

			f = x;
			s = y;
			th=z;

		}

		public pair() {

		}

		public int compareTo(pair o) {
			// TODO Auto-generated method stub

			return (int)this.f-(int)o.s;
		}
	}
	
	static int mod = (int) 1e9 + 7;
	static ArrayList<Integer> gr[];
	
	static Scanner sc = new Scanner(System.in);
	static int pri[] = new int[(int) 1e6 + 5];
	static StringBuilder out = new StringBuilder();
	static int n=0,k=0;
	static pair ar[];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  n=sc.nextInt();
		 k=sc.nextInt();
		
		
	 ar=new pair [n];
		for(int i=0;i<n;i++) {
			
			
			ar[i]=new pair(sc.nextLong(),sc.nextLong(),sc.nextLong());
			
		}
		
		dp=new long[n+1][k+1];
		
		for(long a[]:dp)Arrays.fill(a, -1L);
		
		
		
		long ans=solve(0,k)+k;
		System.out.println(ans>=(long)1e18?-1:ans);
		
		
		

	}
	
	static long dp[][];
	
	static long solve(int i,long rem) {
		
		if(i==n)return -rem;
		
		long req=Math.max(0, ar[i].th-rem);
		
		
		long l=ar[i].f,r=ar[i].s;
		long max=(r-l)*k;
		
		if(req>max)return (long)1e18;
		
		if(dp[i][(int)rem]!=-1L)return dp[i][(int)rem];
		
		long ans=(long)1e18;
		
		long val=(req+k-1)/k;
		
		if(req==0) {
			
			ans=Math.min(ans, solve(i+1,rem-(ar[i].th)));
			
			if(val<(r-l)) 
			
			ans=Math.min(ans, solve(i+1,k)+k);
			
			
		}
			
		else {
			
			ans=Math.min(ans, solve(i+1,(k*val-req))+k*val);
			
			if(val<(r-l)) {
				
				ans=Math.min(ans, solve(i+1,k)+k*(val+1));
			}
			
		}
			
			return dp[i][(int)rem]=ans;
		
		
		
	}

}
