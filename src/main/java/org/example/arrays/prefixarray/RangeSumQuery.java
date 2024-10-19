package org.example.arrays.prefixarray;

public class RangeSumQuery {

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};

        int[] pfSumArray = prefixSumArray(a);

        int range[][] ={{1,2},{1,3},{2,4}};

        for(int i=0;i<range.length;i++){
            int start = range[i][0];
            int end = range[i][1];
            if(start==0){
                System.out.println(pfSumArray[end]);
            }else{
                System.out.println(pfSumArray[end]-pfSumArray[start-1]);
            }
        }
    }

    private static int[] prefixSumArray(int[] a) {
        int pfSum[] = new int[a.length];
        int sum = 0;
        // Prepare and print prefix sum array
        for(int i = 0; i< a.length; i++){
            sum = sum+ a[i];
            pfSum[i]=sum;
        }
        return pfSum;
    }
}
