package cf_round638;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;



public class B {
	public static class pair implements Comparable<pair> {
		int id;
		int ans;

		pair(int x, int y) {

			id = x;
			ans = y;

		}

		public pair() {

		}

		public int compareTo(pair o) {
			// TODO Auto-generated method stub

			return this.id - o.id;
		}
	}

//	static int mod = (int) 998244353.;
	static ArrayList<Integer> gr[];
	static int ar[];
	static Scanner sc = new Scanner(System.in);
	static int pri[] = new int[(int) 1e6 + 5];
	static StringBuilder out = new StringBuilder();

	//static long dp[];

	public static void main(String[] args) throws IOException {
		int t =sc.nextInt();
		
		while (t-- > 0) {

			int n = sc.nextInt();
			int k = sc.nextInt();
			 ar = new int[n];
			HashSet<Integer> hs = new HashSet<>();
			for (int i = 0; i < n; i++) {
				ar[i] = sc.nextInt();
				hs.add(ar[i]);
			}
			StringBuilder ans = new StringBuilder();
			if (k < hs.size()) {
				out.append(-1 + "\n");
			} else {
				
				int cnt = 0;
				for (int key : hs) {
					ans.append(key + " ");
					cnt++;
				}
				if(cnt<k){
					for(int i=1;i<=n;i++){
						if(!hs.contains(i)){
							ans.append(i+" ");
							cnt++;
							if(cnt==k){
								break;
							}
						}
					}
					
				}
				out.append(cnt * n + "\n");
				for (int i = 0; i < n; i++) {
					out.append(ans);
				}
				out.append("\n");

			}

		}
		System.out.println(out);
	}

	
}
