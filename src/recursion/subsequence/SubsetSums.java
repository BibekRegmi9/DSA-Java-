package recursion.subsequence;

import java.util.List;

public class SubsetSums {
    public static void main(String[] args) {
// List to store all subset sums

    }
    public static void generateSubsetSum(int[] arr, int index, List<Integer> ans, int currentSum){
        if(index == arr.length){
            ans.add(currentSum);
            return;
        }

        // take
        generateSubsetSum(arr, index+1, ans, currentSum+arr[index]);

        //don't take
        generateSubsetSum(arr, index+1, ans, currentSum);

    }

}
