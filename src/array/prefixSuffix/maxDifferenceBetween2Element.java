package array.prefixSuffix;

public class maxDifferenceBetween2Element {
    public static void main(String[] args) {
        int[] arr = {2, 3, 10, 6, 4, 8, 1};
        int ans = maxDifferenceBruteforce(arr);
        System.out.println(ans);
    }

    public static int maxDifferenceBruteforce(int[] arr){
        int maxDifference = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j < arr.length; j++){
                maxDifference = Math.max(maxDifference, arr[j] - arr[i]);
            }
        }
        return  maxDifference;
    }
}
