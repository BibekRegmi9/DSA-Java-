package array.binarysearch;

public class CountZeros {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 0, 0, 0};
        System.out.println("Number of zeros: " + countZeroes(arr)); // Output: 3
    }

    public static int countZeroes(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int firstZeroIndex = -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == 0){
                firstZeroIndex = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return arr.length - firstZeroIndex;
    }
}
