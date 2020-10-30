package cf_round636;

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
		int t = sc.nextInt();

		while (t-- > 0) {

			int n=sc.nextInt();
			int pow=2;
			int sum=3;
			
			while(n%sum!=0) {
				sum+=pow*2;
				pow*=2;
				
			}
			out.append(n/sum+"\n");
		}
		System.out.println(out);

	}

}
