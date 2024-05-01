import java.util.*;
public class palindrome_partitioning {
    public static boolean isPalindrome(String s, int start, int end){
        while(start<=end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void palpart(int index, int size, String s, ArrayList<String> ds){
        if(index == size){
            System.out.println(ds);
            return;
        }

        for(int i=index;i<size;i++){
            if(isPalindrome(s, index, i)){
                ds.add(s.substring(index, i+1));
                palpart(i+1, size, s, ds);
                ds.remove(ds.size()-1);
            }
        }
    }
    public static void main(String args[]){
        String s = "aabb";
        int len = s.length();
        
        ArrayList<String> ds = new ArrayList<String>();

        palpart(0, len, s, ds);
    }
}
