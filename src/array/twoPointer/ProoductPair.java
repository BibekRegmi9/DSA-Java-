package array.twoPointer;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ProoductPair {
    public static void main(String[] args) {
        int[] arr = {10, 20, 9, 40};
//        int[] arr = {-10, 20, 9, -40};
        Arrays.sort(arr);
        boolean ans = isProduct(arr, 400);
        System.out.println(ans);
    }

    public static boolean isProduct(int[] arr, long x){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            if((long) arr[start] * arr[end] == x){
                return true;
            } else if((long) arr[start] * arr[end] < x){
                start++;
            } else {
                end--;
            }
        }
        return false;
    }
}
