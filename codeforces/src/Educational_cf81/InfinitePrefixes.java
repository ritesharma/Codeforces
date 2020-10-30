package Educational_cf81;

import java.util.*;

public class InfinitePrefixes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt(),x=sc.nextInt();
			String s=sc.next();
			long cnt=0;
			for(int i=0;i<n;i++) {
				if(s.charAt(i)=='0')cnt++;
				else cnt--;
			}
			long ans=0;
			StringBuilder st=new StringBuilder();
			
			if(cnt==0) {
				for(int i=0;i<n;i++) {
					if(cnt==x) {
						ans=-1;break;
					}
					if(s.charAt(i)=='0')cnt++;
					else cnt--;
					
				}
			}
			else {
				long tt=cnt;
				
				cnt=0;
				for(int i=0;i<n;i++) {
					
					long dif=x-cnt;
					if(dif%tt==0 && dif/tt>=0)ans++;
					if(s.charAt(i)=='0')cnt++;
					else cnt--;
			}
			
		}
			System.out.println(ans);
	}
	}
	
	
	
	
	
	
	
	
	
	
}
