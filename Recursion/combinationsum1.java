import java.util.*;
public class combinationsum1 {
    public static void combinationSum(int index, int sum, ArrayList<Integer> res, 
        ArrayList<Integer> arr, int n){
            if(index == n || sum<0) {
                if(sum==0)
                    System.out.println(res);
                return;
            }

            //pick
            res.add(arr.get(index));
            combinationSum(index, sum-arr.get(index), res, arr, n);
            
            // not pick
            res.remove(res.size()-1);
            combinationSum(index+1, sum, res, arr, n);
    }
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(2);
        arr.add(3);
        arr.add(5);
        arr.add(7);

        int sum=7;
        int n = arr.size();

        ArrayList<Integer> res=new ArrayList<Integer>();

        combinationSum(0, sum, res, arr, n);
    }
}
