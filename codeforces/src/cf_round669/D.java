package cf_round669;

import java.util.*;

import java.io.*;

public class D {

	static int mod = (int) 1e9 + 7;

	static Integer ar[];
	static Scanner sc = new Scanner(System.in);
	static StringBuilder out = new StringBuilder();

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
			if (this.f == o.f)
				return this.s - o.s;
			return this.f - o.f;
		}

	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int tc = sc.nextInt();
		while (tc-- > 0) {

			int n = sc.nextInt();
			ArrayList<ArrayList<Integer>> gra = new ArrayList<>();
			for (int i = 0; i < n; i++) {

				ArrayList<Integer> tem = new ArrayList<>();
				tem.add(sc.nextInt());
				tem.add(sc.nextInt());
				gra.add(tem);
			}

			Queue<Integer> qu = new LinkedList<>();

			HashMap<Integer, Integer> hm = new HashMap<>();
			

			
		}

		System.out.println(out);

	}
    public int countOrders(int n) {
        dp=new long[n+1][n+1];
        for(long a[] :dp)Arrays.fill(a,-1);
        fac=new long[n+1];
        fac[1]=1;
        for(int i=2;i<=n;i++){
            fac[i]=fac[i-1]*i;
            fac[i]%=mod;
        }
        
        return (int)solve(n,n)%mod;
    }
    
    static long dp[][];
    static long fac[];
    
    
    static long solve(int i, int j){
        
        
        if(i>j)return 0;
        
        if(i==0 && j==0)return 1;
       
        if(i<0 || j<0)return 0;
         if(i==0)return fac[j];
        if(dp[i][j]!=-1)return dp[i][j];
        
        long ans=0;
        ans+=solve(i-1,j);
        ans%=mod;
        ans+=solve(i,j-1);
        ans%=mod;
        return dp[i][j]=ans;
        
    }
	
}