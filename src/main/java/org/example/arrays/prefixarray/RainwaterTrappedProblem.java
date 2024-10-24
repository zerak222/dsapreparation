package org.example.arrays.prefixarray;

import java.util.Arrays;

public class RainwaterTrappedProblem {
    public static void main(String[] args) {
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        //int height[] = {2,3,1,2,4,3,5};
        System.out.println(trap(height));
    }

    public static int trap(int[] height) {
        int n = height.length;
        int pfMax[] = new int[n];
        int max1=height[0];
        for(int i=0;i<n;i++){
            pfMax[i]=Math.max(max1,height[i]);
            max1=pfMax[i];
        }
        int sfMax[] = new int[n];
        int max2=height[n-1];
        for(int i=n-1;i>=0;i--){
            sfMax[i]=Math.max(max2,height[i]);
            max2=sfMax[i];
        }
        int totalWater = 0;
        for(int i=1;i<n-1;i++){
            int h1 = height[i];
            int rH= sfMax[i+1];
            int lH = pfMax[i-1];
            int amount = Math.min(lH,rH) - h1;
            if(amount>0){
                totalWater += amount;
            }

        }
        return totalWater;
    }
}
