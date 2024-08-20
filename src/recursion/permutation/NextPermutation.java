package recursion.permutation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2};
        List<List<Integer>> result = new ArrayList<>();
        nextPermutation(arr, result, 0);
        System.out.println(result);
    }

    public static void nextPermutation(int[] arr, List<List<Integer>> result, int index){
        // base condition
        if(index == arr.length){
            List<Integer> array = new ArrayList<>();
            for(int no: arr){
                array.add(no);
            }

            result.add(array);
            return;
        }

        // HashSet to keep track of elements that are already considered at this index
        HashSet<Integer> appeared = new HashSet<>();


        //iterate through the entire array
        for(int i = index; i < arr.length; i++){
            // Skip if the element has already appeared at this level
            if (appeared.contains(arr[i])) continue;
            swap(arr, i, index);
            nextPermutation(arr, result, index+1);
            swap(arr, i, index);
        }
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
