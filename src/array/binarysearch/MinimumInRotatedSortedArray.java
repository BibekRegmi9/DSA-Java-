package array.binarysearch;

public class MinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        int ans = findMin(arr);
        System.out.println(ans);
    }

    public static int findMin(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int ans = arr[0];

        while(start <= end){
            int mid = start + (end - start)/2;

            // left sorted
            if(arr[mid] >= arr[0]){
                start = mid + 1;
            } else {
                //right side sorted
                ans = arr[mid];
                end = mid - 1;
            }
        }
        return ans;
    }
}
