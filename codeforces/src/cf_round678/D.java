package cf_round678;

import java.io.*;
import java.util.*;

public class D {

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

	static int mod = (int) 1e9 + 7;
	static ArrayList<Integer> gr[];
	static long ar[];
	static Scanner sc = new Scanner(System.in);

	static StringBuilder out = new StringBuilder();

	static long dp[];
	static int n;

	public static void main(String[] args) throws IOException {
		int t =1;// sc.nextInt();

		while (t-- > 0) {

			int n = sc.nextInt();
			gr = new ArrayList[n];
			for (int i = 0; i < n; i++)
				gr[i] = new ArrayList<>();

			for (int i = 0; i < n - 1; i++) {

				int u = sc.nextInt() - 1;
				int v = i + 1;

				gr[u].add(v);

			}

			ar = new long[n];
			
			
			for (int i = 0; i < n; i++) {
				ar[i] = sc.nextInt();
				
			}
			leaf=new long[n];
			dp=new long[n];
			ans=0;
			solve(0);
			
			System.out.println(ans);
			

		}
	}

	static long ans=0;
	
	static long leaf[];
	static void solve(int cu) {
		
		
		

		if(gr[cu].size()==0) {
			leaf[cu]=1;
		}
		dp[cu]=ar[cu];
		
		for (Integer ch : gr[cu]) {
			
			
			solve(ch);
			
			
			leaf[cu]+=leaf[ch];
			dp[cu]+=dp[ch];
			
		}
		ans=Math.max((dp[cu]+leaf[cu]-1L)/leaf[cu], ans);
		

	}

}
