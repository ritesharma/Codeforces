package educational_cf96;

import java.io.IOException;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class C {

	static int mod = (int) 1e9 + 7;

	static int[] ar;
	static Scanner sc = new Scanner(System.in);
	static StringBuilder out = new StringBuilder();

	static ArrayList<Integer> gr[];
	int n;

	static class pair implements Comparable<pair> {

		int f;
		int s;
		int th;

		public pair(int a, int b, int c) {
			f = a;
			s = b;
			th = c;
		}

		@Override
		public int compareTo(pair o) {
			// TODO Auto-generated method stub

			return (o.th - o.f) - (this.th - this.f);
		}

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int tc = sc.nextInt();
		while (tc-- > 0) {

			int n = sc.nextInt();
			if(n==2){
				out.append(2+"\n"+1+" "+2+"\n");continue;
			}
			if (n == 1)
				out.append(1 + "\n");
			else {

				out.append("2\n");
				PriorityQueue<Integer> pq = new PriorityQueue<>((t1, t2) -> t2 - t1); 

				out.append(n - 2 + " " + (n) + "\n");
				pq.add((n+n-2)/2);
				
				for(int i=1;i<n;i++){
					if(i==n-2)continue;
					
					pq.add(i);
				}
				
				
				
				while(pq.size()>1){
					
					int a=pq.poll();
					int b=pq.poll();
					
					out.append(a+" "+b+"\n");
					
					pq.add((a+b)/2);
				}
				

			}

		}
		System.out.println(out);

	}

}
