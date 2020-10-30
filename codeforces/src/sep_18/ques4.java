package sep_18;

import java.util.PriorityQueue;
import java.util.Scanner;

public class ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int k=sc.nextInt();
			int[]a=new int[n];
			PriorityQueue<Integer> pqmin=new PriorityQueue<>();
			PriorityQueue<Integer> pqmax=new PriorityQueue<>((x,y)->Integer.compare(y, x));
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
				pqmax.add(a[i]);
				pqmin.add(a[i]);
			}
			Boolean f= true;
			int min=pqmax.peek()-pqmin.peek();
			while(pqmax.peek()>pqmin.peek()) {
				int max1=pqmax.poll();
				int min1=pqmin.poll();
				if(max1%k==0 && min1%k==0) {
					int t1=0;
					int t2=0;
					
				}
				else if(max1%k!=0&&min1%k!=0) {
					
				}
				if(max1%k==0)
				{
					if(max1/k<min1  ) {
						if(pqmax.peek()-(max1/k)<min) {
						pqmin.offer(max1/k);
						pqmax.offer(max1/k);
						}
						else {
							pqmax.offer(max1);
					
						}
						min=Math.min(min, pqmax.peek()-max1/k);
					}
					else
						pqmin.offer(max1/k);
						
				}
				else {
					
				}
				if(min1%k!=0) {
					
				}
				
				
			}
			
		}
	}

}
