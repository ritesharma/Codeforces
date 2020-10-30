package educational_cf88;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;


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

			return this.ans - o.ans;
		}
	}
	static int mod = (int) 1e9 + 7;
	static ArrayList<Integer> gr[];
	static int ar[];
//	static Scanner sc = new Scanner(System.in);
	static StringBuilder out = new StringBuilder();

	public static void main(String[] args) throws IOException {
		int t = sc.nextInt();

	
		
		while (t-- > 0) {
		
			double h=sc.nextInt()+0.0;
			double c=sc.nextInt()+0.0;
			double t0=sc.nextInt();
			t0+=0.0;
			
			double sum=h+c;
			long res=1000000000;
			if(h==t0 || c==t0) {
				res=2;
			
			}
			else if((h+c)/2==t0) {
				res=4;
			}
			else {
				
				double ans=(double)sum/2+0.0;
				long lo=1;
				long hi=1000000000;
				
				while(lo<=hi) {
					long mid=(lo+hi)/2;
					double v=(double)(sum*mid+h)/(2*mid+1);
					if(v>t0) {
						lo=mid+1;
					}
					else if(v>ans) {
						res=(int) (2*(2*mid+1));
						ans=v;
						hi=mid-1;
					}
					else {
						lo=mid+1;
					}
					
				}
				
				
			}
			if(res%2==0) {
				out.append(res/2);
			}
			else
				out.append(res/2+1);
			out.append("\n");

		}

		System.out.println(out);
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
