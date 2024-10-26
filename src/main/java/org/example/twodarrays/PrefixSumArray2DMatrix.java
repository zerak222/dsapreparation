package org.example.twodarrays;

import java.util.Arrays;

public class PrefixSumArray2DMatrix {
    public static void main(String[] args) {
        int a[][] = {
                {3,2,4,1,6},
                {-1,4,3,2,4},
                {2,7,6,3,2},
                {1,2,7,8,1}
                     };

        int ps[][] = getPrefixArray(a);



        System.out.println("Answer : "+ Arrays.deepToString(ps));

    }

    private static int[][] getPrefixArray(int[][] a) {
        int n = a.length;
        int m = a[0].length;
        int pfSum[][]= new int [n][m];

        // apply prefix sum row wise
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(j==0){
                    pfSum[i][j]=a[i][j];
                }else{
                    pfSum[i][j]= pfSum[i][j-1]+a[i][j];
                }
            }
        }

        // apply prefix sum col wise
        for(int j=0;j<m;j++){
            for(int i=1;i<n;i++){
                pfSum[i][j]=pfSum[i-1][j]+pfSum[i][j];
            }
        }
        return pfSum;
    }
}
