import java.util.ArrayList;

public class count_subsequences {
    public static int count_subseq(int index, int size, int currsum, int sum, ArrayList<Integer> arr) {
        if(index==size){
            if(currsum == sum)
                return 1;
            return 0;
        }

        currsum += arr.get(index);
        int left = count_subseq(index+1, size, currsum, sum, arr);

        currsum -= arr.get(index);
        int right = count_subseq(index+1, size, currsum, sum, arr);

        return left+right;
    }
    public static void main(String args[]) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(1);

        int sum=4;

        int count =  count_subseq(0, arr.size(), 0, sum, arr);
        System.out.println(count);
    }
}
