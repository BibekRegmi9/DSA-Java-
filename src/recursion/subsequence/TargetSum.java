package recursion.subsequence;

public class TargetSum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 6};
        System.out.println(targetSum(arr, 0, 8));
    }

    public static boolean targetSum(int[] arr, int index, int target){

        if(target == 0){
            return true;
        }

        if(index == arr.length || target < 0){
            return false;
        }

//        return targetSum(arr, index + 1, target) || targetSum(arr, index + 1, target - arr[index]);

        //include
        boolean include = targetSum(arr, index+1, target-arr[index]);


        //dont include
        boolean notInclude = targetSum(arr, index+1, target);

        return include || notInclude;
    }
}
