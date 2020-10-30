package cf_round679;

import java.io.*;
import java.util.*;


public class D {

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

	static int mod = (int) 1e9 + 7;
	static ArrayList<Integer> gr[];
	static int ar[];
	static Scanner sc = new Scanner(System.in);
	static int pri[] = new int[(int) 1e6 + 5];
	static StringBuilder out = new StringBuilder();

	static int dp[];
	
static void modify(int x,int v) {
		
		
		for(; x<=n;x+=(x&-x))bt[x]+=v;
		
		
	}
	
	static int n=262144-1;
	static int bt[]=new int[262144];
	static int get(int x) {
		
		
		int sum=0;
		
		for(; x>0;x-=(x&-x))sum+=bt[x];
		return sum;
		
	}
	
	

	static void out(String s) {
		out.append(s+"\n");
	}
	
	static void out(int n) {
		out.append(n+"\n");
	}

	public static void main(String[] args) throws IOException {
		int t =1;// sc.nextInt();

		while (t-- > 0) {
			
		
		int n=sc.nextInt();
			for(int i=1;i<=n;i++) {
				
				modify(i,1);
				
			}
			
//			for(int i=0;i<=n;i++) {
//				System.out.println(get(i));
//			}
//			
			
			HashSet<Integer> hs=new HashSet<>();
			Stack<Character> st=new Stack<>();
			Stack<Integer> fil=new Stack<>();
			
			boolean ok=true;
			int ar[]=new int[n];
			int cnt=0;
			int dp[]=new int[n];
			char ch[]=new char[2*n];
			int j=0;
			for(int i=0;i<2*n;i++) {
				
				
				String s=sc.next();
				ch[i]=s.charAt(0);
				
				if(s.charAt(0)=='-') {
					
					int q=sc.nextInt();
					dp[j]=q;
					j++;
					if(st.isEmpty()) {
						
						ok=false;
					}
					else {
						st.pop();
						
						ar[fil.pop()]=q;
						
						
					}
					
				}
				
				else {
					
					st.push('+');
					
					fil.add(cnt);
					cnt++;
				}
				
				
			}
			
			
			if(!ok) {
				out.append("NO\n");continue;
			}
			else {
				
				PriorityQueue<Integer> pq=new PriorityQueue<>();
				j=0;int z=0;
				for(int i=0;i<2*n;i++) {
					if(ch[i]=='+') {
						pq.add(ar[z]);z++;
					}
					else {
						
						if(pq.isEmpty()|| pq.peek()!=dp[j]) {
							ok=false;
							break;
						}
						
						pq.poll();
						j++;
					
					}
				}
				
				
			}

			if(ok) {
				out.append("YES\n");
				for(int i=0;i<n;i++) {
					out.append(ar[i]+" ");
				}
				out.append("\n");
			}
			else out.append("NO\n");
		}
		
		System.out.println(out);
	}


}
