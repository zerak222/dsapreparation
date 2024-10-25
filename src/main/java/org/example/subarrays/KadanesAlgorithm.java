package org.example.subarrays;

/*
   Maximum Subarray sum

   Given an array arr[] find the subarray that has the maximum sum and return its sum.

   Ex 1 :
    arr[] = {2,3,-8,7,-1,2,3}
    subarray {7,-1,2,3} , sum = 11
    ans = 11

 */
public class KadanesAlgorithm {
    public static void main(String[] args) {
        int arr[] = {2,3,-8,7,-1,2,3};
        int sum = arr[0];
        int maxCurrent = arr[0];
        for(int i=1;i<arr.length;i++){
                maxCurrent = Math.max(arr[i],maxCurrent+arr[i]);
                if(sum<maxCurrent){
                    sum=maxCurrent;
                }
        }

        System.out.println("Answer : "+sum);
    }
}
