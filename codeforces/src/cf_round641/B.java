package cf_round641;

	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.Scanner;
	
	
	
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
		static int mod=(int)1e9+7;
		static ArrayList<Integer> gr[];
		static int  ar[];
		static Scanner sc = new Scanner(System.in);
		static int pri[] = new int[(int) 1e6 + 5];
		static StringBuilder out = new StringBuilder();
	
		static int[] dp;
	
		public static void main(String[] args) throws IOException {
			int t = sc.nextInt();
			
			while (t-- > 0) {
				int n=sc.nextInt();
				ar=new int[n+1];
				for(int i=1;i<=n;i++) {
					ar[i]=sc.nextInt();
				}
				
				dp=new int[n+1];
				dp[1]=1;
				for(int i=1;i<=n;i++)dp[i]=1;
				for(int i=1;i<=n;i++) {
					
					for(int j=i+i;j<=n;j+=i) {
						if(ar[j]>ar[i])
						dp[j]=Math.max(dp[i]+1, dp[j]);
						
					}
				}
				int ans=0;
				for(int i=1;i<=n;i++)ans=Math.max(dp[i], ans);
				System.out.println(ans);
			}
	
		}
	
		
	
	}
