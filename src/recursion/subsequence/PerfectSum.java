package recursion.subsequence;

public class PerfectSum {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 1};
        System.out.println(perfectSum(arr, 0, 8));



    }

    public static int perfectSum(int[] arr, int index, int sum){
        if(index == arr.length){
            return sum == 0 ? 1 : 0;
//            if(sum == 0) return 1;
//            else return 0;
        }

        return perfectSum(arr, index + 1, sum) + perfectSum(arr, index + 1, sum - arr[index]);
    }


}
