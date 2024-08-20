package recursion.subsequence;

public class TargetSumWithRepetation {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4};
        int sum = 6;
        System.out.println(targetSum(arr, 0, sum));
    }

    public static int targetSum(int[] arr, int index, int sum){
        if(sum == 0){
            return 1;
        }

        if(index == arr.length || sum < 0){
            return 0;
        }

        return targetSum(arr, index + 1, sum) + targetSum(arr, index, sum - arr[index]);
    }
}
