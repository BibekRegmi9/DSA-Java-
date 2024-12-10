package array.trappingRainWater;

import java.util.ArrayList;

public class TrappingRainWater {

    public static void main(String[] args) {
        int[] height = {4,2,0,3,2,5};
        int ans = trappingRainWater(height);
        System.out.println(ans);
    }
    public static int trap(int[] height) {
//        ArrayList<Integer> leftMax = new ArrayList<>();
//        ArrayList<Integer> rightMax = new ArrayList<>();
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];
        int water = 0;

        int n = height.length;
        for(int i = 0; i < n; i++){
            leftMax[i] = Math.max(leftMax[i-1], height[i-1]);
            rightMax[n-1] = 0;
        }

        for(int i = n-2; i >= 0; i--){
            rightMax[i] = Math.max(rightMax[i+1], height[i + 1]);
            water = 0;
        }

        for(int i = 0; i < n; i++){
            int minHeight = Math.min(leftMax[i], rightMax[i]);

            if(minHeight - height[i] >= 0){
                water += minHeight - height[i];
            }
        }

        return water;
    }

    public static int trappingRainWater(int[] height){
//        height = {4,2,0,3,2,5};
        if (height == null || height.length == 0) return 0;
        int n = height.length;

        int[] leftmax = new int[n];
        int[] rightMax = new int[n];

        // fill the leftmax array
        leftmax[0] = height[0];
        for(int i = 1; i < n; i++){
//            System.out.println(leftmax[i-1]);
//            System.out.println(height[i]);
            leftmax[i] = Math.max(leftmax[i-1], height[i]);
        }

        // fill the right max array
        rightMax[n-1] = height[n-1];
        for(int i = n-2; i >= 0; i--){
//            System.out.println(rightMax[i-1]);
//            System.out.println(height[i]);
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }

        // calculate sum of water
        int water = 0;
        for(int i = 0; i < n; i++){
            int minHeight = Math.min(leftmax[i], rightMax[i]);

            if(minHeight - height[i] >= 0){
                water += minHeight - height[i];
            }
        }
        return water;

    }
}
