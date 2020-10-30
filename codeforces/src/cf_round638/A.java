package cf_round638;

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
	static ArrayList<Integer> gr[];
	static long ar[];
	static Scanner sc = new Scanner(System.in);
	static int pri[] = new int[(int) 1e6 + 5];
	static StringBuilder out = new StringBuilder();

	//static long dp[];

	public static void main(String[] args) throws IOException {
		int t = sc.nextInt();
		
		while (t-- > 0) {

			int n=sc.nextInt();
			long a=0;
			long b=0;
		    a+=Math.pow(2, n);
		    b+=Math.pow(2, n-1);
		    n-=2;
		 int i=1;
		 while(i<=n/2) {
			 a+=Math.pow(2, i);
			 i++;
		 }
		 while(i<=n) {
			 b+=Math.pow(2, i);
			 i++;
		 }
		    out.append(Math.abs(a-b)+"\n");
			
			
			
			
		}

		System.out.println(out);
	}

	

}
