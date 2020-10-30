package cf_round677;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class D {

	public static class pair implements Comparable<pair> {
		int id;
		int s;

		pair(int x, int y) {

			id = x;
			s= y;

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

	public static void main(String[] args) throws IOException {
		int t = sc.nextInt();

		while (t-- > 0) {

			int n=sc.nextInt();
			pair[]a=new pair[n];
			for(int i=0;i<n;i++) {
				
				a[i]=new pair(i+1,sc.nextInt());
			}
			
			Arrays.sort(a);
			int i=1;
			while(i<n) {
				
				if(a[i].s!=a[i-1].s)break;
				i++;
			}
			
			if(i==n) {
				out.append("NO\n");continue;
			}
			
			
			out.append("YES\n");
			
			
			for(int j=i;j<n;j++) {
				
				
				out.append(a[0].id+" "+a[j].id+"\n");
			}
			
			for(int j=1;j<i;j++) {
				
				out.append(a[n-1].id+" "+a[j].id+"\n");
			}
			
			
		}
		System.out.println(out);

	}


}
