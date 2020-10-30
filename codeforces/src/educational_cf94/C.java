package educational_cf94;

import java.util.ArrayList;
import java.util.Arrays;
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
		// TODO Auto-generated method stub

		
		int tc=sc.nextInt();
		while(tc-->0){
			
			String s=sc.next();
			int n=sc.nextInt();
			char []ch=new char[s.length()+1];
			
			 boolean flag=true;
			
			 Arrays.fill(ch, '1');
			for(int i=0;i<s.length();i++){
				
				if(s.charAt(i)=='0'){
					int l=i-n;
					int r=i+n;
					if(l>=0){
						ch[l]='0';
					}
					if(r<s.length())ch[r]='0';
				}
			}
			
			for(int i=0;i<s.length();i++){
				
				if(s.charAt(i)=='1'){
					
					int l=(i-n);
					char l1=l>=0?ch[l]:'0';
					int r=i+n;
					char r1=r<s.length()?ch[r]:'0';
					if(l1=='0' && r1=='0'){
						flag=false;break;
					}
					
				
					
					
				}
				
			}
			
			
			if(flag){
				for(int i=0;i<s.length();i++){
					out.append(ch[i]);
				}
			}
			else out.append(-1);
				
			out.append("\n");
			
			
		}
		System.out.println(out);

	}

}
