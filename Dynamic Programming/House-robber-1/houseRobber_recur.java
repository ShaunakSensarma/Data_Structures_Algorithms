import java.util.*;
class houseRobber_recur {
    public int maxValue(int index, int nums[], int dp[]){
        if(index==0)
            return nums[index];
        if(index<0)
            return 0;
        
        if(dp[index]!=-1)
            return dp[index];

        int pick = nums[index]+maxValue(index-2, nums, dp);
        int notpick = maxValue(index-1, nums, dp);

        return dp[index]=Math.max(pick, notpick);
    }
    public int rob(int[] nums) {
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
        dp[0]=nums[0];
        return maxValue(nums.length-1, nums, dp);
    }
}