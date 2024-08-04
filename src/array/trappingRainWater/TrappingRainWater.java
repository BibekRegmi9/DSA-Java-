package array.trappingRainWater;

import java.util.ArrayList;

public class TrappingRainWater {
    public int trap(int[] height) {
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
}
