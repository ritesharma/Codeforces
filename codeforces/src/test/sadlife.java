package test;

import java.util.*;
import java.io.*;

public class sadlife {

	public static class pair implements Comparable<pair> {
		int f;
		long s;

		pair(int x, long y) {

			f = x;
			s = y;

		}

		public pair() {

		}

		public int compareTo(pair o) {
			// TODO Auto-generated method stub

			return (int)this.s - (int)o.s;
		}
	}
	
	
	

	static int mod = (int) 1e9 + 7;
	static ArrayList<pair> gr[];
	static int ar[];
	//static Scanner sc = new Scanner(System.in);
	static int pri[] = new int[(int) 1e6 + 5];
	static StringBuilder out = new StringBuilder();
	
	

	public static void main(String[] args) throws IOException {

		int t = sc.nextInt();
		while (t-- > 0) {

			int n = sc.nextInt();
			int q=sc.nextInt();
			int r=sc.nextInt();
			gr = new ArrayList[n+1];
			for (int i = 0; i <= n; i++) {

				gr[i] = new ArrayList<>();

			}

			for (int i = 0; i < n - 1; i++) {
				int u = sc.nextInt();
				int v = sc.nextInt();
				int w=sc.nextInt();
				
				gr[u].add(new pair(v,w));
				gr[v].add(new pair(u,w));
			}

			dp=new long[n+2];

			lca=new int[n+2][limit];
			depth=new int[n+2];
			dfs(r, r,0);
			
			dfs1(r,-1,0);
			
			for(int i=0;i<q;i++) {
				
				int u=sc.nextInt();
				int v=sc.nextInt();
				
				
				int lca=lca(u,v);
				
				long ans=dp[u]+dp[v]-2L*dp[lca];
				out.append(ans+"\n");
				
				
			}
			
			
			

			
		}

		System.out.println(out);

	}

	static long dp[];

	static void dfs1(int cu, int pa,long sum) {
		
		dp[cu]=sum;
		

		for (pair ch : gr[cu]) {
			
			if(ch.f==pa)continue;
			
			dfs1(ch.f,cu,sum+ch.s);
			
		}

	}

	static int[][] lca;
	static int depth[];
	static int limit = 18;
	

	static void dfs(int root, int pa, int c) {
		depth[root] = c;
		
		lca[root][0] = pa;

		for (int i = 1; i < limit; i++) {
			int val=lca[root][i-1];

			if(val==-1)continue;
			lca[root][i] = lca[lca[root][i - 1]][i - 1];

		}
		for (pair ch : gr[root]) {

			if (ch.f == pa)
				continue;

			dfs(ch.f, root, c + 1);

		}

	}

	static int lca(int u, int v) {

		if (depth[u] < depth[v]) {
			int temp = v;
			v = u;
			u = temp;
		}

		int diff = depth[u] - depth[v];

		for (int i = limit - 1; i >= 0; i--) {
			int val = (int) Math.pow(2, i);
			if (val <= diff) {
				u = lca[u][i];
				diff -= val;
			}

		}

		for (int i = limit - 1; i >= 0; i--) {
			if (lca[u][i] != lca[v][i]) {
				u = lca[u][i];
				v = lca[v][i];
			}
		}

		return u==v? u:lca[u][0];
	}
	
	
	static Reader sc=new Reader();
	static class Reader {
		final private int BUFFER_SIZE = 1 << 16;
		private DataInputStream din;
		private byte[] buffer;
		private int bufferPointer, bytesRead;

		public Reader() {
			din = new DataInputStream(System.in);
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public Reader(String file_name) throws IOException {
			din = new DataInputStream(new FileInputStream(file_name));
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public String readLine() throws IOException {
			byte[] buf = new byte[64]; // line length
			int cnt = 0, c;
			while ((c = read()) != -1) {
				if (c == '\n')
					break;
				buf[cnt++] = (byte) c;
			}
			return new String(buf, 0, cnt);
		}

		public int nextInt() throws IOException {
			int ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');

			if (neg)
				return -ret;
			return ret;
		}

		public long nextLong() throws IOException {
			long ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');
			if (neg)
				return -ret;
			return ret;
		}

		public double nextDouble() throws IOException {
			double ret = 0, div = 1;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();

			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');

			if (c == '.') {
				while ((c = read()) >= '0' && c <= '9') {
					ret += (c - '0') / (div *= 10);
				}
			}

			if (neg)
				return -ret;
			return ret;
		}

		private void fillBuffer() throws IOException {
			bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
			if (bytesRead == -1)
				buffer[0] = -1;
		}

		private byte read() throws IOException {
			if (bufferPointer == bytesRead)
				fillBuffer();
			return buffer[bufferPointer++];
		}

		public void close() throws IOException {
			if (din == null)
				return;
			din.close();
		}
	}
	

}