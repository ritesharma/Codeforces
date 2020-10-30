package cf_round638;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



public class C {
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
	static int[] ar;
	static Scanner sc = new Scanner(System.in);
	static int pri[] = new int[(int) 1e6 + 5];
	static StringBuilder out = new StringBuilder();

	//static long dp[];

	public static void main(String[] args) throws IOException {
		int t =sc.nextInt();
		
		while (t-- > 0) {

			int n=sc.nextInt();
			int k=sc.nextInt();
			String s=sc.next();
			char ch[]=s.toCharArray();
			Arrays.parallelSort(ch);
		  
		if(ch[0]!=ch[k-1]) {
			out.append(ch[k-1]+"\n");
			continue;
			
		}
		boolean f=true;
		for(int i=k+1;i<n;i++) {
			if(ch[i]!=ch[i-1]) {
				f=false;
				break;
			}
		}
		if(f) {
			int val=n-k;
			for(int i=0;i<n;i+=k) {
				out.append(ch[i]);
			}
		}
		else {
			out.append(ch[0]);
			for(int i=k;i<n;i++)out.append(ch[i]);
		}
		out.append("\n");
		
		}
		
		System.out.println(out);
	}

	
}
