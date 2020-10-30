package cf_round639;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
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
			int m=sc.nextInt();
			System.out.println(n+m);
		}
		System.out.println(out);

	}
	public static int solution(String n, int b) {
		int k = n.length();
		int al[]=new int [k];
	
		for (int i = 0; i < k; i++) {
			al[i]=(n.charAt(i) - 48);
		}
		HashMap<Long, Integer> hs = new HashMap<>();
		int cnt = 0;
		while (true) {
			cnt++;
			Arrays.sort(al);
			int a[]=new int[k];
			int[] ans = new int[k];
			ans = sol(a, al, b);
			long no = bc(ans, b);
			if (hs.containsKey(no)) {
				return cnt - hs.get(no);
			} else
				hs.put(no, cnt);
			al = ans;
		}
	}

	static int [] sol(int [] a, int [] b, int base) {
		for(int i=0;i<b.length;i++) {
			a[i]=b[b.length-1-i];
		}
		int [] ans = new int[a.length];
		int borrow = 0;
		for (int i = a.length - 1; i >= 0; i--) {
			int n1 = a[i];
			int n2 = b[i];
			n1 -= borrow;
			if (n1 < n2) {
				ans[i]=(n1 + base - n2);
				borrow = 1;
			} else {
				ans[i]=(n1 - n2);
				borrow = 0;
			}
		}
		return ans;
	}

	public static long bc(int[] s, int base) {
		long ans = 0;
		int pow = 1;
		for (int i = s.length-1; i >=0; i--) {
			ans += s[i] * pow;
			pow *= base;
		}
		return ans;
	}
}
