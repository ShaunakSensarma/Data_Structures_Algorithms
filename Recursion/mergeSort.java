import java.util.*;
class mergeSort {
    public static void merge(ArrayList<Integer> arr, int low, int mid, int high) {
        int left = low;
        int right = mid+1;

        ArrayList<Integer> temp = new ArrayList<Integer>();

        while(left <= mid && right <= high) {
            if (arr.get(left) <= arr.get(right)) {
                temp.add(arr.get(left));
                left++;
            } else {
                temp.add(arr.get(right));
                right++;
            }
        }

        while(left<=mid){
            temp.add(arr.get(left));
            left++;
        }

        while(right<=high){
            temp.add(arr.get(right));
            right++;
        }

        for(int i=low; i<=high; i++) {
            arr.set(i, temp.get(i-low));
        }

    }
    public static void mergesort(ArrayList<Integer> arr, int low, int high) {
        if(low == high)
            return;

        int mid = low + (high-low)/2 ;
        mergesort(arr, low, mid);
        mergesort(arr, mid+1, high);

        merge(arr, low, mid, high);
    }
    public static void sortArray(ArrayList<Integer> arr) {
        int high = arr.size()-1;
        int low = 0;
        mergesort(arr, low, high);
    }
    public static void displayArray(ArrayList<Integer> arr) {
        System.out.println(arr);
    }
    public static void main(String args[]) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(6);
        arr.add(2);
        arr.add(7);
        arr.add(3);
        arr.add(8);
        arr.add(1);
        arr.add(8);
        arr.add(4);
        arr.add(6);
        arr.add(3);
        displayArray(arr);
        sortArray(arr);
        displayArray(arr);
    }    
}
