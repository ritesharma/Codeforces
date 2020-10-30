package cf_round640;

	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.Scanner;
	import java.util.Stack;
	
	public class B {
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
		static int mod = (int) 1e9 + 7;
		static ArrayList<Integer> gr[];
		static int[] ar= {
				4,1,2,5,8,3,1,9,7
		};
		static Scanner sc = new Scanner(System.in);
		static int pri[] = new int[(int) 1e6 + 5];
		static StringBuilder out = new StringBuilder();
	
		 static int dp[][];
	
		
		public static void main(String[] args) throws IOException {
			int t = 1;// sc.nextInt();
	
			while (t-- > 0) {
				int n=sc.nextInt();
				
				ar=new int[n];
				for(int i=0;i<n;i++) {
					ar[i]=sc.nextInt();
				}
				int k=sc.nextInt();
				dp=new int[n+1][k+1];
				for(int i=0;i<n;i++) {
					for(int j=0;j<dp[0].length;j++)dp[i][j]=-1;
				}
			System.out.println(fun(n,k));
			
			}
	
			
			
			System.out.println(out);
		}
		
	
		static int ans=Integer.MAX_VALUE;
		static int  solve(int id,int k) {
		
			if(id<0) {
				if(k>=0)return 0;
				else return -10000;
			}
			if(k==0)return 0;
			if(dp[id][k]!=-1)return dp[id][k];
			int ans=Integer.MIN_VALUE;
			ans=Math.max(solve(id-2,k-1)+ar[id], ans);
			ans=Math.max(solve(id-1,k), ans);
			return dp[id][k]=ans;
		}
		
		static int fun(int n,int k) {
			int dp[][]=new int[n+1][k+1];
			
			for(int i=1;i<=n;i++) {
				
				for(int j=1;j<=k;j++) {
					dp[i][k]=-10000;
				}
			}
			
			dp[0][0]=0;
			
			dp[0][0]=0;
			for(int i=1;i<=n;i++) {
				
				for(int j=1;j<=Math.min(i, k);j++) {
					if(i==1) {
						dp[i][j]=ar[i-1];continue;
					}
					dp[i][j]=Math.max(dp[i-2][j-1]+ar[i-1],
							Math.max(dp[i-1][j],dp[i][j-1]));
				}
			}
			return dp[n][k];
		}
		
	}
	