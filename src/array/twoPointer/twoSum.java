package array.twoPointer;

import java.util.Arrays;

public class twoSum {
    public static void main(String[] args) {
        int[] arr = {2,3,4};
        int target = 6;
//        int[] ans = twoSum(arr, target);
        int[] ans = twoSumBruteforce(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;

        while(start < end){
            if(numbers[start] + numbers[end] == target){
                return new int[] {start+1 , end+1};
            } else if (numbers[start] + numbers[end] < target) {
                start++;
            } else {
                end--;
            }
        }
        return new int[] {-1, -1};
    }

    public static int[] twoSumBruteforce(int[] arr, int target){
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 1; j < arr.length; j++){
                if(arr[i] + arr[j] == target){
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {-1, -1};
    }
}
