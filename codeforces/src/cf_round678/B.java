package cf_round678;

import java.io.*;
import java.util.*;

public class B {

	public static class pair implements Comparable<pair> {
		int f;
		int s;

		pair(int x, int y) {

			f = y;
			s = x;

		}

		public pair() {

		}

		public int compareTo(pair o) {
			// TODO Auto-generated method stub

			return this.s - o.s;
		}
	}

	
	static int pri[]=new int [(int)1e5+5];
	static void sieve() {
		pri[1]=1;
		for(int i=2;i<pri.length;i++) {
			pri[i]=i;
		}
		for(int i=2;i<Math.sqrt(pri.length);i++) {
			if(pri[i]!=i)continue;
			
				for(int j=i*i;j<pri.length;j+=i) {
					if(pri[j]==j)pri[j]=i;
				}
			
		}
	}
	
	
	static int mod = (int) 1e9 + 7;
	static ArrayList<Integer> gr[];
	static int ar[];
	static Scanner sc = new Scanner(System.in);

	static StringBuilder out = new StringBuilder();

	static int dp[];
	static int n;

	
	static boolean isPrime(int n)
	{
	    if(n==1)
	        return false;
	    for(int a=2;a<=Math.sqrt(n);a++)
	        if(n%a==0)
	            return false;
	    return true;
	}
	
	public static void main(String[] args) throws IOException {
		int t = sc.nextInt();
		
		while (t-- > 0) {
			
			int n=sc.nextInt();
			int ar[][]=new int[n][n];
			
			for(int i=0;i<n;i++) {
				
				for(int j=0;j<n;j++) {
					
					if(i==j) {
						ar[i][j]=1;continue;
						
					}
					
					if(n-i-1==j)ar[i][j]=4;
					
					
				}
			}
			int i=n/2;
			
			if(n%2!=0) {
				ar[0][i]=6;
				ar[i][0]=12;
				
				
			}
			for(i=0;i<n;i++) {
				
				for(int j=0;j<n;j++) {
					
					out.append(ar[i][j]+" ");
				}
				
				out.append("\n");
				
			}
		}
		
		
		System.out.println(out);
	}

}
