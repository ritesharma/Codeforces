package cf_round637;

import java.io.IOException;
import java.util.ArrayList;
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

			return this.id - o.id;
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
			int t =  sc.nextInt();
			int a=0;
			while (t-- > 0) {
	 
				int n=sc.nextInt();
				int k=sc.nextInt();
				ar=new int [n];
				for(int i=0;i<n;i++) {
					ar[i]=sc.nextInt();
					
				}
				int max=Integer.MIN_VALUE;
				int l=0;
			
				HashMap<Integer,Integer>hm=new HashMap<>();
				dp=new int [n+1];
		
		
		
				 
				for(int i=1;i<n-1;i++) {
					
					if(ar[i]>ar[i-1] && ar[i]>ar[i+1])
						dp[i]=1;
				
				}
				
				int ans=0;
				int i=1;
				int j=0;
				while(j-i+1<k-2) {
					j++;
					ans+=dp[j];
					
				}
				if(max<ans) {
					max=ans;
					l=i;
				}
				while(j<n-1) {
					j++;
					
					ans+=dp[j];
					ans-=dp[i];
					i++;
					if(max<ans) {
						max=ans;
						l=i;
					}
				}
				
				
			
				out.append((max+1)+" "+(l)+"\n");
		
		}
		
		System.out.println(out);

	}

}
