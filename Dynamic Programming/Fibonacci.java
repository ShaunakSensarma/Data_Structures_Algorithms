import java.util.*;
public class Fibonacci {
    public static int fibbo(int n, int dp[]){
        if (n==0 || n==1)
            return n;
        if(dp[n]!=-1)
            return dp[n];
        
        return dp[n]=fibbo(n-1, dp) + fibbo(n-2, dp);
    }
    public static void main(String args[]){
        int n=8;
        int dp[]=new int[n+1];
        Arrays.fill(dp, -1);
        dp[0]=0;
        dp[1]=1;
        int res = fibbo(n, dp);
        System.out.println(res);
    }
}