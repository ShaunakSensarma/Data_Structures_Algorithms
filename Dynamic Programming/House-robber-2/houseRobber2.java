import java.util.*;
class houseRobber2 {
    public int maxSum(int[] nums){
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
        dp[0]=nums[0];

        for(int i=1;i<nums.length;i++){
            int take = nums[i];
            if(i>1)
                take = nums[i] + dp[i-2];
            int nontake = dp[i-1];

            dp[i] = Math.max(take, nontake);
        }

        return dp[nums.length-1];
    }
    public int rob(int[] nums) {
        if(nums.length==1)
            return nums[0];
        if(nums.length==2)
            return Math.max(nums[0], nums[1]);
            
        int temp1[]=new int[nums.length-1];
        int temp2[]=new int[nums.length-1];
        int cn1=0;
        int cn2=0;
        for(int i=0;i<nums.length;i++){
            if(i!=0)
                temp1[cn1++]=nums[i];
            if(i!=nums.length-1)
                temp2[cn2++]=nums[i];
        }

        int val1= maxSum(temp1);
        int val2= maxSum(temp2);

        return Math.max(val1, val2);
    }
}