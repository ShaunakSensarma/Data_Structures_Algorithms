import java.util.*;
public class max_points_from_cards{
    public static int getMaxSum(ArrayList<Integer> arr, int n, int k){
        int leftsum = 0;
        int rightsum = 0;

        int maxsum = 0;
        
        for(int i=0;i<k;i++)
            leftsum += arr.get(i);
        
        int rightindex = n-1;
        maxsum = leftsum;

        for(int i=k-1; i>=0;i--){
            leftsum = leftsum - arr.get(i);
            rightsum = rightsum + arr.get(rightindex);
            rightindex--;
            maxsum = Math.max(maxsum, leftsum+rightsum);
        }
        
        return maxsum;
    }
    public static void main(String args[]){
        ArrayList<Integer> arr =  new ArrayList<Integer>();
        arr.add(6);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(7);
        arr.add(2);
        arr.add(1);
        arr.add(7);
        arr.add(1);

        int k=4;

        int maxsum = getMaxSum(arr, arr.size(), k);
        System.out.println(maxsum);
    }
}