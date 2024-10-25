package org.example.subarrays;

/**
 * Given array a[n] elements and k, return max subarray sum of length = k
 */
public class MaxSubarraySumLengthK {
    public static void main(String[] args) {
        int arr[] = {2,3,1,-3,10};
        int k = 3;
        // TC : o(n^2),SC: o(1)
        approach1(arr,k);
        // TC : o(n), SC: o(n)
        approach2(arr,k);
        // TC : o(n), SC: o(1)
        approach3(arr,k);
    }
    /*
        Approach without using prefix sum array, sliding window technique
     */
    private static void approach3(int[] arr, int k) {
        int n=arr.length;
        // find the sum of first window starting from 0
        int sum = 0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int ans = sum;
        int s=1;
        int e=k;
        while(e<n){
            sum = sum+arr[e]-arr[s-1];
            if(sum>ans){
                ans=sum;
            }
            s++;
            e++;
        }
        System.out.println("Answer Approach3:"+ans);
    }
    /*
        Same as approach1 , but instead of looping to find the sum, use prefix sum array
     */

    private static void approach2(int[] arr,int k) {
        int n= arr.length;
        int pfSum[] = new int[n];
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            pfSum[i]=sum;
        }
        int s=0;
        int e=k-1;
        int ans = Integer.MIN_VALUE;
        while(e<n){
            int tempSum=0;
            if(s==0){
                tempSum = pfSum[e];
            }else{
                tempSum = pfSum[e]-pfSum[s-1];
            }
            ans = Math.max(tempSum,ans);

            e++;
            s++;
        }
        System.out.println("Answer Approach2:"+ans);
    }

    /*
        Iterate through each k length array and find the sum and update the answer for max sum
     */
    private static void approach1(int[] arr,int k) {
            int n = arr.length;
            int s= 0 ,e=k-1;
            int ans = Integer.MIN_VALUE;
            while(e<n){
                int sum = 0;
                for(int i=s;i<=e;i++){
                    sum = sum+arr[i];
                }
                if(sum>ans){
                    ans = sum;
                }
                e++;
                s++;
            }
            System.out.println("Answer Approach1:"+ans);
    }
}
