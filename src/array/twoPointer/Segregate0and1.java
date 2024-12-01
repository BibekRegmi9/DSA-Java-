package array.twoPointer;

public class Segregate0and1 {
    public static void main(String[] args) {

    }

//    Note: For bruteforce solution sort the array and get the answer
    void segregate0and1(int[] arr, int n) {
        // code here
        int start  = 0;
        int end = arr.length-1;

        while(start < end){
            if(arr[start] == 0){
                start++;
            } else {
                if(arr[end] == 0){
                    swap(arr ,start, end);
                    start++;
                    end--;
                } else {
                    end--;
                }
            }
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
