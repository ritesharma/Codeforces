package cf_round643;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

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

			return this.ans - o.ans;
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
			int q=sc.nextInt();
			ar=new int[n];
			int add[]=new int[n+10];
			int re[]=new int[n+10];
			for(int i=0;i<n;i++) {
				ar[i]=sc.nextInt();
				add[ar[i]]++;
			}
			int []qu=new int[q];
			int val=0;
			
			while(q-->0) {
				int in=sc.nextInt();
				if(in<0) {
				if(Math.abs(in)<=n)
					re[Math.abs(in)]++;
					val++;
				}
				else {
		
					
					add[in]++;
					n++;
				}
			}
			for(int i=1;i<=n;i++) {
				if(add[i]>re[i]) {
					out.append(i+"\n");
					break;
				}
			}
			
		}
		System.out.println(out);
	}
	
			
		
	        
	
	  
}
