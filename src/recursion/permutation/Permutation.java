package recursion.permutation;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        // for array
//        int[] arr = {1, 2, 3};
//        List<List<Integer>> result = new ArrayList<>();
//        List<Integer> current = new ArrayList<>();
//        permutation(arr, result, current);
//        System.out.println(result);

        // for string
//        String str = "abc";
//        List<String> result = new ArrayList<>();
//        String current = "";
//        findPermutation(str, result, current);
//        System.out.println(result);

        // permutationWithoutTemp
        int[] arr = {1, 2, 3};
        List<List<Integer>> result = new ArrayList<>();
        permutationWithoutTemp(arr, result, 0);
        System.out.println(result);

    }

    // in array
    public static void permutation(int[] arr, List<List<Integer>> result, List<Integer> current){
        // base condition
        if(current.size() == arr.length){
            result.add(new ArrayList(current));
            return;
        }

        // iterate through each number in the array
        for(int i = 0; i < arr.length; i++){
            if(current.contains(arr[i])){
                continue;
            }

            // Choose the current number and add to the current list
            current.add(arr[i]);

            // Recursively generate permutations with the remaining numbers
            permutation(arr, result, current);

            // Backtrack by removing the last added number to explore other permutations
            current.removeLast();
        }

    }

    // in string
    public static void findPermutationInString(String arr, List<String> result, String current){
        // base condition
        if(current.length() == arr.length()){
            result.add(current);
            return;
        }

        // iterate through each character in the string
        for(int i = 0; i < arr.length(); i++){
//            if(current.contains(String.valueOf(arr.charAt(i)))){
            if(current.contains(arr)){
                continue;
            }
            // Choose the current number and add to the current list
            current = current + arr.charAt(i);

            // Recursively generate permutations with the remaining character
            findPermutationInString(arr, result, current);

            // Backtrack by removing the last added character to explore other permutations
            current = current.substring(0, current.length()-1);
        }
    }


    // best approach
    //without using temp
    public static void permutationWithoutTemp(int[] arr, List<List<Integer>> result, int index) {
        // base condition
        if (index == arr.length) {
            List<Integer> array = new ArrayList<>();
            for (int no : arr) {
                array.add(no);
            }
            result.add(array);
            return;
        }

        // iterate through each number in the array
        for (int i = index; i < arr.length; i++) {
            swap(arr, i, index);
            permutationWithoutTemp(arr, result, index + 1);
            swap(arr, i, index);
        }
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
