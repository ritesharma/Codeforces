package cf_round639;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
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
	static int[][] ar;
	static Scanner sc = new Scanner(System.in);
	static int pri[] = new int[(int) 1e6 + 5];
	static StringBuilder out = new StringBuilder();

	static long dp[];

	public static void main(String[] args) throws IOException {
		int t =1;// sc.nextInt();
		
		while (t-- > 0) {
		
			int n=sc.nextInt();
			gr=new ArrayList[n];
			ar=new int [n][n];
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++)ar[i][j]=sc.nextInt();
			}
			for(int i=0;i<n;i++) {
				gr[i]=new ArrayList<>();
			}
			
			for(int i=0;i<n-1;i++) {
			for(int j=0;j<n;j++) {
				if(ar[i][j]==1) {
					gr[i].add(j);
				}
			    }
			
			}
			long ans=0;
			dp=new long[n];
			for(int i=0;i<n;i++) {
				if(dp[i]!=0)dp[i]=solve(0,-1);
			}
			System.out.println(ans%mod);
			
		}

		System.out.println(out);
	}
	
	
	
	
	static int set;
	static long solve(int root,int pa) {
		
		if(dp[root]!=0)return dp[root];
	
		int ans=0;
		for(Integer ch: gr[root]) {
			
			if(ch==pa)continue;
			ans+=solve(ch,root);
		}
		
		return dp[root]=ans+1;
	}


}
