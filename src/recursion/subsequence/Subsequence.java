package recursion.subsequence;

import java.util.ArrayList;
import java.util.List;

public class Subsequence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        subSequence(arr, 0, ans, temp);
        System.out.println(ans);

    }

    static void subSequence(int[] arr, int index, List<List<Integer>> ans, List<Integer> temp){
        if(index == arr.length){
            ans.add(new ArrayList<>(temp));
            return;
        }

        // not included
        subSequence(arr, index + 1, ans, temp);

        //included
        temp.add(arr[index]);
        subSequence(arr, index + 1, ans, temp);

         }

}
