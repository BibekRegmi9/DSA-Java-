package recursion.array;

public class PrintArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 10, 12, 15, 19, 23, 30};
        int n = arr.length;
        printArr(arr, 0, n);
    }

    public static void printArr(int[] arr, int index, int n){
        if(index == n){
            return;
        }

        System.out.println(arr[index]);
        printArr(arr, index+1, n);
    }
}
