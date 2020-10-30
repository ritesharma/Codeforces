package cf_round637;

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

	static int mod = (int) 1e9 + 7;
	static ArrayList<Integer> gr[];
	static int ar[];
	static Scanner sc = new Scanner(System.in);
	static int pri[] = new int[(int) 1e6 + 5];
	static StringBuilder out = new StringBuilder();

	static int dp[];
	
	
		public static void main(String[] args) throws IOException {
		int t =  sc.nextInt();
		
		while (t-- > 0) {

int		n=sc.nextInt();
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int d=sc.nextInt();
			int x1=a-b;
			int x2=a+b;
			int y1=c-d;
			int y2=c+d;
			if(n*x1>y2)out.append("NO");
			else if(n*x2<y1)out.append("NO");
			else out.append("YES");
			out.append("\n");
		}
		System.out.println(out);


	}

}
