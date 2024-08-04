package array.binarysearch;

import java.util.Arrays;
import java.util.Collections;

public class BookAllocation {
    public static void main(String[] args) {
    }

    public static int findPages(int[]A,int N,int M)
    {
        if(M > N){
            return -1;
        }

        int start = 0;
        int end = 0;
        int ans = 0;
        int mid;

        for(int i = 0; i < N; i++){
            start = Arrays.stream(A).max().getAsInt();
            end += A[i];
        }

        while(start <= end){
            mid = start + (end - start)/2;

            int pages = 0;
            int count = 1;

            for(int i = 0; i < N; i++){
                pages += A[i];
                if(pages > mid){
                    count++;
                    pages += A[i];
                }
            }

            if(count <= M){
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }


}
