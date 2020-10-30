package cf_round640;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class D {
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

//	static int mod = (int) 998244353.;
	static int mod=(int)1e9+7;
	static ArrayList<Integer> gr[];
	static int[] ar;
	static Scanner sc = new Scanner(System.in);
	static int pri[] = new int[(int) 1e6 + 5];
	static StringBuilder out = new StringBuilder();

	//static long dp[];

	public static void main(String[] args) throws IOException {
		int t = sc.nextInt();
		
		while (t-- > 0) {
			int n=sc.nextInt();
		   ar=new int[n];
		   for(int i=0;i<n;i++) {
			   ar[i]=sc.nextInt();
			   
		   }
		   int i=0;int j=n;
		   long a=ar[i],b=0;boolean f=false;
		   int cnt=1;
		   long pa=a,pb=0;
		    
		   while(i+1<j) {
			   
			   if(f) {
				   long sum=pb+1;
				   pa=0;
				   while(i+1<j&&sum>0){
					   i++;
					   a+=ar[i];
					   pa+=ar[i];
					   sum-=ar[i];
				   }
				   f=false;
			   }
			   else {
				   long sum=pa+1;
				   pb=0;
				   while(i+1<j&&sum>0){
					   j--;
					   b+=ar[j];
					   pb+=ar[j];
					   sum-=ar[j];
				   }
				   f=true;
			   }
			   cnt++;
		   }
		   out.append(cnt+" "+a+" "+b+"\n");
		}
System.out.println(out);
	}

}
