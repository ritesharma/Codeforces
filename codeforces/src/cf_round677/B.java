package cf_round677;

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

	static int mod = (int) 1e9 + 7;
	static ArrayList<Integer> gr[];
	static int ar[];
	static Scanner sc = new Scanner(System.in);
	static int pri[] = new int[(int) 1e6 + 5];
	static StringBuilder out = new StringBuilder();

	static int dp[];

	public static void main(String[] args) throws IOException {
		int t = sc.nextInt();

		while (t-- > 0) {

			int n=sc.nextInt();
			
		int a[]=new int[n];
		boolean ok=false ;
		int l=0,r=n-1;
		int cnt=0;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			
			if(a[i]==1)cnt++;
		}
			
		
		while(a[l]==0) {
			l++;
		}
		
		while(a[r]==0) {
			r--;
		}
		
		
		int ans1=0;
		int ans2=0;
	     cnt=0;
		for(int i=l;i<=r;i++) {
			
			if(a[i]==0)cnt++;
		}
		
		
		out.append(cnt+"\n");
	
		}
		System.out.println(out);

	}


}
