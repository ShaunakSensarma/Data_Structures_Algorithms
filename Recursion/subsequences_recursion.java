import java.util.*;
class subsequences_recursion{
    public static void printSubsequences(int index, int size, ArrayList<Integer> store, ArrayList<Integer> arr) {
        //base case
        if(index >= size){
            System.out.println(store);
            return;
        }

        //take the index
        store.add(arr.get(index));
        printSubsequences(index+1, size, store, arr);
        
        //do not take the index
        store.remove(arr.get(index));
        printSubsequences(index+1, size, store, arr);

    }
    public static void main(String args[]){
        ArrayList<Integer> arr=new ArrayList<Integer>();
        arr.add(3);
        arr.add(1);
        arr.add(2);

        ArrayList<Integer> store = new ArrayList<Integer>();

        printSubsequences(0, arr.size(), store, arr);
    }
}