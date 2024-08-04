package recursion.array;

public class PrintArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
    }

    public static void printArr(int[] arr, int index){
        if(index == arr.length){
            return;
        }

        System.out.println(arr[index]);
        printArr(arr, index+1);
    }
}
