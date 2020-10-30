package cf_round659;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class B {

	static int mod = (int) 1e9 + 7;

	static int ar[];
	static Scanner sc = new Scanner(System.in);
	static StringBuilder out = new StringBuilder();
	
	static int pri[]=new int [(int)1e6+5];
	static void sieve() {
		pri[1]=1;
		for(int i=2;i<pri.length;i++) {
			pri[i]=i;
		}
		for(int i=2;i<Math.sqrt(pri.length);i++) {
			if(pri[i]!=i)continue;
			
				for(int j=i*i;j<pri.length;j+=i) {
					if(pri[j]==j)pri[j]=i;
				}
			
		}
	}
	

	public static void main(String[] args) throws IOException {
		int t = sc.nextInt();

		sieve();
		while (t-- > 0) {
			int n = sc.nextInt();
			 ar = new int[n];

			StringBuilder ans[] = new StringBuilder[n + 1];
			for (int i = 0; i <= n; i++)
				ans[i] = new StringBuilder();
			for (int i = 1; i <= 200; i++)
				ans[0].append("a");

			for (int i = 0; i < n; i++) {
				ar[i] = sc.nextInt();
				for (int j = 0; j < 200; j++) {
					if (j < ar[i])
						ans[i + 1].append(ans[i].charAt(j) + "");
					else
						ans[i + 1].append((char) ((ans[i].charAt(j) - 'a' + 1) % 26 + 97));
				}
			}
			for (StringBuilder x : ans)
				out.append(x + "\n");
			
		}
		System.out.println(out);
	}

	
	
}