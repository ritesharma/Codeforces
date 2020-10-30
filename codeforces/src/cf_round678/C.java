package cf_round678;

import java.io.*;
import java.util.*;

public class C {

	public static class pair implements Comparable<pair> {
		int f;
		int s;

		pair(int x, int y) {

			f = y;
			s = x;

		}

		public pair() {

		}

		public int compareTo(pair o) {
			// TODO Auto-generated method stub

			return this.s - o.s;
		}
	}

	static long mod = (long) 1e9 + 7;
	static ArrayList<Integer> gr[];
	static int ar[];
	static Scanner sc = new Scanner(System.in);

	static StringBuilder out = new StringBuilder();

	static int n;
	static int dp[];

	public static void main(String[] args) throws IOException {
		int t = 1;//sc.nextInt();

		while (t-- > 0) {
			
			
			int n=sc.nextInt();
			
			int x=sc.nextInt();
			long pos=sc.nextInt();
			
			long l=0;
			long r=n;
			
			int les=x-1;
			int grt=n-x;
			long ans=1;
			while(r>l) {
				
				
				long mid=(l+r)/2;	
				
				if(mid<=pos) {
					if(mid!=pos) {
					ans*=les;
					les--;
					}
					
						
					l=mid+1;
					
					
				}
				
				else {
					
					ans*=grt;
					grt--;
						
					r=mid;
				}
					
				ans%=mod;
				
			}
			
			les=les<=0?0:les;
			grt=grt<=0?0:grt;
			
			long i=grt+les;
			while(i>0) {
				ans*=i;
				i--;
				ans%=mod;
			}
			
			
			out.append(ans+"\n");

		}
		
		
		System.out.println(out);
	}

}
