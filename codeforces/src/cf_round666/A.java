package cf_round666;

import java.util.ArrayList;
import java.util.Scanner;



public class A {

	static int mod = (int) 1e9 + 7;

	static int ar[];
	static Scanner sc = new Scanner(System.in);
	static StringBuilder out = new StringBuilder();

	static ArrayList<Integer> gr[];
	int n;

	static class pair implements Comparable<pair> {

		int f;
		int s;

		public pair(int a, int b) {
			f = a;
			s = b;
		}

		@Override
		public int compareTo(pair o) {
			// TODO Auto-generated method stub
			if (this.s == o.s)
				return o.f - this.f;
			return this.s - o.s;
		}

	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tc=sc.nextInt();
		while(tc-->0){
			int n=sc.nextInt();
			int a[]=new int [26];
			
			for(int i=0;i<n;i++){
				String s=sc.next();
				for(int j=0;j<s.length();j++){
					a[(int)(s.charAt(j)-'a')]++;
				}
			}
			boolean ok=true;
			for(int i=0;i<26;i++){
				if(a[i]%n!=0){
					ok=false;break;
				}
			}
		if(ok)out.append("YES\n");else out.append("NO\n");
			
			}
			System.out.println(out);
			
		
		

	}
}
