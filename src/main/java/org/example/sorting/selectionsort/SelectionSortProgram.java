package org.example.sorting.selectionsort;

import java.util.Arrays;

public class SelectionSortProgram {
    public static void main(String[] args) {
        int a[] = {2,1,5,3,4,7,6};
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    private static void sort(int[] a) {
        int n = a.length;
        for(int i=0;i<n-1;i++){
            int minIndex=i;
            int currElement = a[i];
            for(int j=i+1;j<n;j++){
                if(a[j]<a[minIndex]){
                    minIndex=j;
                }
            }
            // swap min index element with chosen element
            if(minIndex!=i){
                int temp = a[minIndex];
                a[minIndex]=a[i];
                a[i]=temp;
            }
        }

    }
}
