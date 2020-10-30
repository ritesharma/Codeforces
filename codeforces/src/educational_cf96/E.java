package educational_cf96;

import java.util.ArrayList;
import java.util.*;

public class E {
	
	static int mod = (int) 1e9 + 7;
	static ArrayList<Integer> gr[];
	static int ar[];
	static Scanner sc = new Scanner(System.in);
	static int pri[] = new int[(int) 1e6 + 5];
	static StringBuilder out = new StringBuilder();
	
	
	static void modify(int x,int v) {
		
		
		for(; x<=n;x+=(x&-x))bt[x]+=v;
		
		
	}
	
	static int n=0;
	static int bt[]=new int[200005];
	static int get(int x) {
		
		
		int sum=0;
		
		for(; x>0;x-=(x&-x))sum+=bt[x];
		return sum;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  n=sc.nextInt();
		
		String s=sc.next();
		StringBuilder st=new StringBuilder();st.append(s);
		st.reverse();
		String s1=st.toString();
		
		char ch[]=s1.toCharArray();
		ArrayList<Integer> al[]=new ArrayList[200];
		for(int i=0;i<200;i++)al[i]=new ArrayList<>();
		
		
		for(int i=0;i<n;i++) {
			
			int tem=ch[i];
			al[ch[i]].add(n-i);
		}
		
		
		for(int i=1;i<=n;i++) {
			
			modify(i,1);
		}
		
		long ans=0;
		
		for(int i=0;i<n;i++) {
			
			int c=ch[i];
			char cha=ch[i];
			int id=al[c].get(al[c].size()-1);
			al[c].remove(al[c].size()-1);
			int tem=get(id);
			
			ans+=(long)Math.abs((i+1)-get(id));
			
			modify(1,1);
			modify(id+1,-1);
			
			
			
		}
		
		System.out.println(ans);
		
		
		
		

	}

}
