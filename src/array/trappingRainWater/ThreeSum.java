package array.trappingRainWater;

import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
//        int[] arr = {1, 4, 45, 6, 10, 8};
        int[] arr = {40, 20, 10, 3, 6, 7};
        int target = 13;
        boolean ans = threeSum(arr, target);
        System.out.println(ans);
    }

    public static boolean threeSumBruteforce(int[] arr, int target){
        for(int i = 0; i < arr.length-2; i++){
            for(int j = i+1; j < arr.length-1; j++){
                for(int k = j+1; k < arr.length; k++){
                    if(arr[i] + arr[j] + arr[k] == target){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean threeSum(int[] arr, int target){
        Arrays.sort(arr);
        for(int i = 0; i < arr.length-2; i++){
            int ans = target - arr[i];
            int start = i+1;
            int end = arr.length-1;

            while(start < end){
                if(arr[start] + arr[end] == ans){
                    return true;
                } else if(arr[start] + arr[end] < ans){
                    start++;
                } else {
                    end--;
                }
            }
        }
        return false;
    }
}
