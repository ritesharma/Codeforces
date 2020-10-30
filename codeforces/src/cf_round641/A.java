package cf_round641;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class A {

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
	static int  ar[][];
	static Scanner sc = new Scanner(System.in);
	static int pri[] = new int[(int) 1e6 + 5];
	static StringBuilder out = new StringBuilder();

	static int[] dp;

	public static void main(String[] args) throws IOException {
		int t = sc.nextInt();
		
		while (t-- > 0) {
			long n=sc.nextInt();
			long k=sc.nextInt();
			boolean f=false;
			long n0=0;
			for(int i=2;i<=Math.sqrt(n);i++) {
				if(n%i==0) {
					
					f=true;
					n0=i;
					break;
				}
			}
			long ans=0;
			
			if(!f) {
				ans=(n+n+(2*(k-1)));
			}
			else {
				if(n%2==0) {
					ans=(long)(n+(2*k));
				}
				else {
					ans=(n+n0+(2*(k-1)));
				}
			}
			out.append(ans+"\n");
		}
		System.out.println(out);

	}

	


}
