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

    public static int findKthMissingPositive(int[] arr, int k) {

        int start = 0;
        int end = arr.length-1;
        int ans = arr.length;
        while(start <= end){
            int mid = start + (end - start)/2;

            if((arr[mid] - mid - 1) >= k){
                end = mid - 1;
                ans = mid;
            } else {
                start = mid + 1;
            }
        }

        return ans + k;
    }
}
