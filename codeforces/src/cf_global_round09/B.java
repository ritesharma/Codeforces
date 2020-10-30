package cf_global_round09;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class B {

	static int mod = (int) 1e9 + 7;
	static ArrayList<Integer> gr[];
	static int ar[];
	static Scanner sc = new Scanner(System.in);
	static StringBuilder out = new StringBuilder();

	static int dx[]= {1,-1,0,0};
	static int dy[]= {0,0,1,-1};
	
	public static void main(String[] args) throws IOException {
		int t = sc.nextInt();
		while (t-- > 0) {

			int n=sc.nextInt();
			int m=sc.nextInt();
			
			
			int mat[][]=new int [n][m];
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					int in =sc.nextInt();
					if(in==0) {
						mat[i][j]=1;
					}
					else {
						mat[i][j]=in;
					}
				}
			}
			boolean ok=true;
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					int cnt=0;
					for(int dir=0;dir<4;dir++) {
						int r=i+dx[dir];
						int c=j+dy[dir];

						if(r>=0 && r<n&& c>=0 && c<m)cnt++;
					}
					
					if(mat[i][j]>cnt) {
						ok=false;
						break;
						
					}
					
					mat[i][j]=cnt;
					
					
				}
				
				
				
				
				
			}
			
			if(ok) {
				out.append("yes\n");
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					out.append(mat[i][j]+" ");
				}
				out.append("\n");
			}
			}
			else {
				out.append("no\n");
			}
		}
		System.out.println(out);
	}

}
