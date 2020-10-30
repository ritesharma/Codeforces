package cf_round637;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import java.util.*;

public class D {
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

	static boolean[][] dp;
	static String s[]= {
			"1110111", "0010010", "1011101", 
			"1011011", "0111010", "1101011", "1101111", "1010010", 
			"1111111", "1111011"}; 
	
		public static void main(String[] args) throws IOException {
		int t =1;//  sc.nextInt();
		
		
		while (t-- > 0) {

			int n=sc.nextInt();
			int k=sc.nextInt();
			
			
			String in[]=new String[n];
			for(int i=0;i<n;i++) {
				in[i]=sc.next();
				
			}
			dp=new boolean[n+1][k+1];
			
			int sum=0;
			dp[n][0]=true;
			boolean chk[][]=new boolean [n+1][10];
		
			int stickneed [][]=new int [n+1][10];
			for(int i=0;i<n;i++) {
				
			    for(int d=0;d<=9;d++) {
			    	chk[i][d]=fun(in[i],s[d]);
			    	if(chk[i][d]) {
			    		stickneed[i][d]=solve(in[i],s[d]);
			    	}
			    	else {
			    		stickneed[i][d]=Integer.MAX_VALUE;
			    	}
			    }
			}
			
			for(int i=n-1;i>=0;i--) {
			
				String s1=in[i];
				
				for(int j=0;j<=k;j++) {
					
					for(int d=0;d<=9;d++) {
					
						if(chk[i][d] &&   check(j,stickneed[i][d])&& dp[i+1][j-stickneed[i][d]])
							dp[i][j]=true;
					}
					
				}
		
			}
			
			
			
			int res[]=new int [n];
			boolean ans=true;
			
			
			
			for(int i=0;i<n;i++) 
			{
				boolean f=false;
				for(int d=9;d>=0;d--) {
					int need=stickneed[i][d];
					if(chk[i][d] &&   check(k,need)&& dp[i+1][k-need]) {
						res[i]=d;
						k-=need;
						f=true;
						break;
					}
				}
				if(!f) {ans=false;
				}
				
				out.append(res[i]);
			}
		if(ans)System.out.println(out);
		else System.out.println(-1);
			
			
		}
	//	System.out.println(out);

	}
		static boolean check(int j,int di) {
			if(di>j)return false;
			return true;
		}
		static boolean fun(String s,String dig) {
			
			for(int i=0;i<dig.length();i++) {
				if(s.charAt(i)=='1' && dig.charAt(i)=='0')return false;
			}
			return true;
		}
		static int solve(String s, String dig) {
			int di=0;
			
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)!=dig.charAt(i)) {
					di++;
				}
				
			}
			return di;
		
		}
		
	
}
