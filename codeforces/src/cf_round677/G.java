package cf_round677;

import java.util.ArrayList;
import java.util.Scanner;

import java.io.*;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class G {

	public static class pair implements Comparable<pair> {
		int edge;
		int wt;

		pair(int x, int y) {

			edge = x;
			wt = y;

		}

		public pair() {

		}

		public int compareTo(pair o) {
			// TODO Auto-generated method stub

			return this.wt - o.wt;
		}
	}

	static int mod = (int) 1e9 + 7;
	static ArrayList<pair> gr[];
	static int ar[];
	static Scanner sc = new Scanner(System.in);
	static int pri[] = new int[(int) 1e6 + 5];
	static StringBuilder out = new StringBuilder();

	static void buildGraph(int n, int m) throws IOException {

		gr = new ArrayList[n];

		for (int i = 0; i < n; i++) {

			gr[i] = new ArrayList<>();

		}

		edg = new pair[m];

		for (int i = 0; i < m; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			int wt = sc.nextInt();
			u--;
			v--;
			gr[u].add(new pair(v, wt));
			gr[v].add(new pair(u, wt));

			edg[i] = new pair(u, v);

		}

	}

	static pair edg[];

	static int dp[][];

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();

		buildGraph(n, m);

		int query[][] = new int[k][2];
		for (int i = 0; i < k; i++) {
			query[i][0] = sc.nextInt() - 1;
			query[i][1] = sc.nextInt() - 1;

		}

		dp = new int[n][n];

		for (int a[] : dp) {
			Arrays.fill(a, (int) 1e9);
		}

		for (int i = 0; i < n; i++) {

			dijkstra(i, -1, n);

		}

		int res = (int) 1e9;

		for (int i = 0; i < m; i++) {

			int ans = 0;
			pair p = edg[i];

			for (int j = 0; j < k; j++) {

				int u = query[j][0];
				int v = query[j][1];
				if (u == v)
					continue;
				int val = Math.min(dp[u][p.edge] + dp[p.wt][v], dp[u][p.wt] + dp[p.edge][v]);
				val = Math.min(val, dp[u][v]);

				ans += val;

			}

			res = Math.min(res, ans);

		}

		System.out.println(res);

	}

	static void dijkstra(int src, int des, int n) {

		PriorityQueue<pair> pq = new PriorityQueue<>();

		pq.add(new pair(src, 0));
		boolean visit[] = new boolean[n];

		dp[src][src] = 0;

		while (!pq.isEmpty()) {

			pair p = pq.poll();

			visit[p.edge] = true;

			for (pair ch : gr[p.edge]) {
				if (visit[ch.edge])
					continue;

				if (dp[src][ch.edge] > p.wt + ch.wt)
					dp[src][ch.edge] = p.wt + ch.wt;

				pq.add(new pair(ch.edge, p.wt + ch.wt));

			}

		}

	}

}
