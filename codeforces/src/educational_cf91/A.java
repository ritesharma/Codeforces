package educational_cf91;

	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.HashMap;
	import java.util.HashSet;
	import java.util.Scanner;
	import java.util.Stack;
	
	public class A {
	
		static int mod = (int) 1e9 + 7;
	
		static int ar[];
		static Scanner sc = new Scanner(System.in);
		static StringBuilder out = new StringBuilder();
		static ArrayList<Integer> gr[] = new ArrayList[100000];
	
		static int pri[] = new int[(int) 1e5 + 5];
	
		static void sieve() {
			pri[1] = 1;
			for (int i = 2; i < pri.length; i++) {
				pri[i] = i;
			}
			for (int i = 2; i < Math.sqrt(pri.length); i++) {
				if (pri[i] != i)
					continue;
	
				for (int j = i * i; j < pri.length; j += i) {
					if (pri[j] == j)
						pri[j] = i;
				}
	
			}
		}
	
		static char[] a;
	
		public static void main(String[] args) throws IOException {
			int t = sc.nextInt();
	
			sieve();
	
	
			while (t-- > 0) {
				
				
				
				int a[]= {
						3, 4, 6, 5
				};
				int b[]= {
						9, 1, 2, 5, 8, 3
				};
				int ans[]=maxNumber(a,b,5);
				for(int i=0;i<ans.length;i++) {
					System.out.println(ans[i]+" ");
				}
			}
	
				
				
		}
	
		static long ans[];
	
		
		    
	    public static int[] maxNumber(int[] n1, int[] n2, int k) {
	        int n=n1.length,m=n2.length;
	          int i=0,j=0;
	          int k1=k;
	          ArrayList<Integer>ans=new ArrayList<>();
	          while(k>0){
	              
	              
	              int max1=-1,max2=-1,id1=-1,id2=-1;
	              int rem=m-j;
	             int t=i;
	              while(t<n && n-t+m-j>=k){
	                  if(max1<n1[t]){
	                      max1=n1[t];
	                      id1=t;
	                  }
	                  t++;
	              }
	              
	             
	             t=j;
	              while(t<m && m-t+n-i>=k){
	                  if(max2<n2[t]){
	                      max2=n2[t];
	                      id2=t;
	                  }
	                  t++;
	              }
	              if(max1>=max2){
	                  
	                  ans.add(max1);
	                  i=id1+1;
	              }
	              else{
	                  ans.add(max2);
	                  j=id2+1;
	              }
	                  
	              
	              k--;
	          }
	          
	          int []res=new int[k1];
	          
	          for( i=0;i<k1;i++){
	              res[i]=ans.get(i);
	          }
	          
	          return res;
	      }
	      
	
	}
