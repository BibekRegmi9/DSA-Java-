package array.binarysearch;

import java.util.Arrays;

public class AgressiveCows {
    public static void main(String[] args) {

    }

    public static int solve(int n, int k, int[] stalls) {
        int start = 1;
        int end;
        int mid;
        int ans = 0;

        Arrays.sort(stalls);

        end = stalls[n - 1] - stalls[0];


        while (start <= end) {
            mid = start + (end - start) / 2;

            int count = 1;
            int pos = stalls[0];

            for (int i = 0; i < n; i++) {
                if (pos + mid <= stalls[i]) {
                    count++;
                    pos = stalls[i];
                }
            }

            if (count < k) {
                end = mid - 1;
            } else {
                ans = mid;
                start = mid + 1;
            }
        }
        return ans;
    }
}
