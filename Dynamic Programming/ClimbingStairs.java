import java.util.*;
public class ClimbingStairs {
    public static int steps(int n, int dp[]){
        if(n==0 || n==1)
            return n;
        if(dp[n]!=-1)
            return dp[n];

        int onestep = steps(n-1, dp);
        int twostep = steps(n-2, dp);

        return dp[n] = onestep+twostep;
    }
    public static void main(String args[]){
        int n=8;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=1;
        dp[1]=1;

        int res = steps(n, dp);
        System.out.println(res);
    }
}
