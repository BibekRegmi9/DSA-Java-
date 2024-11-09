package array.basics;

public class SecondLargestInArr {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int ans = getSecondLargest(arr);
        System.out.println(ans);
    }

    public static int getSecondLargest(int[] arr) {
        int ans = Integer.MIN_VALUE;

        // to find largest element
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > ans){
                ans = arr[i];
            }
        }

        //to find second largest element
        int secondMaxNo = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > secondMaxNo && arr[i] < ans){
//                secondMaxNo = Math.max(secondMaxNo, arr[i]);
                secondMaxNo = arr[i];
            }
        }
//        return secondMaxNo;
        return secondMaxNo == Integer.MIN_VALUE ? -1 : secondMaxNo;

    }
}
