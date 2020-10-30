package cf_round643;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
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

			return this.ans - o.ans;
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
			
		String s=sc.next();
		int n=s.length();
		HashMap<Character,Integer>hm=new HashMap<>();
		int j=0;
		int ans=Integer.MAX_VALUE;;
		for(int i=0;i<n;i++) {
			
			hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0)+1);
			if(hm.size()==3)ans=Math.min(ans, i-j+1);
			while(hm.size()>=3) {
				hm.put(s.charAt(j), hm.getOrDefault(s.charAt(j), 0)-1);
				if(hm.get(s.charAt(j))==0)hm.remove(s.charAt(j));
				j++;
				if(hm.size()==3)ans=Math.min(ans, i-j+1);
			}
			
			
		}
		if(ans==Integer.MAX_VALUE)out.append(0+"\n");
		else out.append(ans+"\n");
		}
		System.out.println(out);
	}

}
