import java.util.*;
class subsequences_sum {
    public static void sumsubsequence(int index, int size, int currsum, int sum,
        ArrayList<Integer> store, ArrayList<Integer> arr) {
        if(index>=size){
            if(currsum==sum)
               System.out.println(store);
            return;
        }

        store.add(arr.get(index));
        currsum += arr.get(index);
        sumsubsequence(index+1, size, currsum, sum, store, arr);

        store.remove(arr.get(index));
        currsum -= arr.get(index);
        sumsubsequence(index+1, size, currsum, sum, store, arr);
    }
    public static void main(String args[]) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(1);

        int sum=3;

        ArrayList<Integer> store = new ArrayList<Integer>();

        sumsubsequence(0, arr.size(), 0, sum, store, arr);
    }
}

