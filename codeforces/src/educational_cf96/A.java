package educational_cf96;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

 

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

			
		    int n;
	        n=sc.nextInt();

	        if(n%3==0){
	        	
	        	out.append(n/3+" 0 0\n");
	           
	            continue;
	        }
	        if(n%5==0){
	        	out.append("0 "+n/5+" 0\n");
	           
	            continue;
	        }
	        if(n%7==0){
	        	
	        	out.append("0 0 "+n/7+"\n");
	           
	            continue;
	        }
	        if(n>=8)
	        {
	            int th = n/5;
	            int rm = n%5;

	            if(rm==1){
	            	
	            	out.append(2+" "+(th-1)+" 0\n");
	                
	                continue;
	            }
	            if(rm==2){
	            	
	            	out.append(2+" "+(th-1)+" 1\n");
	               
	                continue;
	            }   
	            if(rm==3){
	            	
	            	out.append(1+" "+(th)+" 0\n");
	              
	                continue;
	            }
	            if(rm==4){
	            	
	            	out.append(3+" "+(th-1)+" 0\n");
	              
	                continue;
	            }
	        }
	        
	   out.append(-1+"\n");
			

		}
		System.out.println(out);

	}
}
