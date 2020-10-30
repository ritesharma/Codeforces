package cf_round676;

import java.util.ArrayList;
import java.util.Scanner;

public class D {

	
	public static class pair implements Comparable<pair> {
		int id;
		int ans;

		pair(int x, int y) {

			id = y;
			ans = x;

		}

		public pair() {

		}

		public int compareTo(pair o) {
			// TODO Auto-generated method stub

			return this.ans-o.ans;
		}
	}

	static int mod = (int) 1e9 + 7;
	static ArrayList<Integer> gr[];
	static int ar[];
	static Scanner sc = new Scanner(System.in);
	static int pri[] = new int[(int) 1e6 + 5];
	static StringBuilder out = new StringBuilder();

	static int dp[];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int t=sc.nextInt();
		while(t-->0) {
			long x=sc.nextInt();
			long y=sc.nextInt();
			
			long c1=sc.nextInt();
			long c2=sc.nextInt();
			long c3=sc.nextInt();
			long c4=sc.nextInt();
			long c5=sc.nextInt();
			long c6=sc.nextInt();
			
			
			long res=Long.MAX_VALUE;
			
			if(x>=0) {
				
			   long ans=(c6*x)+(y>=0?y*c2:c5*-y);
			   
			   
			   res=Math.min(ans, res);
			   
			   ans=(c1*x)+(y>=x?(y-x)*c2:(x-y)*c5);
			   res=Math.min(res,ans);
				
				
				
			}
			
			else {
				
				long ans=(-x*c3)+((y>=0?c2*y:c5*-y));
				
				res=Math.min(ans, res);
				
				
				ans=(-x*c4)+(y>=x?(y-x)*c2:(x-y)*c5);
				res=Math.min(ans, res);
				
				
			}
			
			if(y>=0) {
				
				long ans=c2*y+(x>=0?c6*x:-x*c3);
				
				res=Math.min(ans, res);
				
				
				ans=c1*y+ (x>=y?c6*(x-y):(y-x)*c3);
				
				res=Math.min(ans, res);
				
				
				
			}
			
			else {
				
				
				
				long ans=c5*-y+ (x>=0?c6*x:-x*c3);
				
				res=Math.min(ans, res);
				
				
				ans=c4*-y+ (x>=y?(x-y)*c6:(y-x)*c3);
				
				res=Math.min(ans, res);
				
				
				
				
			}
			
			
			
			out.append(res+"\n");
			
		}
		
		System.out.println(out);

	}

}
