package array.binarysearch;

public class PainterPartition {
    public static void main(String[] args) {

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
