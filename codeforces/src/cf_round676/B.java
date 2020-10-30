package cf_round676;


import java.util.*;
import java.io.*;

public class B {
	 
	static int mod = (int) 1e9 + 7;
 
	static int[] ar;
	static Scanner sc = new Scanner(System.in);
	static StringBuilder out = new StringBuilder();
 
	static ArrayList<Integer> gr[];
	int n;
 
	static class pair implements Comparable<pair> {
 
		int f;
		int s;
		int th;
 
		public pair(int a, int b, int c) {
			f = a;
			s = b;
			th = c;
		}
 
		@Override
		public int compareTo(pair o) {
			// TODO Auto-generated method stub
 
			return (o.th - o.f) - (this.th - this.f);
		}
 
	}
 
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
 
		int tc = sc.nextInt();
		while (tc-- > 0) {
 
			int n = sc.nextInt();
			String s[] = new String[n];
 
			for (int i = 0; i < n; i++) {
 
				s[i] = sc.next();
 
			}
 
			if (s[0].charAt(1) == '0' && s[1].charAt(0) == '0') {
				StringBuilder st = new StringBuilder();
 
				int cnt = 0;
				if (s[n - 1].charAt(n - 2) == '0') {
					st.append(n + " " + (n - 1) + "\n");
					cnt++;
				}
 
				if (s[n - 2].charAt(n - 1) == '0') {
					st.append((n - 1) + " " + (n) + "\n");
					cnt++;
				}
 
				out.append(cnt + "\n" + st);
			}
 
			else if (s[0].charAt(1) == '1' && s[1].charAt(0) == '1') {
				StringBuilder st = new StringBuilder();
 
				int cnt = 0;
				if (s[n - 1].charAt(n - 2) == '1') {
					st.append(n + " " + (n - 1) + "\n");
					cnt++;
				}
 
				if (s[n - 2].charAt(n - 1) == '1') {
					st.append((n - 1) + " " + (n) + "\n");
					cnt++;
				}
 
				out.append(cnt + "\n" + st);
			}
 
			else if (s[n - 1].charAt(n - 2) == '0' && s[n - 2].charAt(n - 1) == '0') {
 
				StringBuilder st = new StringBuilder();
 
				int cnt = 0;
				
				
				if(s[0].charAt(1)=='0'){
					
					st.append(1+" "+2+"\n");
					
					cnt++;
					
					
				}
				
				if(s[1].charAt(0)=='0'){
					st.append(2+" "+1+"\n");
					
					cnt++;
				}
				
				out.append(cnt+"\n"+st);
 
			}
			
			
			
			
			else if (s[n - 1].charAt(n - 2) == '1' && s[n - 2].charAt(n - 1) == '1') {
 
				StringBuilder st = new StringBuilder();
 
				int cnt = 0;
				
				
				if(s[0].charAt(1)=='1'){
					
					st.append(1+" "+2+"\n");
					
					cnt++;
					
					
				}
				
				if(s[1].charAt(0)=='1'){
					st.append(2+" "+1+"\n");
					
					cnt++;
				}
				
				out.append(cnt+"\n"+st);
 
			}
			
			
			
			else{
				
				
				StringBuilder st = new StringBuilder();
 
				int cnt = 0;
 
				if(s[0].charAt(1)=='0'){
					
					st.append(1+" "+2+"\n");
					cnt++;
					
				}
				
				if(s[1].charAt(0)=='0'){
					st.append(2+" "+1+"\n");
					cnt++;
				}
				
				if(s[n-1].charAt(n-2)=='1'){
					st.append(n+" "+(n-1)+"\n");
					
					cnt++;
				}
				
				if(s[n-2].charAt(n-1)=='1'){
					
					st.append(n-1+" "+n+"\n");
					cnt++;
				}
				out.append(cnt+"\n"+st);
				
				
			}
			
			
			
			
			
 
		}
		System.out.println(out);
 
	}
 
}