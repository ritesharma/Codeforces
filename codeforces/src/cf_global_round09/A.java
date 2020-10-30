package cf_global_round09;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class A {

	static int mod = (int) 1e9 + 7;
	static ArrayList<Integer> gr[];
	static int ar[];
	static Scanner sc = new Scanner(System.in);
	static StringBuilder out = new StringBuilder();

	public static void main(String[] args) throws IOException {
		int t = sc.nextInt();
		while (t-- > 0) {

			int n = sc.nextInt();
			 ar= new int[n];
			for (int i = 0; i < n; i++)
				ar[i] = sc.nextInt();
			boolean b = false;
			for (int i = 0; i < n; i++) {
				if (!b) {
					ar[i] = ar[i] < 0 ? -ar[i] : ar[i];
				} else {
					ar[i] = ar[i] > 0 ? -ar[i] : ar[i];
				}
				b = !b;
			}
			for (int v : ar)
				out.append(v + " ");
			out.append("\n");
		}
		System.out.println(out);
	}

}
