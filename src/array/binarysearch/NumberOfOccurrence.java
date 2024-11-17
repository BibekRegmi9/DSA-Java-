package array.binarysearch;

public class NumberOfOccurrence {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 2, 3};
        int ans = noOfOccurance(arr, 2);
        System.out.println(ans+1);
    }

    public static int noOfOccurance(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target == arr[mid]){
                return mid;
            }
            if(target < arr[mid]){
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return ans;
    }
}
