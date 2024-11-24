package array.binarysearch;

import java.util.Arrays;

public class ShipPackages {
    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        int ans = shipWithinDays(weights, days);
        System.out.println(ans);
    }

    public static int shipWithinDays(int[] weights, int days){
        if(days > weights.length){
            return -1;
        }

        int start = Arrays.stream(weights).max().getAsInt();
        int end = Arrays.stream(weights).sum();
        int ans = -1;

        while(start <= end){
            int mid = start + (end-start)/2;

            int count = 1;
            int weight = 0;

            for(int i = 0; i < weights.length; i++){
                weight += weights[i];

                if(weight > mid){
                    count++;
                    weight = weights[i];
                }
            }

            if(count <= days){
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
