package array.twoPointer;

import java.util.Arrays;

public class pairDifference {
    public int solve(int[] arr, int B) {
        Arrays.sort(arr);
        int start = 0;
        int end = 1;

        if(B < 0){
            B = B * -1;
        }

        while(end < arr.length){
            if(arr[end] - arr[start] == B){
                return 1;
            } else if(arr[end] - arr[start] < B){
                end++;
            } else {
                start++;
            }

            if(start == end){
                end++;
            }
        }
        return 0;
    }
}
