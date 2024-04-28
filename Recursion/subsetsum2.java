import java.util.*;
public class subsetsum2 {
    public static void printsubsets(int index, ArrayList<Integer> arr, ArrayList<Integer> ds,
        List<List<Integer>> ans) {
        ans.add(ds);
        System.out.println(ds);

        for(int i=index; i < arr.size(); i++){
            if(i>index && arr.get(i)==arr.get(i-1))
                continue;
            
            ds.add(arr.get(i));
            printsubsets(i+1, arr, ds, ans);  
            ds.remove(ds.size()-1);
        }
    }
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(2);
        arr.add(3);
        arr.add(3);

        ArrayList<Integer> ds = new ArrayList<Integer>();
        List<List<Integer>> ans = new ArrayList<>();

        printsubsets(0, arr, ds, ans);

        for(int i=0;i<ans.size();i++){
            //System.out.println(ans.get(i));
        }
    }
}
