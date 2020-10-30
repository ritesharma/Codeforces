package cf_round640;

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

//	static int mod = (int) 998244353.;
	static int mod=(int)1e9+7;
	static ArrayList<Integer> gr[];
	static long ar[];
	static Scanner sc = new Scanner(System.in);
	static int pri[] = new int[(int) 1e6 + 5];
	static StringBuilder out = new StringBuilder();

	//static long dp[];

	public static void main(String[] args) throws IOException {
		int t = sc.nextInt();
		
		while (t-- > 0) {
			long n=sc.nextLong();
			int k=sc.nextInt();
			ar=new long[k];
			if(n%2==0) {
				
				if(k>n) {
					out.append("NO\n");
					continue;
					
				}
				if(k*2<=n) {
					for(int i=0;i<k;i++) {
						ar[i]=2;
					}
					n-=2*k;
					ar[0]+=n;
					out.append("YES\n");
					for(int i=0;i<k;i++) {
					    out.append(ar[i]+" ");
					}
				}
				else {
					if(k%2!=0) {
						out.append("NO\n");continue;
					}
					else {
						for(int i=0;i<k;i++) {
							ar[i]=1;
						}
						n-=k;
						ar[0]+=n;

						out.append("YES\n");
						for(int i=0;i<k;i++) {
						    out.append(ar[i]+" ");
						}
						

					}
					
				}
				
			}
			else {
				if(k%2==0) {
				out.append("NO\n");
				continue;
				}
				if( k>n) {
					out.append("NO\n");
					continue;
				}
				for(int i=0;i<k;i++) {
					ar[i]=1;
				}
				n-=k;
				ar[0]+=n;
				out.append("YES\n");
				for(int i=0;i<k;i++) {
				    out.append(ar[i]+" ");
				}
			}
			out.append("\n");
			
		}
System.out.println(out);
	}


}
