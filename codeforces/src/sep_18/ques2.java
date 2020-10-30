package sep_18;

import java.util.Scanner;

public class ques2 {
	 
	public static void main(String args[] ) throws Exception {
	          // TODO Auto-generated method stub
	        Scanner scn = new Scanner(System.in);
	        int t = scn.nextInt();
	        while (t-- > 0) {
	            int n = scn.nextInt();
	            int o = n % 10;
	            solve(o, n);
	        }
	    }

	    public static void solve(int o, int n) {
	        if (o == 0) {
	           if (n >= 90) {
	                System.out.println("10");
	            } else {
	                System.out.println("-1");
	            }
	        }  else if (o == 2) {
	            if (n >= 72) {
	                System.out.println("8");
	            } else {
	                System.out.println("-1");
	            }
	        } else if (o == 3) {
	            if (n >= 63) {
	                System.out.println("7");
	            } else {
	                System.out.println("-1");
	            }
	        }
	        else if (o == 1) {
	            if (n >= 81) {
	                System.out.println("9");
	            } else {
	                System.out.println("-1");
	            }
	        }
	        else if (o == 4) {
	            if (n >= 54) {
	                System.out.println("6");
	            } else {
	                System.out.println("-1");
	            }
	        } else if (o == 5) {
	            if (n >= 45) {
	                System.out.println("5");
	            } else {
	                System.out.println("-1");
	            }
	        }  else if (o == 7) {
	            if (n >= 27) {
	                System.out.println("3");
	            } else {
	                System.out.println("-1");
	            }
	        } else if (o == 8) {
	            if (n >= 18) {
	                System.out.println("2");
	            } else {
	                System.out.println("-1");
	            }
	        } else if (o == 9) {
	            if (n >= 9) {
	                System.out.println("1");
	            } else {
	                System.out.println("-1");
	            }
	        }
	        else if (o == 6) {
	            if (n >= 36) {
	                System.out.println("4");
	            } else {
	                System.out.println("-1");
	            }
	        }
	    }
	    }
