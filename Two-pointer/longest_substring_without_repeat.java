import java.util.*;
public class longest_substring_without_repeat {
    public static int getLongestSubstring(String s, int len){
        int left = 0;
        int right = 0;
        int maxlen = 0;
        int arr[]=new int[255];
        Arrays.fill(arr, 0);
        while(left<len && right<len){
            while(arr[s.charAt(right)]!=0){
                arr[s.charAt(left)]--;
                left++;
            }
            maxlen = Math.max(maxlen, right-left+1);
            arr[s.charAt(right)]++;
            right++;
        }
        
        return maxlen;
    }
    public static void main(String args[]){
        String s = "cadabzabcad";
        int len = getLongestSubstring(s, s.length());
        System.out.println(len);
    }
}
