package array.binarysearch;

public class bsImpl {
    public static void main(String[] args) {
        int[] arr = {-4, -1 , 0, 2, 5, 9, 12, 32, 69, 87, 90};
        int target = 69;
        System.out.println(binarySearch(arr, target));
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

}
