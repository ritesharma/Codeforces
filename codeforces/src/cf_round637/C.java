package cf_round637;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
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

	static int mod = (int) 1e9 + 7;
	static ArrayList<Integer> gr[];
	static int ar[];
	static Scanner sc = new Scanner(System.in);
	static int pri[] = new int[(int) 1e6 + 5];
	static StringBuilder out = new StringBuilder();
	static int dp[];
	
	
		public static void main(String[] args) throws IOException {
		int t =  sc.nextInt();
		int a=0;
		while (t-- > 0) {

			int n = sc.nextInt();
			int p[] = new int[n];
			HashMap<Integer, Integer> hm = new HashMap<>();
			for (int i = 0; i < n; i++) {
				p[i] = sc.nextInt();
				hm.put(p[i], i + 1);
			}
			boolean bool = true;
			int rite = -1;
			boolean ghhj[] = new boolean[n + 1];
			for (int i = 1; i <= n; i++) {
				int sjdg = hm.get(i);
				if (rite == -1) {
					ghhj[sjdg] = true;
					if (sjdg + 1 == n + 1 || ghhj[sjdg + 1]) {
						rite = -1;
					} else {
						rite = sjdg + 1;
					}
				} else if (rite == sjdg) {
					ghhj[sjdg] = true;
					if (sjdg + 1 == n + 1 || ghhj[sjdg + 1]) {
						rite = -1;
					} else {
						rite = sjdg + 1;
					}
				} else {
					bool = false;
					break;
				}
			}
			out.append(bool ? "Yes\n" : "No\n");
			
		}
		System.out.println(out);

	}


}
