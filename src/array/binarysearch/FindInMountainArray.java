package array.binarysearch;

public class FindInMountainArray {
    public static void main(String[] args) {

    }

    int findInMountainArray(int[] arr, int target){
        int peakNum = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peakNum);
        if(firstTry != -1){
            return firstTry;
        }

        return orderAgnosticBS(arr, target, peakNum+1, arr.length-1);
    }

    public int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end -start)/2;

            if(mid > arr[mid+1]){
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end){
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                } else if(target > arr[mid]){
                    start = mid + 1;
                }
            } else {
                if(target > arr[mid]){
                    end = mid - 1;
                } else if(target < arr[mid]){
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
}
