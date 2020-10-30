package cf_round676;


import java.util.*;
import java.io.*;

public class C {
    
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
    
   		int tc =1;// sc.nextInt();
   		while (tc-- > 0) {
    
   			String s=sc.next();
   			int n=s.length();
   			out.append(4+"\n");
   			out.append("R "+(n-1)+"\n");
   			n++;
   			out.append("L "+(n-1)+"\n");
   			n+=(n-2);
   			out.append("L "+(n-1)+"\n");
   			out.append("L " +2+"\n");
   			
   		}
   		System.out.println(out);
    
   	}
    
   }