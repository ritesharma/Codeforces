package cf_round679;

import java.io.*;
import java.util.*;

public class A {

	public static class pair implements Comparable<pair> {
		int f;
		int s;

		pair(int x, int y) {

			f = y;
			s = x;

		}

		public pair() {

		}

		public int compareTo(pair o) {
			// TODO Auto-generated method stub

			return this.s - o.s;
		}
	}

	static int mod = (int) 1e9 + 7;
	static ArrayList<Integer> gr[];
	static int ar[];
	static Scanner sc = new Scanner(System.in);
	static int pri[] = new int[(int) 1e6 + 5];
	static StringBuilder out = new StringBuilder();

	static int dp[];

	static void out(String s) {
		out.append(s + "\n");
	}

	static void out(int n) {
		out.append(n + "\n");
	}

	static void in(int ar[], int n) {

		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}
	}

	public static void main(String[] args) throws IOException {
		int t = sc.nextInt();

		while (t-- > 0) {

			int n = sc.nextInt();
			ar = new int[n];
			in(ar, n);
			int j = n - 1;

			for (int i = 0; i < n; i++, j--) {

				if (i < n / 2) {

					if (ar[i] < 0) {
						if (ar[j] < 0)
							out.append(ar[j] + " ");

						else
							out.append(-ar[j] + " ");
					}

					else {
						if (ar[j] < 0)
							out.append(-ar[j] + " ");

						else
							out.append(ar[j] + " ");

					}
				}
				
				
				else {
					
					
					
					
					if (ar[i] < 0) {
						if (ar[j] < 0)
							out.append(-ar[j] + " ");

						else
							out.append(ar[j] + " ");
					}

					else {
						if (ar[j] < 0)
							out.append(ar[j] + " ");

						else
							out.append(-ar[j] + " ");

					}
					
					
					
					
				}
				
				

			}
			
			out.append("\n");

		}
		
		System.out.println(out);
	}

}
