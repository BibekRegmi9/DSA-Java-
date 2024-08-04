package array.binarysearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int[] arr = {-56, -10, -1, 5, 12, 34};
        int[] arr = {34, 12, 5, -1, -10, -56};
        int target =  5;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

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
