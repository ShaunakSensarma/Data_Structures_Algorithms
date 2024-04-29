import java.util.*;
public class allpermutations {
    public static void printpermutations(ArrayList<Integer> arr, ArrayList<Integer> ds, boolean freq[]){
        if(ds.size()==arr.size()){
            System.out.println(ds);
            return;
        }

        for(int i=0;i<arr.size();i++){
            if(!freq[i]){
                freq[i]=true;
                ds.add(arr.get(i));
                printpermutations(arr, ds, freq);
                ds.remove(ds.size()-1);
                freq[i]=false;
            }
        }
    } 
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);

        ArrayList<Integer> ds = new ArrayList<Integer>();
        boolean freq[]=new boolean[arr.size()];

        printpermutations(arr, ds, freq);
    }
}
