package educational_cf86;

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

	static int mod = (int) 998244353.;
	static ArrayList<Integer> gr[];
	static int ar[];
	static Scanner sc = new Scanner(System.in);
	static int pri[] = new int[(int) 1e6 + 5];
	static StringBuilder out = new StringBuilder();

	static int dp[];
	
	
		public static void main(String[] args) throws IOException {
		int t =  sc.nextInt();
	
		while (t-- > 0) {
			long x=sc.nextLong();
			long y=sc.nextLong();
			long a=sc.nextLong();
			long b=sc.nextLong();
			long diff=Math.abs(x-y);
			long ans=diff*a;
			long min=Math.min(x, y);
			long max=Math.max(x,y);
			long ans1=a*diff+max*b;
			long ans2=diff*a+2*min*a;
			long ans3=diff*a+b*min;
			long res=Math.min(ans1, Math.min(ans2, ans3));
			out.append(res+"\n");
			
		}
		System.out.println(out);

	}
	
}
