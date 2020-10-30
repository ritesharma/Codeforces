package educational_cf94;

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
		
		int tc=1;
		while(tc-->0){
		
			
			}
			System.out.println(out);
			
		
		

	}
	
	static String  solve(String s){
		StringBuilder st=new StringBuilder();
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='a'|| s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
				continue;
			st.append(s.charAt(i));
		}
		
		return st.toString();
		
	}
}
