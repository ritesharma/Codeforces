package eduactional_cf97;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import java.util.*;
import java.io.*;

public class C {

	public static class pair implements Comparable<pair> {
		int f;
		int s;

		pair(int x, int y) {

			f = x;
			s = y;

		}

		public pair() {

		}

		public int compareTo(pair o) {
			// TODO Auto-generated method stub

			return (int) this.s - (int) o.s;
		}
	}
	
	static int visit[];

	static int mod = (int) 1e9 + 7;
	static ArrayList<Integer> gr[];
	
	static Scanner sc = new Scanner(System.in);
	static int pri[] = new int[(int) 1e6 + 5];
	static StringBuilder out = new StringBuilder();

	static void in(int a[], int n) {
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
	}

	static void buildGraph(int n, int m) {

		gr = new ArrayList[n];

		for (int i = 0; i < n; i++) {

			gr[i] = new ArrayList<>();

		}

		for (int i = 0; i < m; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();

			u--;
			v--;
			gr[u].add(v);
			gr[v].add(u);
		}

	}

	static void sort(int a[], int n) {

		ArrayList<Integer> al = new ArrayList<>();

		for (int i = 0; i < n; i++) {

			al.add(a[i]);
		}

		Collections.sort(al);

		for (int i = 0; i < n; i++) {

			a[i] = al.get(i);
		}
	}

	static int n;
	static int ar[];
	public static void main(String[] args) throws IOException {

		int t = sc.nextInt();
		while (t-- > 0) {

			n = sc.nextInt();

			ar = new int[n];
			in(ar, n);
			
			
			sort(ar,n);
			
			
			for(int [] a:dp)Arrays.fill(a, -1);
			
			int ans=solve(1,0);

			
			out.append(ans+"\n");
			
			

		}
		
		System.out.println(out);
	}
	
	static int dp[][]=new int[500][200];
	
	
	static int solve(int i,int j) {
		
		if(i>(n+n/2)) {
			
			if(j==n)return 0;
			else return (int)1e9;
		}
		
		if(j==n)return 0;
		
		if(dp[i][j]!=-1)return dp[i][j];
		int ans=(int)1e9;
		
		ans=Math.min(ans, solve(i+1,j+1)+Math.abs(i-ar[j]));
		
		ans=Math.min(ans, solve(i+1,j));
		
		return dp[i][j]=ans;
	}
	

}
