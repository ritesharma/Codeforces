package cf_round669;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;


class sample implements Runnable{

	private Thread t;
	private String threadName;
	sample(String t1){
		this.threadName=t1;
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println(threadName);
		
	}
	
	public void start(){
		if(t==null){
			t=new Thread(this,threadName);
			t.start();
		}
	}
	
	
}




 
public class C{

	static int mod = (int) 1e9 + 7;

	static int ar[];
	static Scanner sc = new Scanner(System.in);
	static StringBuilder out = new StringBuilder();

	static ArrayList<Integer> gr[];
	int n;

	static class pair implements Comparable<pair> {

		int f;
		int s;

		public pair(int a, int b) {
			f = a;
			s = b;
		}

		@Override
		public int compareTo(pair o) {
			// TODO Auto-generated method stub
			if (this.s == o.s)
				return o.f - this.f;
			return this.s - o.s;
		}

	}

	public static class edge implements Comparable<edge> {

		int u, v;
		long wt;

		public edge(int u, int v, int wt) {
			this.u = u;
			this.v = v;
			this.wt = wt;

		}

		public edge() {
			wt = 0;

		}

		@Override

		public int compareTo(edge o) {

			return (int) (this.wt - o.wt);

		}

	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sample a=new sample("A");
		sample b=new sample("B");
		b.start();
		a.start();

	}

	

}
