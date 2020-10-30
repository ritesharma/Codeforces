package cf_round638;

	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Collections;
	import java.util.HashMap;
	import java.util.HashSet;
	import java.util.Scanner;
	import java.util.TreeMap;
	import java.util.Vector;
	
	
	
	public class D {
	
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
		static int[] ar;
		static Scanner sc = new Scanner(System.in);
		static int pri[] = new int[(int) 1e6 + 5];
		static StringBuilder out = new StringBuilder();
	 
		//static long dp[];
	 
		public static void main(String[] args) throws IOException {
			int t =1;// sc.nextInt();
			
			while (t-- > 0) {
	
				int n=sc.nextInt();
				int k=sc.nextInt();
				gr=new ArrayList[n+1];
				for(int i=0;i<=n;i++) {
					gr[i]=new ArrayList<Integer>();
				}
				
				for(int i=0;i<k;i++) {
					int di=sc.nextInt();
					for(int j=0;j<di;j++) {
						int in=sc.nextInt();
						gr[in].add(i);
					}
				}
				int cnt=0;
				for(int i=1;i<=n;i++) {
					if(gr[i].size()==0)cnt++;
				}
				System.out.println(cnt);
			}
		}
		

    static Vector<Integer> capList[] = new Vector[41]; 
    static final int MOD = 1000000007; 
       
    
    static int dp[][] = new int[1025][101]; 
     
   
    static int allmask; 
       
   
 public static String destCity(ArrayList<ArrayList<String>> p) {
        
        HashMap<String,Integer>hm=new HashMap<>();
     HashMap<String,Integer>id=new HashMap<>();
        for(int i=0;i<p.size();i++){
            for(int j=0;j<p.get(i).size();j++){
        
                String s=p.get(i).get(j);
                hm.put(s,hm.getOrDefault(hm.get(s),0)+1);
                id.put(s,j);
            }
        }
        String ans="";
        for(String  v:hm.keySet()){
            if(hm.get(v)==1){
                if(id.get(v)==1){
                    ans=v;
                    break;
                }
            }
        }
        return ans;
    }
		
}