package array.mooreVotingAlgo;

import java.util.Arrays;
import java.util.HashMap;

public class FindMissingAndRepeating {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1, 2, 7, 6};
        findMissingAndRepeatingg(arr);
    }

    // bruteforce
    public static void findMissingAndRepeating(int[] arr){
        int repeatingNo = -1;
        int missingNo = -1;
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j <arr.length-1; j++){
                if(arr[i] == arr[j]){
                    repeatingNo = arr[i];
                }
            }
        }
//        1, 2, 2, 3 ,4, 6
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j <arr.length-1; j++){
                if(arr[i] == arr[j]+i){
                    missingNo = arr[i];
                }
            }
        }


        System.out.println("Reapeating no is " + repeatingNo +",  Missing no is " + missingNo);
    }

    public static void findMissingAndRepeatingg(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();

        // count occurance
        for(int num: arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
            System.out.println("Occurance is: " + map);
        }

        // Step 2: Check for missing and duplicate numbers
        int duplicate = -1;
        int missing = -1;
        for(int i = 1; i <= arr.length; i++){
            int count = map.getOrDefault(i, 0);
            if(count == 2){
                duplicate = i;
            } else if(count == 0) {
                missing = i;
            }
        }
        System.out.println("Duplicate Number: " + duplicate);
        System.out.println("Missing Number: " + missing);
    }
}
