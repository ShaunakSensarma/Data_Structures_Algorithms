import java.util.*;
public class combinationsum2 {
    public static void combinations(int index, int target, ArrayList<Integer> arr, ArrayList<Integer> ds) {
        if (target == 0) {
            System.out.println(ds);
            return;
        }

        for(int i=index; i<arr.size(); i++) {
            if(i>index && arr.get(i) == arr.get(i-1))
                continue;
            if(arr.get(i)>target)
                break;
            
            ds.add(arr.get(i));
            combinations(i+1, target-arr.get(i), arr, ds);
            ds.remove(ds.size()-1);
        }

    }
    public static void main(String args[]) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(2);
        arr.add(1);
        arr.add(3);
        arr.add(1);
        arr.add(2);

        int target = 5;

        Collections.sort(arr);

        ArrayList<Integer> ds = new ArrayList<>();

        combinations(0, target, arr, ds);
    }
}
