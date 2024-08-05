package recursion.array;

import com.sun.tools.javac.Main;

public class FindMininArr {
    public static void main(String[] args) {
        int[] arr = {3, 5, 10, 12, 15, 19, 23, 30, 2};
//        System.out.println(findMin(arr, 0, 8));
        System.out.println(findMax(arr, 0, 8));
    }

    static int findMin(int[] arr, int index, int n){
        if(index == n){
            return arr[index];
        }
        return Math.min(arr[index], findMin(arr, index+1, n));
    }

    static int findMax(int[] arr, int index, int n){
        if(index == n){
            return arr[index];
        }
        return Math.max(arr[index], findMax(arr, index+1, n));
    }
}
