package array.binarysearch;

public class KthMissingPositiveNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int ans = findKthPositive(arr, 5);
        System.out.println(ans);
    }

    public static int findKthPositive(int[] arr, int k){
        for(int i : arr){
            if(i <= k) k++;
            else break;
        }
        return k;
    }
}
