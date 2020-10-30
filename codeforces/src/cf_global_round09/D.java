package cf_global_round09;


import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;





public class D {

	static int mod = (int) 1e9 + 7;
	static ArrayList<Integer> gr[];
	static int ar[];
//	static Scanner sc = new Scanner(System.in);
	static StringBuilder out = new StringBuilder();
	
	  static  class  pair implements Comparable<pair>{
			
			int f;
			int s;
			
			
			public pair(int a,int b) {
				f=a;s=b;
			}

			@Override
			public int compareTo(pair o) {
				// TODO Auto-generated method stub
				if(this.s==o.s)return o.f-this.f;
				return this.s-o.s;
			}
			
		}
	    


	public static void main(String[] args) throws IOException {
		int t = sc.nextInt();
		while (t-- > 0) {
			
			int n=sc.nextInt();
			gr=new ArrayList[n];
			for(int i=0;i<n;i++) {
				gr[i]=new ArrayList<>();
			}
			
			for(int i=0;i<n-1;i++) {
				int u=sc.nextInt();
				int v=sc.nextInt();
				u--;
				v--;
				gr[u].add(v);
				gr[v].add(u);
			}
			leaf=new ArrayList<Integer>();
			dfs1(0,-1);
			ans=new long[n];
			Arrays.fill(ans, 1);
			for(int i=0;i<leaf.size();i++) {
				cnt=1;
				dfs2(leaf.get(i),-1);
				
			}
			

			
			for(int i=0;i<n;i++) {
				System.out.print(ans[i]+" ");
			}
			System.out.println();
			
		}
	//	System.out.println(out);
	}
	
	static ArrayList<Integer> leaf=new ArrayList<Integer>();
	static void dfs1(int root, int pa) {
		
		if(gr[root].size()<=1) {
			leaf.add(root);
		}
		
		for(Integer ch: gr[root]) {
			if(ch==pa)continue;
			dfs1(ch,root);
			
		}
		
	}
	static long cnt=1;
	static long ans[];
	
	static void dfs2(int root,int pa) {
		
		
		ans[root]=cnt*ans[root];
		cnt++;
		
		for(Integer ch:gr[root]) {
			if(ch==pa)continue;
			dfs2(ch,root);
		}
		
		
		
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

