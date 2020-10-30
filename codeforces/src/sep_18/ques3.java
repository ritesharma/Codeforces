package sep_18;

import java.util.Scanner;

public class ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
	         int t=sc.nextInt();
	         StringBuilder st=new StringBuilder();
	         while(t-->0) {
	             int n=sc.nextInt();
	             String s=Integer.toBinaryString(n);
	             int n1=s.length()-1;
	             int res=(1<<n1);
	             int n2=0;
	             int max=Integer.MAX_VALUE;
	             for(int i=0;i<s.length();i++) {
	                 if(s.charAt(i)=='1') {
	                     n2++;
	                    
	                 }
	             }
	          if(n>=res+res/2)
	        	  st.append(2*n1+"\n");
	          else  if(n2>=n1-1)
	             st.append(n1+n2+"\n");
	             else
	            	 st.append(n1+n1-1+"\n");

	         }
	         System.out.println(st);
	}

}
