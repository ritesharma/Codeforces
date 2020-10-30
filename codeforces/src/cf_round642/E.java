package cf_round642;

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

			return this.ans - o.ans;
		}
	}

//	static int mod = (int) 998244353.;
	static int mod=(int)1e9+7;
	static ArrayList<Integer> gr[];
	static int  ar[];
	static Scanner sc = new Scanner(System.in);

	static StringBuilder out = new StringBuilder();

	static int[] dp;

	public static void main(String[] args) throws IOException {
		int t = sc.nextInt();
		
		while (t-- > 0) {
		
			int n=sc.nextInt();
			int k=sc.nextInt();
			String s=sc.next();
			int dp[][]=new int[n][2];
			int pre[]=new int[n];
			pre[0]=s.charAt(0)=='0'?0:1;
			for(int i=1;i<n;i++) {
				pre[i]=pre[i-1];
				if(s.charAt(i)=='1')pre[i]++;
			}
			
			for(int i=0;i<n;i++) {
				if(s.charAt(i)=='0') {
					if(i==0) {
						dp[i][1]=1;continue;
					}
					if(i-k<0) {
						dp[i][0]=Math.min(dp[i-1][0], dp[i-1][1]);
						dp[i][1]=pre[i-1]+1;
					}
					else {
						dp[i][0]=Math.min(dp[i-1][0], dp[i-1][1]);
						dp[i][1]=Math.min(pre[i-1], dp[i-k][1]+pre[i-1]-pre[i-k])+1;
						
					}
					
				}
				else {
					
					if(i==0) {
						dp[i][0]=1;continue;
					}
					if(i-k<0) {
						dp[i][0]=Math.min(dp[i-1][0], dp[i-1][1])+1;
						dp[i][1]=pre[i-1];
					}
					else {
						dp[i][0]=Math.min(dp[i-1][0], dp[i-1][1])+1;
						dp[i][1]=Math.min(pre[i-1], dp[i-k][1]+pre[i-1]-pre[i-k]);
						
					}
				}
			}
			System.out.println(Math.min(dp[n-1][0], dp[n-1][1]));
			
	}

	}


}
