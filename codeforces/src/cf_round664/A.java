package cf_round664;

import java.util.*;
import java.math.*;

public class A {
	
	
	
	static int l;

	public static int[] multiplicities(int prime[], int N) {
		int i, j;
		int[] primemul = new int[l];
		for (i = 0; i < l; i++)
			primemul[i] = 0;
		for (j = 2; j <= N; j++) {
			int temp = j;
			while (temp > 1) {
				for (i = 0; i < l; i++) {
					if (temp % prime[i] == 0) {
						temp = temp / prime[i];
						primemul[i]++;
					}
				}
			}
		}
		return primemul;
	}

	public static int result(int primemul[]) {
		int i;long j;
		long res=1;
		for (i = 0; i < l; i++) {
			j = (2 * primemul[i]) + 1;
			res = res*j;
			res=res%1000007;
		}
		res = res%1000007;
		return (int)res;
	}

	public static int[] primes(int N) {
		int[] prime = new int[N];
		
		int f;
		prime[0] = 2;
		l = 1;
		int pri[]=new int [N+1];
		for(int i=2;i<pri.length;i++) {
			pri[i]=i;
		}
		for(int i=2;i<Math.sqrt(pri.length);i++) {
			if(pri[i]!=i)continue;
			
				for(int j=i*i;j<pri.length;j+=i) {
					if(pri[j]==j)pri[j]=i;
				}
			
		}
		
		
		
		for(int i=3;i<=N;i++) {
			
			if(pri[i]==i) {
				prime[l]=i;
				l++;
			}
			
		}
		return prime;
	}

	public static void main(String arg[]) {
	
			int N;
			Scanner scan = new Scanner(System.in);
			N = scan.nextInt();
			int prime[] = new int [N];
			prime=primes(N);
			int[] primemul=new int[l];
			primemul= multiplicities(prime, N);
			System.out.println(result(primemul));
		 {
		}
	}
}