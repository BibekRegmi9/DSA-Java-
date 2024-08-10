package recursion.array;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {13, 5, 7, 6, 9, 56};
        int target = 6;
        System.out.println(linearSearch(arr, 0, target));
    }

    public static int linearSearch(int[] arr, int index, int target){
        if(index > arr.length-1){
            return -1;
        }

        if(arr[index] == target){
            return index;
        }

        return linearSearch(arr, index + 1, target);
    }
}
