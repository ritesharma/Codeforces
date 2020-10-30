package cf_round677;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class E {

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

	static int mod = (int) 1e9 + 7;
	static ArrayList<Integer> gr[];
	static int ar[];
	static Scanner sc = new Scanner(System.in);
	static int pri[] = new int[(int) 1e6 + 5];
	static StringBuilder out = new StringBuilder();

	static int dp[];

	static int n=0;
	public static void main(String[] args) throws IOException {
		int t =1;// sc.nextInt();

		
		long dp[]=new long[21];
		dp[1]=1L;
		
		
		for(int i=2;i<=20;i++) {
			
			dp[i]=dp[i-1]*i;
		}
		while (t-- > 0) {

			
			
			int  n=sc.nextInt();
			if(n==2) {
				System.out.println(1);continue;
			}
		
			long ans=(dp[n])/(dp[n/2]*dp[n/2]);
			
			ans=ans*dp[n/2-1]*dp[n/2-1];
			
			System.out.println(ans/2);
			
			
			
			
			
		}
		System.out.println(out);

	}
	
	
	


}
