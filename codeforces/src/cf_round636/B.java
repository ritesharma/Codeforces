package cf_round636;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class B {
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


			while (t-->0) {
				int n = sc.nextInt();
				if ((n / 2) % 2 == 1)
					out.append("NO");
				else {
					out.append("YES\n");
					int dp[] = new int[n];
					int v = 2;
					for (int i = 0; i < n / 2; i++) {
						dp[i] = v;
						v += 4;
					}
					int id = 0;
					for (int i = n / 2; i < n; i++) {
						if (id % 2 == 0)
							dp[i] = dp[id] + 1;
						else
							dp[i] = dp[id] - 1;
						id++;
					}
					for (int i = 0; i < n; i++)
						out.append(dp[i] + " ");
				}
				out.append("\n");
		}
		System.out.println(out);

	}

}
