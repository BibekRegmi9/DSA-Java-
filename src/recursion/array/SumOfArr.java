package recursion.array;

public class SumOfArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(sum(arr, 0, arr.length));
    }

    static int sum(int[] arr, int index, int n){
        if(index == n){
            return 0;
        }

        return arr[index] + sum(arr, index+1, n);
    }
}
