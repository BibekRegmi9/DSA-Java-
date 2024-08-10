package recursion.array;

public class BinarySearch {

    public static void main(String[] args) {
        int arr[] = {2, 4, 6 ,7 ,9};
        System.out.println(binarySearch(arr, 0, arr.length-1, 9));
    }

    public static int binarySearch(int[] arr, int start, int end, int target){
        if(start > end){
            return -1;
        }

        int mid = start + (end - start)/2;

        if(arr[mid] == target){
            return mid;
        } else if(arr[mid] < target){
            return binarySearch(arr, mid+1, end, target);
        } else {
            return binarySearch(arr, start, mid-1, target);
        }
    }
}
