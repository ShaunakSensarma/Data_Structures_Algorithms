import java.util.*;
class one_subsequence_sum {
    public static boolean sumsubseq(int index, int size, int currsum, int sum,
        ArrayList<Integer> store, ArrayList<Integer> arr) {
        if(index>=size){
            if(currsum==sum) {
                System.out.println(store);
                return true;
            }
               
            return false;
        }

        store.add(arr.get(index));
        currsum += arr.get(index);
        if (sumsubseq(index+1, size, currsum, sum, store, arr) == true)
            return true;

        store.remove(arr.get(index));
        currsum -= arr.get(index);
        return sumsubseq(index+1, size, currsum, sum, store, arr);
    }
    public static void main(String args[]) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(1);

        int sum=3;

        ArrayList<Integer> store = new ArrayList<Integer>();

        boolean ans = sumsubseq(0, arr.size(), 0, sum, store, arr);
        System.out.println(ans);
    }
}

