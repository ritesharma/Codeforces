package cf_round666;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class C {

	static int mod = (int) 1e9 + 7;

	static int ar[];
	static Scanner sc = new Scanner(System.in);
	static StringBuilder out = new StringBuilder();

	static ArrayList<Integer> gr[];
	int n;

	static class pair implements Comparable<pair> {

		int f;
		int s;

		public pair(int a, int b) {
			f = a;
			s = b;
		}

		@Override
		public int compareTo(pair o) {
			// TODO Auto-generated method stub
			if (this.s == o.s)
				return o.f - this.f;
			return this.s - o.s;
		}

	}

	public static void main(String[] args) {
		// rite code start here
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		int t = 0;
		while (tc-- > 0) {

			
			int n=sc.nextInt();
			int k=sc.nextInt();
			
			String s=sc.next();
			
			StringBuilder st=new StringBuilder();
			
			
			st.append(s);
			boolean ok=true;
			for(int i=0;i<k;i++){
				int j=i;
				
				boolean f=true;
				
				while(j<n &&s.charAt(j)=='?'){
					j+=k;
				}
				
				if(j>=n)continue;
				
				char ch=s.charAt(j);
				
				
				for( j=i;j<n;j+=k){
					
					if(s.charAt(j)!='?'  && s.charAt(j)!=ch){
						f=false;break;
					}
					
					else{
						st.setCharAt(j, ch);
					}
				}
				
				if(!f){
					ok=false;break;
				}
				
			}
			int o=0,z=0,q=0;
			for(int i=0;i<k;i++){
				if(st.charAt(i)=='1')o++;
				else if(st.charAt(i)=='0')z++;
				else q++;
				
			}
			
			for(int i=k;i<n;i++){
				
				if(o>k/2 || z>k/2){
					ok=false;
					break;
				}
				
				if(st.charAt(i-k)=='0')z--;
				 else if(st.charAt(i-k)=='1')o--;
				if(st.charAt(i)=='1')o++;
				else if(st.charAt(i)=='0')z++;

				
				
				
			}
			
			if(z>k/2 || o>k/2)ok=false;
			
			if(ok)out.append("YES\n");
			else out.append("NO\n");
			
			
			
			
			
		}
		System.out.println(out);

	}
	
	

}
