package Educational_Cf76;
import java.util.*;
public class Magic_Stick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int x=sc.nextInt();
			int y=sc.nextInt();
			if((x==2 || x==3)&& y>3)
			{
				System.out.println("no");
				continue;
			}
			if(x==1 && y!=1)
			{
				System.out.println("no");
				continue;
			}
			
			else {
				System.out.println("yes");
			}
		}
	}

}
