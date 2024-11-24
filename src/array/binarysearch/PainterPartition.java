package array.binarysearch;

import java.util.Arrays;

public class PainterPartition {
    public static void main(String[] args) {
        int[] arr = {5, 10, 30, 20, 15};
        int k = 3;
        Long ans = solution(arr, k);
        System.out.println(ans);
    }

    public static long solution(int[] arr, int k){
        if(k > arr.length){
            return -1;
        }

        long start = Arrays.stream(arr).max().getAsInt();
        long end = Arrays.stream(arr).sum();
        long ans = -1;

        while(start <= end){
            long mid = start + (end - start)/2;

            int count = 1;
            int walls = 0;

            for(int i = 0; i < arr.length; i++){
                walls += arr[i];

                if(walls > mid){
                    count++;
                    walls = arr[i];
                }
            }

            if(count <= k){
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }
    static long minTime(int[] arr,int n,int k){

        Long start = getMax(arr, n);
        Long end = getSum(arr, (long) n);

        while (start < end) {
            Long mid = start + (end - start) / 2;
            Long requiredPainters = numberOfPainters(arr, n, mid);

            if (requiredPainters <= k)
                end = mid;
            else
                start = mid + 1;
        }


        return start;
    }

    static Long getMax(int arr[], int n)
    {
        Long max = (long) Integer.MIN_VALUE;
        for (int i = 0; i < n; i++)
            if (arr[i] > max)
                max = (long) arr[i];
        return max;
    }

    static Long getSum(int arr[], Long n)
    {
        Long total = 0L;
        for (int i = 0; i < n; i++)
            total += arr[i];
        return total;
    }

    static Long numberOfPainters(int[] arr, int n,
                                 Long maxLen)
    {
        Long total = 0L, numPainters = 1L;

        for (int i = 0; i < n; i++) {
            total += arr[i];

            if (total > maxLen) {

                // for next count
                total = (long) arr[i];
                numPainters++;
            }
        }

        return numPainters;
    }
}
