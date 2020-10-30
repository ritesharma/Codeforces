package cf_round664;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class D {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		

		int a[] = new int[n1];
		int b[] = new int[n2];
		int c[] = new int[n3];
		int d[] = new int[n4];
		
		

		for (int i = 0; i < n1; i++) {

			a[i] = sc.nextInt();
		}

		for (int i = 0; i < n2; i++) {

			b[i] = sc.nextInt();
		}
		for (int i = 0; i < n3; i++) {

			c[i] = sc.nextInt();
		}
		for (int i = 0; i < n4; i++) {

			d[i] = sc.nextInt();
		}

		
		
		
		
	}

	
	
	static ArrayList<Integer>a1=new ArrayList<>();
	static ArrayList<Integer>b1=new ArrayList<>();
	
	static long solve( ArrayList<Integer>jeans, ArrayList<Integer>shoes,
			ArrayList<Integer> shirt,ArrayList<Integer> top,int dol) {
		
		
		
		long ans=0;
		a1=new ArrayList<>();
		
		b1=new ArrayList<>();
		
		for(int i=0;i<jeans.size();i++) {
			for(int j=0;j<shoes.size();j++) {
				
				a1.add(jeans.get(i)+shoes.get(j));
				
			}
		}
		
		for(int i=0;i<shirt.size();i++) {
			for(int j=0;j<top.size();j++) {
				
				b1.add(shirt.get(i)+top.get(j));
				
			}
		}
		
		
		Collections.sort(a1);
		Collections.sort(b1);
		
		
		for(int i=0;i<a1.size();i++) {
			
			int id=bs(dol-a1.get(i));
			if(id!=-1) {
				ans+=(long)(id+1);
			}
			
		}
		
		
		return ans;
	}
	
	static int bs(int val) {
		
		
		
		if(val<=0)return -1;
		int lo=0;
		int hi=b1.size()-1;
		
		int ans=-1;
		while(lo<=hi) {
			
			int mid=lo+(hi-lo)/2;
			
			if(b1.get(mid)<=val) {
				
				ans=mid;
				
				lo=mid+1;
			}
			else hi=mid-1;
			
		}
		
		return ans;
	}
	
}
