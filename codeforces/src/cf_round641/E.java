package cf_round641;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;



public class E {
	public static class pair implements Comparable<pair> {
		int i;
		int j;

		pair(int x, int y) {

			i = x;
			j = y;

		}

		public pair() {

		}

		public int compareTo(pair o) {
			// TODO Auto-generated method stub

			return this.i - o.j;
		}
	}

//	static int mod = (int) 998244353.;
	static int mod=(int)1e9+7;
	static ArrayList<Integer> gr[];
	static int  ar[][];
	static Scanner sc = new Scanner(System.in);
	static int pri[] = new int[(int) 1e6 + 5];
	static StringBuilder out = new StringBuilder();

	static int[][] dp;

	static int n;
	static int m;
	
	static int dx[]= {-1,0,1,0};
	static int dy[]= {0,-1,0,1};
	public static void main(String[] args) throws IOException {
		int t =1;// sc.nextInt();
		
		while (t-- > 0) {
			 n=sc.nextInt();
			 m=sc.nextInt();
			int q=sc.nextInt();
			ar=new int [n+1][m+1];
			
			for(int i=1;i<=n;i++) {
				String s=sc.next();
				for(int j=1;j<=m;j++) {
					if(s.charAt(j-1)=='0')
					ar[i][j]=0;
					else ar[i][j]=1;
				}
			}
			
			dp=new int [n+1][m+1];
			
			for(int [] row:dp) {
				Arrays.fill(row, -1);
			}
			Queue<pair> que= new LinkedList<>(); 
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=m;j++) {
					for(int dr=0;dr<4;dr++) {
						int r=i+dx[dr];
						int c=j+dy[dr];
						if(r>0 && c>0 && r<=n && c<=m) {
							if(ar[i][j]==ar[r][c]) {
								que.add(new pair(i,j));
								dp[i][j]=0;
								break;
							}
						}
					}
				}
			}
			
			while(!que.isEmpty()) {
				pair p=que.poll();
				int x=p.i;
				int y=p.j;
				for(int dr=0;dr<4;dr++) {
					
					int r=x+dx[dr];
					int c=y+dy[dr];
					if(r>0 && c>0 && r<=n && c<=m) {
						if(dp[r][c]==-1) {
							que.add(new pair(r,c));
							dp[r][c]=dp[x][y]+1;
						}
					}
					
					
				}
			}
			while(q-->0) {
				int i=sc.nextInt();
				int j=sc.nextInt();
				long p=sc.nextLong();
				if(dp[i][j]==-1 || p<dp[i][j] ||  (p-dp[i][j])%2==0) {
					out.append(ar[i][j]);
				}else {
					out.append(ar[i][j]^1);
				}
				out.append("\n");
			}
			

				
			}
			System.out.println(out);
		

	}

	static boolean check(int i, int j) {
		if(i<1 || j<1 ||i>n || j>m) return false;
		return true;
	}


}
