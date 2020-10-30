package cf_round679;


import java.io.*;
import java.util.*;

public class C {

	public static class pair implements Comparable<pair> {
		int f;
		int s;

		pair(int x, int y) {

			f = x;
			s = y;

		}

		public pair() {

		}

		public int compareTo(pair o) {
			// TODO Auto-generated method stub

			return this.f - o.f;
		}
	}

	static int mod = (int) 1e9 + 7;
	static ArrayList<Integer> gr[];
	static int ar[];
	static Scanner sc = new Scanner(System.in);
	static int pri[] = new int[(int) 1e6 + 5];
	static StringBuilder out = new StringBuilder();

	static int dp[];

	

	static void out(String s) {
		out.append(s+"\n");
	}
	
	static void out(int n) {
		out.append(n+"\n");
	}
	
	
	static int bit[]=new int[10000000];
	
	public static void sort(int a[],int n) {
		
		ArrayList<Integer> al=new ArrayList<>();
		
		for(int i=0;i<n;i++)al.add(a[i]);
		
		Collections.sort(al);
		for(int i=0;i<n;i++)a[i]=al.get(i);
		
		
	}
	
	
	public static void main(String[] args) throws IOException {
		int t =1;// sc.nextInt();

		while (t-- > 0) {
			
			
			int ar[]=new int [6];
			
			for(int i=0;i<6;i++) {
				
				ar[i]=sc.nextInt();
				
			}
			int n=sc.nextInt();
			
			int b[]=new int[n];
			for(int i=0;i<n;i++)b[i]=sc.nextInt();
			sort(b,n);
			
			
			
			
		ArrayList<pair> al=new ArrayList<>();
		
		
		for(int i=0;i<n;i++) {
			
			
			for(int j=0;j<6;j++) {
				
				pair p=new pair(b[i]-ar[j],i);
				
				al.add(p);
			}
			
		}
		
		Collections.sort(al);
		
		HashMap<Integer,Integer>hm=new HashMap<>();
		
		int i=0,j=0;
		int ans=Integer.MAX_VALUE;
		
		while(i<al.size()) {
			
			hm.put(al.get(i).s,hm.getOrDefault(al.get(i).s, 0)+1);
			
			if(hm.size()==n) {
				
				
				while(hm.size()==n) {
					
					ans=Math.min(ans,al.get(i).f-al.get(j).f);
					
					hm.put(al.get(j).s,hm.getOrDefault(al.get(j).s, 0)-1);
					
					if(hm.get(al.get(j).s)==0)hm.remove(al.get(j).s);
					j++;
					
				}
				
			}
			
			i++;
			
		}
		
			
		System.out.println(ans);

		}
	}


}
