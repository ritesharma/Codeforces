package cf_round642;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class F {

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
	static int mod = (int) 1e9 + 7;
	static ArrayList<Integer> gr[];
	static int ar[];
	static Scanner sc = new Scanner(System.in);
	static int pri[] = new int[(int) 1e6 + 5];
	static StringBuilder out = new StringBuilder();

	static int[] dp;

	public static void main(String[] args) throws IOException {
		int t = sc.nextInt();

		while (t-- > 0) {

			int n = sc.nextInt();
			int m = sc.nextInt();
			long a[][] = new long[n][m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					a[i][j] = sc.nextLong();
				}
			}

			long dp[][] = new long[n][m];
			long cost[][] = new long[n][m];
			for (int i = n - 1; i >= 0; i--) {
				for (int j = m - 1; j >= 0; j--) {
					if (i == n - 1 && j == m - 1) {
						dp[i][j] = a[i][j];

					} else if (i == n - 1) {
						long cost1 = 0;
						if (a[i][j] < dp[i][j + 1]) {
							dp[i][j] = a[i][j];
							cost1 = cost[i][j] = cost[i][j + 1]
									+ Math.abs((a[i][j] + 1) - dp[i][j + 1]) *(long) (n - 1 - i + (m - 1 - j));
						} else {

							dp[i][j] = dp[i][j + 1] - 1;
							cost1 = cost[i][j] = cost[i][j + 1] + Math.abs(dp[i][j] - a[i][j]);

						}
					} else if (j == m - 1) {
						long cost2 = 0;
						if (a[i][j] < dp[i + 1][j]) {
							dp[i][j] = a[i][j];
							cost2 = cost[i][j] = cost[i + 1][j]
									+ Math.abs((a[i][j] + 1) - dp[i + 1][j]) *(long) (n - 1 - i + (m - 1 - j));
						} else {

							dp[i][j] = dp[i + 1][j] - 1;
							cost2 = cost[i][j] = cost[i + 1][j] + Math.abs(dp[i][j] - a[i][j]);

						}

					} else {

						long cost1 = 0;
						if (a[i][j] < dp[i][j + 1]) {
							dp[i][j] = a[i][j];
							cost1 = cost[i][j] = cost[i][j + 1]
									+ Math.abs((a[i][j] + 1) - dp[i][j + 1]) *(long) (n - 1 - i + (m - 1 - j));
						} else {

							dp[i][j] = dp[i][j + 1] - 1;
							cost1 = cost[i][j] = cost[i][j + 1] + Math.abs(dp[i][j] - a[i][j]);

						}

						long cost2 = 0;
						if (a[i][j] < dp[i + 1][j]) {
							dp[i][j] = a[i][j];
							cost2 = cost[i][j] = cost[i + 1][j]
									+ Math.abs((a[i][j] + 1) - dp[i + 1][j]) * (long)(n - 1 - i + (m - 1 - j));
						} else {

							dp[i][j] = dp[i + 1][j] - 1;
							cost2 = cost[i][j] = cost[i + 1][j] + Math.abs(dp[i][j] - a[i][j]);

						}

						cost[i][j] = Math.min(cost1, cost2);

					}
				}

			}
			System.out.println(cost[0][0]);
		}

	}
	
	
    

}
