package cf_round666;

import java.util.ArrayList;
import java.util.Scanner;



public class B {

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

}
