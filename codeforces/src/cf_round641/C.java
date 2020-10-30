package cf_round641;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class C {

	public static class pair implements Comparable<pair> {
		int id;
		int ans;

		pair(int x, int y) {

			id = x;
			ans = y;

		}

		public pair() {

		}

		public int compareTo(pair o) {
			// TODO Auto-generated method stub

			return this.id - o.id;
		}
	}

//	static int mod = (int) 998244353.;
	static int mod=(int)1e9+7;
	static ArrayList<Integer> gr[];
	static int  ar[];
	static Scanner sc = new Scanner(System.in);
	static int pri[] = new int[(int) 1e6 + 5];
	static StringBuilder out = new StringBuilder();

	static int[] dp;

	public static void main(String[] args) throws IOException {
		int t =1;//sc.nextInt();
		while (t-- > 0) {
			int n=sc.nextInt();
			
			ar=new int[n];
			for(int i=0;i<n;i++) {
				ar[i]=sc.nextInt();
				
			}
			dp=new int[n];
			dp[n-1]=ar[n-1];
			 for(int i=n-2;i>=0;i-- ) {
				 dp[i]=(int)gcd(dp[i+1],ar[i]);
			 }
			 
			 long ans=ar[0];
			 for(int i=1;i<n;i++) {
				 ans=(ans*ar[i])/gcd(ans,ar[i]);
			 }
			 for(int i=1;i<n-1;i++) {
				 ans=(ans*dp[i])/gcd(ans,dp[i]);
			 }
			 System.out.println(ans);
			
		}

		System.out.println(out);
	}
	static long gcd(long a, long b) 
	{ 
	    if (b == 0) 
	        return a; 
	    return gcd(b, a % b);  
	      
	} 
	
	
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
	


}
