package cf_round678;

import java.io.*;
import java.util.*;
import java.util.Scanner;



public class A {

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
	static int ar[];
	static Scanner sc = new Scanner(System.in);
	static StringBuilder out = new StringBuilder();
	
	int n;


	public static void main(String[] args) throws IOException {
		int t = sc.nextInt();
		
	

		while (t-- > 0) {
			
			
			int n=sc.nextInt();
			int m=sc.nextInt();
			int a[]=new int[n];
			
			int sum=0;
			for(int i=0;i<n;i++) {
				
				a[i]=sc.nextInt();
			    sum+=a[i];
				
			}
			
			if(sum==m)out.append("YES\n");else out.append("NO\n");
			
			
			

		}
		
		System.out.println(out);
	}

}
