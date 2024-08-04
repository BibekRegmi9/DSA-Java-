package array.prefixSuffix;

public class maxSubArrayORKadaneAlgo {
    long maxSubarraySum(int arr[], int n){
        Long max = (long) Integer.MIN_VALUE;
        Long prefix = 0L;
        for(int i = 0; i < arr.length; i++){
            prefix += arr[i];
            max = Math.max(max, prefix);

            if(prefix < 0){
                prefix = 0L;
            }
        }
        return max;
    }
}
