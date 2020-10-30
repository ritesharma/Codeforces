package educational_cf94;

import java.util.ArrayList;
import java.util.Scanner;

public class B {

	
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
			
			int n=sc.nextInt();
			int ar[]=new int[n];
			
			for(int i=0;i<n;i++){
				ar[i]=sc.nextInt();
			}
			
			int z=0;
			int max=0;
			int max1=0;
			int cnt=0;
			ArrayList<Integer> al=new ArrayList<>();
			for(int i=1;i<n;i++){
				
				
				if(ar[i]!=0){
					
					if(max<=z){
						max1=max;
						max=z;
						
					}
					else {
						max1=Math.max(max1, z);
					}
					z=0;
					
				}
				else{
					z++;
				}
				
			}
			
			if(max%2==0)out.append("No\n");
			else{
				
				
				if(max/2+1<=max1)out.append("No\n");
				else{
					
					out.append("Yes\n");
					
				}
			}
			
			
			
			
		}
		System.out.println(out);

	}

}
