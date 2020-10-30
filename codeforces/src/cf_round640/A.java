package cf_round640;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
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
	static long ar[];
	static Scanner sc = new Scanner(System.in);
	static int pri[] = new int[(int) 1e6 + 5];
	static StringBuilder out = new StringBuilder();

	//static long dp[];

	public static void main(String[] args) throws IOException {
		int t = sc.nextInt();
		
		while (t-- > 0) {
			int n=sc.nextInt();
			int cnt=0;
			int pow=1;
			ArrayList<Integer>al=new ArrayList<>();
			while(n!=0) {
				int rem=n%10;
				if(rem!=0) {
				al.add(rem*pow);
				cnt++;
				}
				n/=10;
				pow*=10;
				
			}
			out.append(cnt+"\n");
			Collections.reverse(al);
		for(int i=0;i<al.size();i++) {
			out.append(al.get(i)+" ");
		}
		out.append("\n");
		}

		System.out.println(out);
	}

	
}
