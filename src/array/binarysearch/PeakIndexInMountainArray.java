package array.binarysearch;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr = {0,10,5,2};
        int ans = peakIndexInMountainArr(arr);
        System.out.println(ans);
    }

    public static int peakIndexInMountainArr(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
//            int mid = start + (end - start)/2;
            int mid = end + (start - end)/2;

            // peak element
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
                return mid;
            }

            //right side
            if(arr[mid] > arr[mid-1]){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
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
}
