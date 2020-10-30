package cf_round676;


import java.util.*;
import java.io.*;
public class A {
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
 
		public pair(int a, int b,int c) {
			f = a;
			s = b;
			th=c;
		}
 
		@Override
		public int compareTo(pair o) {
			// TODO Auto-generated method stub
 
			return (o.th-o.f)-(this.th-this.f);
		}
 
	}
 
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
 
		int tc = sc.nextInt();
		while (tc-- > 0) {
 
			int a=sc.nextInt();
			int b=sc.nextInt();
			int ans=0;
			
			for(int i=0;i<31;i++){
				
				int mask=(1<<i);
				if((a&mask)==0 && (b&mask)==0){
					
					continue;
				}
				
				if((a&mask)==1  && (b&mask)==1){
					ans=(ans|mask);
					continue;
				}
				
				ans=(ans^mask);
				
								
			}
			int val=(a^ans)+(b^ans);
			out.append(val+"\n");
			
		}
		System.out.println(out);
 
	}
 
}