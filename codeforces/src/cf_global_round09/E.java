package cf_global_round09;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class E {

	static int mod = (int) 1e9 + 7;

	static int ar[];
	static Scanner sc = new Scanner(System.in);
	static StringBuilder out = new StringBuilder();

	public static void main(String[] args) throws IOException {
		int t = sc.nextInt();

		while (t-- > 0) {
			int n=sc.nextInt();
			ar=new int[n];
			for(int i=0;i<n;i++) {
				ar[i]=sc.nextInt();
			}
			int win=n%2==0?2:1;
			for(int i=0;i<n;i++) {
				if(ar[i]!=1) {
					if(i%2==0) {
						win=1;
						break;
					}
					else {
						win=2;
						break;
						
					}
				}
				
			}
			out.append(win==2?"Second\n":"First\n");
		}
		System.out.println(out);
	}

	static int ab[] = new int[10000000];
	static int fans = 10000000;

	static void solve(int i, int n, int a[]) {
		if (i == n) {
			int cnt = 0;
			for (int j = 1; j < n; j++) {
				if (ar[j] < ar[j - 1]) {

					if (ab[j] >= ab[j - 1])
						cnt++;
				} else if (ar[j] > ar[j - 1]) {

					if (ab[j] <= ab[j - 1])
						cnt++;

				} else {
					if (ab[j] != ab[j - 1])
						cnt++;
				}

			}

			fans = Math.min(fans, cnt);
			return;
		}

		for (int k = 0; k < 4; k++) {
			ab[i] = k;
			solve(i + 1, n, a);
		}

	}
}
