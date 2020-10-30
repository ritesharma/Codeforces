package cf_round676;

import java.util.ArrayList;
import java.util.Scanner;

public class E {
	
	
	
	
	
	
	
	static int mod = (int) 1e9 + 7;
	static ArrayList<Integer> gr[];
	static int ar[];
	static Scanner sc = new Scanner(System.in);
	static int pri[] = new int[(int) 1e6 + 5];
	static StringBuilder out = new StringBuilder();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n=sc.nextInt();
	
		
		char [] s=sc.next().toCharArray();
		
		long dp[][]=new long[n+1][4];
		
		dp[0][0]=1L;
		
		
		for(int i=1;i<=n;i++) {
			
			if(s[i-1]=='?') {
				
				
				for(int j=0;j<4;j++) {
					
					dp[i][j]=dp[i-1][j]*3;
					
					
				}
				
				for(int j=0;j<3;j++) {
					
					dp[i][j+1]+=dp[i-1][j];
					
				
					
					
				}
				
				
				
				
			}
			
			else {
				
				
				for(int j=0;j<4;j++)dp[i][j]=dp[i-1][j];
				
				
				
				dp[i][(int)(s[i-1]-'a')+1]+=dp[i-1][(int)(s[i-1]-'a')];
				
				
				
				
				
			}
			
			
			for(int j=0;j<4;j++)dp[i][j]%=mod;
			
			
			
			
			
		}
		
		
		System.out.println(dp[n][3]%mod);
		

	}

}
