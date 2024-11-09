package array.basics;

public class Searching {
    public static void main(String[] args) {
        int[] arr = {2, 4, 7};
        System.out.println(search(arr, 4));
    }

    static int search(int arr[], int x) {

        // Your code here
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }

}
