import java.util.* ;
class frogJump_dp {
	public static int frogJump(int n, int heights[]) {

        // Write your code here..
		int dp[]=new int[n];
		Arrays.fill(dp, -1);
		dp[0]=0;
		for(int i=1;i<n;i++){
			int left = dp[i-1] + Math.abs(heights[i]-heights[i-1]);
			int right = Integer.MAX_VALUE;
			if(i>1)
				right = dp[i-2] + Math.abs(heights[i]-heights[i-2]);
			
			dp[i] = Math.min(left, right);
		}

		return dp[n-1];
    }

}