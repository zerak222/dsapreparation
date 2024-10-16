package org.example.subarrays;

public class PrintSubArrays {

    public static void main(String args[]){

        int arr[] = {1,2,3,4,5};
        int length = arr.length;
        for(int start=0;start<length;start++){
            for(int end=start;end<length;end++){
                printArray(start,end,arr);
            }
        }

    }

    public static void printArray(int start,int end,int arr[]){
        for(int i=start;i<=end;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
