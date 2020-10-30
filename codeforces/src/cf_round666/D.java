package cf_round666;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;

public class D {

	static int mod = (int) 1e9 + 7;

	static int ar[];
	static Scanner sc = new Scanner(System.in);
	static StringBuilder out = new StringBuilder();

	static ArrayList<Integer> gr[];
	int n;

	static class pair implements Comparable<pair> {

		int f;
		int s;

		public pair(int a, int b) {
			f = a;
			s = b;
		}

		@Override
		public int compareTo(pair o) {
			// TODO Auto-generated method stub
			if (this.s == o.s)
				return o.f - this.f;
			return this.s - o.s;
		}

	}

	public static void main(String[] args) {
		// rite code start here
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
	
		s1=sc.next();
		s2=sc.next();
		
		
		int cnt=0;
		int ans=0;
		
		for(int ar[][] :dp){
			
			for(int a[]:ar)Arrays.fill(a, -1);
		}
		if(s2.charAt(0)==s2.charAt(1)){
			for(int i=0;i<n;i++){
				if(s1.charAt(i)!=s2.charAt(0))cnt++;
			}
			
			int val=n-cnt+Math.min(cnt, k)-1;
			
			 ans=(val*(val+1))/2;
		}
		else ans=solve(0,0,k);
		
		
		
		System.out.println(ans);
		
	}

	static int[][][] dp=new int[201][201][201];
	static String s1,s2;
	static int solve(int i,int cnt,int k){
		if(k==0 && i==s1.length()){
			return 0;
		}
		
		if(k<0)return (int)-1e9;
		if(i==s1.length())return 0;
		if(dp[i][cnt][k]!=-1)return dp[i][cnt][k];
		
		int ans=0;
		if(s1.charAt(i)==s2.charAt(0)){
			
			
			ans=Math.max(ans, solve(i+1,cnt+1,k));
			
			ans=Math.max(ans, cnt+solve(i+1,cnt,k-1));
			
			
			
		}
		else if (s1.charAt(i)==s2.charAt(1)){
			
			
			ans=Math.max(ans, cnt+solve(i+1,cnt,k));
			ans=Math.max(ans, solve(i+1,cnt+1,k-1));
			
		}
		else{
			
			ans=Math.max(ans, cnt+solve(i+1,cnt,k-1));
			ans=Math.max(ans, solve(i+1,cnt+1,k-1));
			ans=Math.max(ans, solve(i+1,cnt,k));
			
		}
		
		return dp[i][cnt][k]=ans;
		
	}


}
