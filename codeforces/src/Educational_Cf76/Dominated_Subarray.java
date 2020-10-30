package Educational_Cf76;
import java.util.*;

public class Dominated_Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			int min=Integer.MAX_VALUE;
			HashMap<Integer,Integer> hm=new HashMap<>();
			for(int i=0;i<n;i++) {
				if(hm.containsKey(a[i])) {
					min=Math.min(i-hm.get(a[i])+1, min);
					
				}
				hm.put(a[i], i);
			}
			if(min==Integer.MAX_VALUE)
				System.out.println(-1);
			else
				System.out.println(min);
			
		}
	}

}
