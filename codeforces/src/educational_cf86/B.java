package educational_cf86;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class B {
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

			return this.id - o.id;
		}
	}

	static int mod = (int) 998244353.;
	static ArrayList<Integer> gr[];
	static int ar[];
	static Scanner sc = new Scanner(System.in);
	static int pri[] = new int[(int) 1e6 + 5];
	static StringBuilder out = new StringBuilder();

	static int dp[];
	
	
		public static void main(String[] args) throws IOException {
		int t =  sc.nextInt();
	
		while (t-- > 0) {
			String s=sc.next();
			int cntz=0;
			int cnto=0;
		 for(int i=0;i<s.length();i++) {
			 if(s.charAt(i)=='0')cntz++;
			 else cnto++;
		 }
		 boolean f=true;
		 if(cntz==0) {
			 for(int i=0;i<s.length();i++) {
				 out.append(1);
			 }
			 out.append("\n");
			 continue;
		 }
		 if(cnto==0) {
			 for(int i=0;i<s.length();i++) {
				 out.append(0);
			 }
			 out.append("\n");
			 continue;
		 }
		 
		 if(cntz>cnto)f=false;
		for(int i=0;i<2*s.length();i++) {
		
			
			if(f) {
				out.append(1);
				f=false;
				
			}
			else {
				out.append(0);
				f=true;
			}
		}
		 out.append("\n");
		}
		System.out.println(out);

	}
	
}
