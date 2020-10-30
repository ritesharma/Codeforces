package educational_cf96;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class D {
	static int mod = (int) 1e9 + 7;

	static int[] ar;
	static Scanner sc = new Scanner(System.in);
	static StringBuilder out = new StringBuilder();

	static ArrayList<Integer> gr[];
	int n;

	static class pair implements Comparable<pair> {

		int f;
		int s;
		int th;

		public pair(int a, int b, int c) {
			f = a;
			s = b;
			th = c;
		}

		@Override
		public int compareTo(pair o) {
			// TODO Auto-generated method stub

			return (o.th - o.f) - (this.th - this.f);
		}

	}

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int T =1;// sc.nextInt();
		for (int tt = 0; tt < T; tt++) {

			int n = sc.nextInt();

			long b[]=new long[n/2];
			long a []= new long[n];

			for (int i = 0; i < n/2; i++) {

				b[i]=sc.nextLong();
				
			}
			
			a[n-1]=b[0];
			a[0]=0;
			int i=0;
			for( i=1;i<n/2;i++){
				
				a[i]=a[i-1];
				b[i]-=a[i];
				a[n-i-1]=Math.min(b[i], a[n-i]);
				
				a[i]+=b[i]-a[n-i-1];
				
			}
			
			for( i=0;i<n;i++)System.out.print(a[i]+" ");
			
			System.out.println();
		}
	}

	static void sort(int[] a) {
		ArrayList<Integer> l = new ArrayList<>();
		for (int i : a)
			l.add(i);
		Collections.sort(l);
		for (int i = 0; i < a.length; i++)
			a[i] = l.get(i);
	}

	static class FastScanner {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");

		String next() {
			while (!st.hasMoreTokens())
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		int[] readArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		long nextLong() {
			return Long.parseLong(next());
		}
	}
}