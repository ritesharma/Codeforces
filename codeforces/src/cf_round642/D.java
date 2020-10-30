package cf_round642;

import java.io.IOException;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;



public class D {

	public static class pair implements Comparable<pair> {
		int l;
		int r;

		pair(int x, int y) {

			l = x;
			r = y;

		}

		public pair() {

		}

		public int compareTo(pair o) {
			// TODO Auto-generated method stub

			if((this.l-this.r) == (o.l-o.r))return this.l-o.r;
			
			return (this.l-this.r) - (o.l-o.r);
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
			dp=new int[n+1];
			PriorityQueue<pair> q=new PriorityQueue<>();
			
			pair p=new pair(1,n);
			q.add(p);
			int cnt=1;
			while(!q.isEmpty()) {
				pair p1=q.poll();
				int l=p1.l;
				int r=p1.r;
				int val=p1.r-p1.l+1;
				
				if(l>r || r<l)continue;
				if(val%2!=0) {
					dp[(l+r)/2]=cnt;
					
					pair tem=new pair(l,(l+r)/2-1);
					q.add(tem);
					q.add(new pair((l+r)/2+1,r));
				}
				else {
					dp[(l+r-1)/2]=cnt;
					pair tem=new pair(l,(l+r-1)/2-1);
					q.add(tem);
					q.add(new pair((l+r-1)/2+1,r));
				}
				cnt++;
			}
			for(int i=1;i<=n;i++) {
				System.out.print(dp[i]+" ");
			}
			System.out.println();
		
	}

	
	}
}
