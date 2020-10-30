package cf_round636;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class C {

	public static class pair implements Comparable<pair> {
		int id;
		int val;

		pair(int x, int y) {

			id = x;
			val = y;

		}

		public pair() {

		}

		public int compareTo(pair o) {
			// TODO Auto-generated method stub

			return o.val - this.val;
		}
	}

	static int mod = (int) 1e9 + 7;
	static ArrayList<Integer> gr[];
	static pair ar[];
	static Scanner sc = new Scanner(System.in);
	static int pri[] = new int[(int) 1e6 + 5];
	static StringBuilder out = new StringBuilder();
	static int dp[][];

	static int s[][];
	static int n,k,p;
	public static void main(String[] args) throws IOException {
		int t = 1;//sc.nextInt();

		while (t-- > 0) {

			n=sc.nextInt();
			p=sc.nextInt();
			k=sc.nextInt();
		
			
			ar=new pair[n];
			for(int i=0;i<n;i++) {
				ar[i]=new pair(i,sc.nextInt());
				
			}
			Arrays.parallelSort(ar);
			s=new int[n][p];
			for(int i=0;i<n;i++) {
				for(int j=0;j<p;j++) {
					s[i][j]=sc.nextInt();
				}
			}
			dp=new int[n+1][(1<<(p+1))];
			System.out.println(solve(0,0,k));
		}
		System.out.println(out);

	}
	
	
	static int solve(int i,int bit,int k) {
		
		if(bit==(1<<p)-1 && k==0)return 0;
		if(i>=n)return Integer.MIN_VALUE;
//		if(k<=0)return Integer.MIN_VALUE;
//		if(bit==(1<<p)-1)return Integer.MIN_VALUE;
		int temp=Integer.MIN_VALUE;
		if(k<=0 &&dp[i][bit]!=0) {
			return dp[i][bit];
		}
		if(k>0)
		temp= Math.max(temp,ar[i].val+solve(i+1,bit,k-1));
		 for(int pos=0;pos<p;pos++) {
		    	if((bit&(1<<pos))==0)temp=Math.max(temp,s[ar[i].id][pos]+solve(i+1,(bit|(1<<pos)),k) );
		    }
		if(k<=0)
		temp=Math.max(temp, solve(i+1,bit,k));
		if(k<=0)
	   dp[i][bit]=temp;
	    return temp;
	}

}
