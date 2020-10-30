package cf_round642;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class B {
	public static class pair implements Comparable<pair> {
		int a;
		int b;

		pair(int x, int y) {

			a= x;
			b = y;

		}

		public pair() {

		}

		public int compareTo(pair o) {
			// TODO Auto-generated method stub

			return this.a - o.b;
		}
	}

//	static int mod = (int) 998244353.;
	static int mod=(int)1e9+7;
	static ArrayList<Integer> gr[];
	static int  ar[];
	static Scanner sc = new Scanner(System.in);
	static int pri[] = new int[(int) 1e6 + 5];
	static StringBuilder out = new StringBuilder();

	static int[] dp;

	public static void main(String[] args) throws IOException {
		int t = sc.nextInt();
		
		while (t-- > 0) {
			
			int n=sc.nextInt();
			int k=sc.nextInt();
			
			pair[]p=new pair[n];
			int a[]=new int[n];
			int b[]=new int[n];
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			
			for(int i=0;i<n;i++) {
				b[i]=sc.nextInt();
			}
			
			
			Arrays.parallelSort(a);
			Arrays.parallelSort(b);
			
			for(int i=n-1,j=0;i>=0;i--,j++) {
				if(k==0)break;
				if(b[i]>a[j]) {
					a[j]=b[i];
					k--;
				}
			}
			long ans=0;
			for(int i=0;i<n;i++) {
				ans+=a[i];
			}
			out.append(ans+"\n");
		
	}

		System.out.println(out);
	
	}
}
