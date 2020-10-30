package cf_round677;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class C {

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
		int t = sc.nextInt();

		while (t-- > 0) {

			int n=sc.nextInt();
			int a[]=new int[n];
			int id=-1;
			boolean ok=false;
			int max=0;
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
				if(i!=0) {
					
					if(a[i]!=a[i-1])ok=true;
				}
				
				
				if(max<a[i]) {
					
					
					max=a[i];
					
					
	
					
				}
		
				
			}
			
			
			for(int i=0;i<n;i++) {
				if(a[i]==max) {
					
					if(i==n-1) {
						
						id=n;
						break;
					}
				if(i==0) {
					
					if(a[i]>a[i+1]) {
						
						id=i+1;break;
					}
					
					
				}
				
				else {
					
					if(a[i-1]<a[i]|| a[i+1]<a[i]) {
						id=i+1;break;
					}
				}
				
				}
				
			}
			
		     
			
			
			if(!ok) {
				
				out.append(-1+"\n");
			}
			
			else out.append(id+"\n");
		}
		System.out.println(out);

	}


}
