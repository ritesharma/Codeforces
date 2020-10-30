package educational_cf86;

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

	static int mod = (int) 998244353.;
	static ArrayList<Integer> gr[];
	static int ar[];
	static Scanner sc = new Scanner(System.in);
	static int pri[] = new int[(int) 1e6 + 5];
	static StringBuilder out = new StringBuilder();

	static long[] dp;
	
	
		public static void main(String[] args) throws IOException {
		int t =  sc.nextInt();
	
		while (t-- > 0) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int q=sc.nextInt();
			int lcm=lcm(a,b);
			dp=new long[lcm+1];
			for(int i=1;i<=lcm;i++) {
				dp[i]=dp[i-1];
				if((i%a)%b!=(i%b)%a)dp[i]++;
			}
			
			while(q-->0) {
				long l=sc.nextLong();
				long r=sc.nextLong();
				
			
				long r1=dp[lcm]*(r/lcm)+dp[(int)(r%lcm)];
				long l1=dp[lcm]*(l/lcm)+dp[(int)(l%lcm)];
				
			   long ans=r1-l1;
			   if((l%a)%b!=(l%b)%a)ans++;
			   out.append(ans+" ");
			}
			out.append("\n");
		
		
		}
		System.out.println(out);

	}
		
		 static int gcd(int a, int b) 
		    { 
		    if (a == 0) 
		        return b;  
		    return gcd(b % a, a);  
		    } 
		      
		    // method to return LCM of two numbers 
		    static int lcm(int a, int b) 
		    { 
		        return (a*b)/gcd(a, b); 
		    } 
	
}
