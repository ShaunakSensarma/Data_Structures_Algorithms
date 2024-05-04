import java.util.* ;
import java.io.*; 
public class frogjump_recur {
	public static int findmin(int index, int heights[], int dp[]){
		if (index==0)
			return 0;
		if(dp[index]!=-1)
			return dp[index];

		int left = findmin(index-1, heights, dp) + Math.abs(heights[index]-heights[index-1]);
		int right = Integer.MAX_VALUE;
		if(index>1)
			right = findmin(index-2, heights, dp) + Math.abs(heights[index]-heights[index-2]);

		dp[index]=Math.min(left, right);
		return dp[index];
	}
    public static int frogJump(int n, int heights[]) {

        // Write your code here..
		int dp[]=new int[n];
		Arrays.fill(dp, -1);
		dp[0]=0;
		int res= findmin(n-1, heights, dp);
		return res;
    }

}