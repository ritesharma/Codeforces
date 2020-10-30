package educational_cf96;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;



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

		FastScanner sc = new FastScanner();
		int tc = sc.nextInt();
		while (tc-- > 0) {

			 int n;int k;
		       n=sc.nextInt();
		        k=sc.nextInt();
		       Long arr[]=new Long[n];
		        for(int i=0;i<n;i++)
		            arr[i]=(long) sc.nextInt();

		        if(n==1){
		           out.append(0+"\n");
		            continue;
		        }
		      
		        Arrays.sort(arr);
		       
		        
		        long sum=0L;
		        k++;
		       for(int i=n-1;i>=0;i--){
		    	   
		    	   if(k==0)break;
		    	   
		    	   sum+=arr[i];
		    	   k--;
		    	   
		       }
		       
		       out.append(sum+"\n");

		}
		System.out.println(out);

	}
	
	static class FastScanner {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");

		String next() {
			while (!st.hasMoreTokens())
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		int[] readArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		long nextLong() {
			return Long.parseLong(next());
		}
	}
	
}
