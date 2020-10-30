package cf_round646;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class B {

	public static class pair implements Comparable<pair> {
		int a;
		int b;
		int id;

		pair(int x, int y,int id) {

			a = x;
			b = y;
			this.id=id;

		}

		public pair() {

		}

		public int compareTo(pair o) {
			// TODO Auto-generated method stub

			
			return this.a - o.a;
		}
	}
	static int mod = (int) 1e9 + 7;
	static ArrayList<Integer> gr[];
	static int ar[];
	static Scanner sc = new Scanner(System.in);
	static StringBuilder out = new StringBuilder();

	public static void main(String[] args) throws IOException {
		int t =  sc.nextInt();

		while (t-- > 0) {
		String s=sc.next();
		
		int z[]=new int [s.length()];
		int o[]=new int[s.length()];
	
		int sufz[]=new int [s.length()+1];
		int sufo[]=new int[s.length()+1];
		int n=s.length(),one=0,zero=0;;
		for(int i=0;i<n;i++) {
			if(s.charAt(i)=='0')zero++;
			else one++;
			
			z[i]=one;
			o[i]=zero;
			
		}
		one=0;
		zero=0;
		for(int i=n-1;i>=0;i--) {
			if(s.charAt(i)=='0')zero++;
			else one++;
			
			sufz[i]=one;
			sufo[i]=zero;
			
			
			
		}
		int ans=Integer.MAX_VALUE;
		
		
		for(int i=0;i<n;i++) {
			ans=Math.min(ans, Math.min(z[i]+sufo[i+1], o[i]+sufz[i+1]));
		}
		out.append(ans+"\n");
			

		}

		System.out.println(out);
	}
	
	
	
	//static Reader sc=new Reader();
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
