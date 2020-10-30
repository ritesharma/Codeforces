package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class B {

	
	
	static int mod = (int) 1e9 + 7;
	static ArrayList<Integer> gr[];
	static int ar[];
	static Scanner sc = new Scanner(System.in);
	static int pri[] = new int[(int) 1e6 + 5];
	static StringBuilder out = new StringBuilder();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int t=sc.nextInt();
		while(t-->0) {
			
			
			int n=sc.nextInt();
			int k=sc.nextInt();
			int ar[]=new int[n];
			
			for(int i=0;i<n;i++)ar[i]=sc.nextInt();
			sort(ar,n);
			
			int j=0;
			
			int ans=Integer.MAX_VALUE;
			for(int i=k-1;i<n;i++,j++) {
				ans=Math.min(ans, ar[i]-ar[j]);
			}
			
			out.append(ans+"\n");
			
		}
		
		System.out.println(out);

	}
	
	static void sort(int a[],int n) {
		
		
		ArrayList<Integer> al=new ArrayList<>();
		
		for(int i=0;i<n;i++)al.add(a[i]);
		Collections.sort(al);
		
		for(int i=0;i<n;i++)a[i]=al.get(i);
	}

}
