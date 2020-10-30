package eduactional_cf97;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import java.util.*;
import java.io.*;

public class E {

	public static class pair implements Comparable<pair> {
		int f;
		int s;

		pair(int x, int y) {

			f = x;
			s = y;

		}

		public pair() {

		}

		public int compareTo(pair o) {
			// TODO Auto-generated method stub

			return (int) this.s - (int) o.s;
		}
	}

	static int mod = (int) 1e9 + 7;
	static ArrayList<Integer> gr[];
	static int ar[];
	static Scanner sc = new Scanner(System.in);
	static int pri[] = new int[(int) 1e6 + 5];
	static StringBuilder out = new StringBuilder();

	static void in(int a[], int n) {
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
	}
	
	static void in(int a[],int l,int r) {
		for (int i = l+1; i <=r; i++)
			a[i] = sc.nextInt();
		
		
	}

	static void buildGraph(int n, int m) {

		gr = new ArrayList[n];

		for (int i = 0; i < n; i++) {

			gr[i] = new ArrayList<>();

		}

		for (int i = 0; i < m; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();

			u--;
			v--;
			gr[u].add(v);
			gr[v].add(u);
		}

	}
	
	static int b[];

	public static void main(String[] args) throws IOException {

		int t =1;// sc.nextInt();
		
		while (t-- > 0) {
			
			
			int n=sc.nextInt();
			int k=sc.nextInt();
			
			ar=new int [n+2];
			in(ar,0,n);
			
			for(int i=1;i<=n;i++)ar[i]-=i;
			
			ar[n+1]=(int)2e9;
			
			b=new int [k+1];
			in(b,k);
			b[k]=n+1;
			
			
		
			
			int lst=0;
			int ans=0;
			ar[0]=-(int)1e9;
			ar[n+1]=(int)1e9+1;
			for(int i=0;i<=k;i++) {
				
			
			ans+=solve(lst,b[i]);
			lst=b[i];
				
			}
			
			
			
			out.append(ans>=(int)1e9?-1:ans+"\n");

		}
		
		System.out.println(out);
	}
	
	
	
	
	static int solve(int l, int r) {
		if(l==r)return 0;
		
		if(ar[l]>ar[r]) {
			return (int)1e9;
		}
		
		len=new int[r-l+1];
		Arrays.fill(len, (int)1e9);
		len[0]=0;
		
		int ans=0;
		for(int i=l+1;i<r;i++) {
			
			if(ar[i]>ar[r] || ar[i]<ar[l])continue;
			
			
			
			int id=bs(ar[i],len.length-1);
			
			len[id+1]=Math.min(len[id+1], ar[i]);
			
			ans=Math.max(ans, id+1);
			
			
		}
		
		
		return (r-l-1)-ans;
		
		
		
		
		
	}
	
	 static  int len[];
	   
	    
	    static int bs(int val,int n){
	        
	        int l=0;
	        int hi=n;
	        int ans=0;
	        while(l<=hi){
	            
	            int mid=(l+hi)/2;
	            
	            if(len[mid]<=val){
	                
	                ans=mid;
	                l=mid+1;
	                
	            }
	            else hi=mid-1;
	        }
	        return ans;
	    }
	
	

}
