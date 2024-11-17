package array.binarysearch;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int ans = search(arr, 0);
        System.out.println(ans);
    }

    public static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end- start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(arr[mid] >= arr[0]){
                if(arr[mid] >= target && arr[start] <= target){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(arr[mid] <= target && arr[end] >= target){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}
