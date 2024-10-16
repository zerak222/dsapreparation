package org.example.arrays;

import java.util.Arrays;

public class RotateKTimes {
    public static void main(String args[]){

        int arr[]={1,2,3,4,5,6};

        // rotate 3 times
        reverseInRange(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        reverseInRange(arr,0,2);
        System.out.println(Arrays.toString(arr));
        reverseInRange(arr,3,arr.length-1);

        System.out.println(Arrays.toString(arr));

    }

    public static void reverseInRange(int arr[],int fromIndex,int toIndex){
        int start = fromIndex;
        int end = toIndex;
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}


