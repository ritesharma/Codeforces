package cf_round679;

import java.io.*;
import java.util.*;

public class B {

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

	static void in(int ar[], int n) {

		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}
	}

	static void out(String s) {
		out.append(s + "\n");
	}

	static void out(int n) {
		out.append(n + "\n");
	}

	
	
	static int bit[]=new int[10000000];
	
	public static void main(String[] args) throws IOException {
		int t = sc.nextInt();

		while (t-- > 0) {

			int n = sc.nextInt();
			int m = sc.nextInt();

			int a[][] = new int[n][m];
			for (int i = 0; i < n; i++) {

				for (int j = 0; j < m; j++)
					a[i][j] = sc.nextInt();

			}

			ArrayList<Integer>[] gr = new ArrayList[m];

			for (int i = 0; i < m; i++) {

				gr[i] = new ArrayList<>();

				for (int j = 0; j < n; j++)
					gr[i].add(sc.nextInt());

			}

			int val = gr[0].get(0);
			
			int row=0,col=0;

			for (int i = 0; i < n; i++) {

				for (int j = 0; j < m; j++) {
					
					if(a[i][j]==val) {
						row=i;
						
						break;
					}
					
				}
					

			}
			
			
			for(int j=0;j<m;j++) {
				
				   val=a[row][j];
				   
				   int id=0;
				for(int i=0;i<m;i++) {
					
					if(gr[i].get(0)==val) {
						id=i;
						break;
					}
				}
				
				
				ArrayList<Integer>al=gr[j];
				
				gr[j]=gr[id];
				gr[id]=al;
				
			}
			
			
			for(int i=0;i<n;i++) {
				
				
				for(int j=0;j<m;j++) {
					
					out.append(gr[j].get(i)+" ");
				}
				out.append("\n");
			}
			

		}
		
		
		System.out.println(out);
	}

}
