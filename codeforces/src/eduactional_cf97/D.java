package eduactional_cf97;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
import java.io.*;

public class D {

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

	static int mod = (int) 1e9 + 7;
	static ArrayList<Integer> gr[];
	static int ar[];
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

	public static void main(String[] args) throws IOException {

		int t = sc.nextInt();
		while (t-- > 0) {
			
			
			
			int n=sc.nextInt();
			
			int ar[]=new int[n+1];
			in(ar,n);
			
			
			Queue<pair> q=new LinkedList<>();
			
			q.add(new pair(1,0));
			
			int ans=0;
			int i=1;
			
			while(!q.isEmpty()) {
				
				pair p=q.poll();
				
				ans=Math.max(ans, p.s);
				if(i<n) {
					
					q.add(new pair(ar[i],p.s+1));
					i++;
				}
				
				while(i<n &&  ar[i]>ar[i-1]) {
					
					q.add(new pair(ar[i],p.s));
					i++;
				}
				
			}
			out.append(ans+"\n");
		
			
		}
		
		System.out.println(out);
	}

}
