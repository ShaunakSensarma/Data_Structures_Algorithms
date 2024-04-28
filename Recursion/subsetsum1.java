import java.util.*;
public class subsetsum1 {
    public static void checksubset(int index, int sum, int size, ArrayList<Integer> arr) {
        if(index==size) {
            System.out.println(sum);
            return;
        }

        //pick
        checksubset(index+1, sum+arr.get(index), size, arr);

        //not pick
        checksubset(index+1, sum, size, arr);
    }
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(3);
        arr.add(1);
        arr.add(2);

        int index = 0;

        checksubset(index, 0, arr.size(), arr);
    }
}
