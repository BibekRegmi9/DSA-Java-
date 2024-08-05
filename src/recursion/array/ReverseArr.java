package recursion.array;

public class ReverseArr {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 10, 12, 15, 19, 23, 30};
        reverseArr(arr, arr.length-1);
    }

    public static void reverseArr(int[] arr, int index){
        if(index < 0){
            return;
        }

        System.out.println(arr[index]);
        reverseArr(arr, index-1);
    }
}
