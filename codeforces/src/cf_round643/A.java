package cf_round643;

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
			long a=sc.nextInt();
			long b=sc.nextInt();
			long c=sc.nextInt();
			long d=sc.nextInt();
			if(a<=b)out.append(b+"\n");
			else if(d>=c)out.append(-1+"\n");
			else {
				a-=b;
				long val=c-d;
				long ans=a/val*c;
				long res=b+ans;
				if(a%val!=0)res+=c;
		
				out.append(res+"\n");
			}
		}
		System.out.println(out);
	}


}
