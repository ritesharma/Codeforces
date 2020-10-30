package sep_18;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.*;
class test1 {

    
    public static void main(String args[] ) throws IOException {
       

    	int a[]= {
    			0,2,1,2,0
    	};
    	
    	int cost[][]= {
    			{ 1,10},{10,1},{10,1},{1,10},{5,1}
    	};
    	
    	
    	System.out.println(minCost(a,cost,a.length,cost[0].length,3));
    }
    
    
 public static int minCost(int[] houses, int[][] cost, int m, int n, int t) {
        
        
        for(int i=0;i<101;i++){
            for(int j=0;j<21;j++){
                for(int k=0;k<101;k++){
                    dp[i][j][k]=-1;
                }
            }
        }
        
        
        return solve(m-1,n,-1,t,cost,houses);
    }
    
    static int dp[][][]=new int[101][21][101];
    static int solve(int m,int n,int lst, int t ,int [][]cost,int[]h){
        if(m<0){
            
            if(t==0){
               return 0;
            }
            else{
                return (int)1e9;
            }
        }
        if(t<0){
            return (int)1e9;
        }
            
        if(m!=h.length-1&& dp[m][lst][t]!=-1)return dp[m][lst][t];
            
        
        
        int ans=(int)1e9;
        
        if(h[m]==0){
            for(int i=0;i<n;i++){
                if(lst==i)
                   ans=Math.min(solve(m-1,n,i,t,cost,h)+cost[m][i],ans);
                    else ans=Math.min(solve(m-1,n,i,t-1,cost,h)+cost[m][i],ans);
                
            }
        }
        
        
        else{
            if(h[m]-1==lst){
                 ans=Math.min(solve(m-1,n,h[m]-1,t,cost,h),ans);
            }
            else {
                 ans=Math.min(solve(m-1,n,h[m]-1,t-1,cost,h),ans);
            }
        }
        
        if(m!=h.length-1)
        dp[m][lst][t]=ans;
        return ans;
        
    }
    
    
}

