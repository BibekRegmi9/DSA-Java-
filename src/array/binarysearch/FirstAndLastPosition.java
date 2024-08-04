package array.binarysearch;

public class FirstAndLastPosition {
    public static void main(String[] args) {

    }

    static int[] findFirstAndLastPosition(int[] arr, int target){
        int[] ans = {-1, -1};

        int start = binarySearch(arr, target, true);
        int end = binarySearch(arr, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    public static int binarySearch(int[] arr, int target, boolean firstStartIndex){
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid + 1;
            } else {
                ans = mid;

                if(firstStartIndex){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
