package cf_round677;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class F {

	
	static int n=0;
	static int m=0,k=0;
	static int [][][][]dp=new int[70][70][70][70];
	
	
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
	static int ar[][];
	static Scanner sc = new Scanner(System.in);
	static int pri[] = new int[(int) 1e6 + 5];
	static StringBuilder out = new StringBuilder();

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		n=sc.nextInt();
		m=sc.nextInt();
		k=sc.nextInt();
		ar=new int [n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				ar[i][j]=sc.nextInt();
				
			}
		}
		
		for(int a[][][]:dp) {
			
			for(int b[][]:a) {
				
				for(int c[]:b)Arrays.fill(c, -1);
			}
		}
		
		System.out.println(solve(0,0,m/2,0));
	}
	
	
	static int solve(int i,int j,int cnt,int sum) {
		if(cnt<0)return -(int)1e9;
		if(i==n) {
			return sum==0?0:-(int)1e9;
			
		}
		if(j==m)return solve(i+1,0,m/2,sum);
		
		if(dp[i][j][cnt][sum]!=-1)return dp[i][j][cnt][sum];
		
		
		int res=solve(i,j+1,cnt,sum%k);
		res=Math.max(res, solve(i,j+1,cnt-1,(sum+ar[i][j])%k)+ar[i][j]);
		
		return dp[i][j][cnt][sum]=res;
		
		
	}

}
