package cf_round641;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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

			return this.id - o.id;
		}
	}

//	static int mod = (int) 998244353.;
	static int mod=(int)1e9+7;
	static ArrayList<Integer> gr[];
	static int  ar[];
	static Scanner sc = new Scanner(System.in);
	//static int pri[] = new int[(int) 1e6 + 5];
	static StringBuilder out = new StringBuilder();

	static int[] dp;

	public static void main(String[] args) throws IOException {
		int t = sc.nextInt();
		
		while (t-- > 0) {
			int n=sc.nextInt();
			int k=sc.nextInt();
			
			ar=new int[n];
			int cnt=0;
			for(int i=0;i<n;i++) {
				ar[i]=sc.nextInt();
				if(ar[i]==k)cnt++;
			}
			if(cnt==0) {
				out.append("no\n");continue;
			}
			if(n==1 ) {
				if(ar[0]==k)out.append("yes\n");
				else out.append("no\n");
				continue;
			}
			 boolean ok=false;
		
			 for(int i=0;i<n-1;i++) {
				 if(ar[i]>=k && ar[i+1]>=k) {
					ok=true; 
				 }
			 }
			 for(int i=0;i<n-2;i++) {
				 if(ar[i]>=k && ar[i+2]>=k) {
					ok=true; 
				 }
			 }
			 
			 out.append(ok==true?"yes\n":"no\n");
		}
		System.out.println(out);

	}

	

}
