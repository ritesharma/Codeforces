package Educational_Cf76;
import java.util.*;
public class Two_Rival_Students {
static int t;
static int n;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		while(t-->0) {
			n=sc.nextInt();
			int x=sc.nextInt();
			int [] a=new int [2];
			a[0]=sc.nextInt();
			a[1]=sc.nextInt();
			int ans=Math.abs(a[0]-a[1]);
			Arrays.sort(a);
			int d=a[0]-1+n-a[1];
			if(x<d)
			{
				ans+=x;
			}
			else
				ans=n-1;
			
			System.out.println(ans);
		}
	}

}
