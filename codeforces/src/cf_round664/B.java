package cf_round664;

import java.util.Scanner;

public class B {
	static int mod = (int) 1e9 + 7;

	static long ar[];
	
	static StringBuilder out = new StringBuilder();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Scanner sc = new Scanner(System.in);
	
	int t=sc.nextInt();
	while(t-->0){
		int n=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		
		
		if(c>4||c<b || c<a){
			out.append("IMPOSSIBLE\n");continue;
		}
		
		
		 a=a-c;
		
		 
		 for(int i=0;i<a;i++){
			 ar[i]=n-1;
		 }
		 
		 for(int i=a;i<a+c;i++){
			 ar[i]=n;
		 }
		 
		 b-=c;
		 
		 for(int i=n-1;i>=n-b;i--){
			 ar[i]=n-1;
		 }
		 
		 for(int i=0;i<n;i++){
			 if(ar[i]==0)ar[i]=1;
			 out.append(ar[i]+"\n");
		 }
		 
		 
		
		
		
		
	}
		System.out.println(out);
	
	}

}
