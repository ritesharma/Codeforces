package sep_18;

import java.util.*;
import java.io.*;

public class test {

	static long dp[] = new long[(int) 1e5 * 17];
	static int mod = (int) 1e9 + 7;
	static ArrayList<Integer> gr[];
	static int ar[];
	static Scanner sc = new Scanner(System.in);
	static StringBuilder out = new StringBuilder();
	static int n;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			String[] a = new String[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.next();
			}

			int dp[]=new int[26];
			
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					dp[a[i].charAt(j)-97]=1;
				}
			}
			boolean ans=false;
			StringBuilder st=new StringBuilder();
			st.append(a[0]);
			for (int i = 0; i < m; i++) {
				
				ans=false;
				for (int j = 0; j < 26; j++) {
					if(dp[j]==0)continue;
					st.setCharAt(i, (char) (j+'a'));
					boolean ok =true;
					for (int k = 0; k < n; k++) {
						
					     int cnt=0;
						for (int l = 0; l < m; l++) {

							if(a[k].charAt(l)!=st.charAt(l))cnt++;
							
						}
						if(cnt>1) {
							ok=false;
							break;
						}
						
					}
					
					if(ok) {
						ans=ok;
						break;
						
					}
					
					st.setCharAt(i, a[0].charAt(i));
				}
				
				if(ans)break;
				
				
			}
			
			if(ans)out.append(st+"\n");
			else out.append(-1+"\n");
		}
		System.out.println(out);

	}
}
