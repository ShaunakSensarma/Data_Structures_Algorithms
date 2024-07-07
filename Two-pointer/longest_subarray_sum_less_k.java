import java.util.*;
public class longest_subarray_sum_less_k {
    public static int getMaxLen(ArrayList<Integer> arr, int n, int k){
        int maxlen=0;
        int sum=0;
        int left=0;
        int right=0;

        while(right<n){
            sum = sum+ arr.get(right);
            while(sum>k){
                sum-=arr.get(left);
                left++;
            }
            if(sum<=k) 
                maxlen = Math.max(maxlen, right-left+1);
            
            right++;
        }

        return maxlen;
    }
    public static void main(String args[]){
        ArrayList<Integer> arr=new ArrayList<Integer>();
        arr.add(2);
        arr.add(5);
        arr.add(1);
        arr.add(7);
        arr.add(10);

        int k=14;

        int maxlen = getMaxLen(arr, arr.size(), k);
        System.out.println(maxlen);
    }
}