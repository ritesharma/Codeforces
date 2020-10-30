package educational_cf94;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;



public class D {

	
	static int mod = (int) 1e9 + 7;

	static int ar[];
	static Scanner sc = new Scanner(System.in);
	static StringBuilder out = new StringBuilder();

	static ArrayList<Integer> gr[];
	int n;
	
	static class pair implements Comparable<pair> {

		int f;
		int s;

		int id;
		public pair(int a, int b,int id) {
			f = a;
			s = b;
			this.id=id;
		}

		@Override
		public int compareTo(pair o) {
			// TODO Auto-generated method stub
			if (this.s == o.s)
				return this.f - o.f;
			return  o.s-this.s;
		}

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int t=sc.nextInt();
		int tc=0;
		while(t-->0){
			tc++;
			int n=sc.nextInt();
			
			pair[] ar=new pair[n];
			int sum=0;
			int max=0;
			PriorityQueue<pair> pq=new PriorityQueue<>();
			for(int i=0;i<n;i++){
				int f=sc.nextInt();
				int s=sc.nextInt();
				ar[i]=new pair(f,s,i);
				sum+=f;
				pq.add(new pair(f,s,i));
			}
			max=sum;
			int id=n;
			boolean ok=false;
			int cnt=0;
			ArrayList<Integer>al=new ArrayList<>();
			while(!pq.isEmpty()){
				pair p=pq.poll();
				sum-=p.f;
				if(sum>=p.s){
					ok=true;
					break;
					
				}
				cnt++;
				id=Math.min(id, p.id);
				
			}
			
			if(ok){
				out.append("INDEFINITELY\n");
			}
			
			
			
			
			
			
		}
		System.out.println(out);

	}

	
	 public static boolean containsPattern(int[] ar, int m, int k) {
	        boolean ok=true;
	        int n=ar.length;
	        int n1=m*k;
	        int req[]=new int[m*k];
	        
	        for(int i=0;i<=n-n1;i++){
	            
	           for(int j=0;j<k;j++){
	               
	              
	               for(int l=j*m;l<j*m+m;l++){
	                   req[l]=ar[i+l%m];
	               }
	               
	           }
	            ok=true;
	            for(int j=i,l=0;j<i+n1;j++,l++){
	                if(ar[j]!=req[l]){
	                    ok=false;break;
	                }
	            }
	            if(ok)break;
	            
	          
	        }
	        
	    
	    return ok;
	        
	       
	    }

}
