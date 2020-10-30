package cf_round659;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeSet;



public class A {

	static int mod = (int) 1e9 + 7;

	static int ar[];
	static Scanner sc = new Scanner(System.in);
	static StringBuilder out = new StringBuilder();

	public static void main(String[] args) throws IOException {
		int t = sc.nextInt();

		while (t-- > 0) {

		
		         int n=sc.nextInt();
		         int m=sc.nextInt();
		         char ch[][]=new char[n][m];
		         
		         for(int i=0;i<n;i++) {
		        	 String s=sc.next();
		        	 for(int j=0;j<m;j++) {
		        		 ch[i][j]=s.charAt(j);
		        	 }
		         }
		         
		         System.out.println(solve(ch,n,m));
		            
		        
		}

		System.out.println(out);

	}
	
	static int dx[]= {0,0,1,-1,1,-1,-1,1};
	static int dy[]= {1,-1,0,0,1,-1,1,-1};
	
	
	  static  class  pair implements Comparable<pair>{
			
			int f;
			int s;
			
			
			public pair(int a,int b) {
				f=a;s=b;
			}

			@Override
			public int compareTo(pair o) {
				// TODO Auto-generated method stub
				if(this.s==o.s)return o.f-this.f;
				return this.s-o.s;
			}
			
		}
	
	static int solve(char ch[][],int n,int m) {
		
		boolean dp[][]=new boolean[n][m];
		
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<m;j++) {
				if(ch[i][j]=='*') {
					
					for(int k=0;k<8;k++) {
						int r=i+dx[k];
						int c=j+dy[k];
						
						if(r>=0 && c>=0 && r<n && c<m&& ch[r][c]!='*') {
							dp[r][c]=true;
						}
					}
					
					
				}
			}
			
			
			
			
			
		}
		
		
		Queue<pair> q=new LinkedList<>();
		 boolean v[][]=new boolean [n][m];
		int ans=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				
				if(v[i][j]==true)continue;
				
				q=new LinkedList<>();
				int cnt=0;
				if(dp[i][j]==true)
				q.add(new pair(i,j));
				
				while(!q.isEmpty()) {
					
					pair p=q.poll();
					
					for(int k=0;k<8;k++) {
						
						int r=p.f+dx[k];
						int c=p.s+dy[k];
						if(r>=0 && c>=0 && r<n && c<m&& ch[r][c]!='*') {
							if(dp[r][c]==true && v[r][c]==false) {
								q.add(new pair(r,c));
								v[r][c]=true;
								
							}
						}
						
					}
					
					
					cnt++;
					
				}
				
				ans=Math.max(ans, cnt-1);
					
				
			}
		}
		
		
		return ans;
		
		
		
		
		
		
	}

	
	
}
