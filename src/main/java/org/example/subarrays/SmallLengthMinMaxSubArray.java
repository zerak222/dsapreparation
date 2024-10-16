package org.example.subarrays;

/**
 *
 * Given an array of N integers, return the length of the smallest subarray which contains both
 * minimum and maximum element of the array.
 */
public class SmallLengthMinMaxSubArray {

    public static void main(String args[]){
        int A[] = {2,2,6,4,5,1,5,2,6,4,1};

        int length = lengthOfMinMaxSubArray(A);
        System.out.println(length);
    }

    private static int lengthOfMinMaxSubArray(int[] a) {
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        int lastMaxIndex = -1;
        int lastMinIndex = -1;

        int ans = Integer.MAX_VALUE;

        // find max and min values
        for(int i=0;i<a.length;i++){
            if(a[i]>maxValue){
                maxValue = a[i];
            }
            if(a[i]<minValue){
                minValue = a[i];
            }
        }

        for(int i=0;i<a.length;i++){
            if(a[i]==maxValue){
                lastMaxIndex = i;
                if(lastMinIndex!=-1){
                    ans = Math.min(ans,lastMaxIndex-lastMinIndex+1);
                }

            }

            if(a[i]==minValue){
                lastMinIndex = i;
                if(lastMaxIndex!=-1){
                    ans = Math.min(ans,lastMinIndex-lastMaxIndex+1);
                }
            }
        }

        return ans;
    }
}
