package cf_round636;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class D {

	public static class pair implements Comparable<pair> {
		int max;
		int min;

		int sum = 0;

		pair(int x, int y) {

			max = Math.max(x, y);
			min = Math.min(x, y);
			sum = max + min;

		}

		public pair() {

		}

		public int compareTo(pair o) {
			// TODO Auto-generated method stub

			return (this.max + this.min) - (o.max + o.min);
		}
	}

	static int mod = (int) 998244353.;
	static ArrayList<Integer> gr[];
	static int ar[];
	static Scanner sc = new Scanner(System.in);
	static int pri[] = new int[(int) 1e6 + 5];
	static StringBuilder out = new StringBuilder();

	static int dp[];
static int k;
	public static void main(String[] args) throws IOException {
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			 k=sc.nextInt();
			ar = new int[n];
			for (int i = 0; i < n; i++) {
				ar[i] = sc.nextInt();
			}
			dp=new int[2*k+5];
			pair p[] = new pair[n / 2];
			for (int i = 0; i < n / 2; i++) {
				p[i] = new pair(ar[i], ar[n-i-1]);
			}
			Arrays.parallelSort(p);
			for(int i=0;i<n/2;i++) {
				dp[p[i].sum]++;
			}
			
			int ans=Integer.MAX_VALUE;
			for(int i=1;i<=2*k;i++) {
				
				int ol=bsl(p,0,n/2-1,i);
				int or=bsr(p,0,n/2-1,i);
				int res=2*(n/2-1-or+ol-0)+or-ol+1-dp[i];
				ans=Math.min(res, ans);
				
			}

			System.out.println(ans);
		}
		System.out.println();

	}
	
	static int bsl(pair []p,int lo,int hi,int val) {
		int ans=hi;
		int i=hi;
		int mid=hi;
		while(lo<=hi) {
			 mid=(lo+hi)/2;
			if(p[mid].sum+(k-p[mid].min)>=val) {
				ans=mid-1;
				hi=mid-1;
			}
			else {
				lo=mid+1;
			}
		}
		return ans;
	}

	static int bsr(pair []p,int lo,int hi,int val) {
		int ans=lo;
		int i=lo;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(p[mid].sum-(k-p[mid].max)<=val) {
				ans=mid+1;
			
				lo=mid+1;
			}
			else {
				hi=mid-1;
			}
		}
		return ans;
	}

}
