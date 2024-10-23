package org.example.arrays.prefixarray;

import java.util.Arrays;

/*
    Given an array with all elements=0, and Q queries.
    Each query will have {start,end, val} do + val in the range start to end.
    Return the final array.
 */
public class ContinuousSumQuery {
    public static void main(String[] args) {

        int queries[][]={
                            {3,6,1},
                            {2,7,3},
                            {4,6,5},
                            {1,5,-4}
                        };
        // approach1
        int ans1[] = approach1(queries);
        System.out.println(Arrays.toString(ans1));

        // approach2
        int ans2[]=approach2(queries);
        System.out.println(Arrays.toString(ans2));
    }

    private static int[] approach2(int[][] queries) {
        int ans[] = {0,0,0,0,0,0,0,0,0,0};
        for(int i=0;i<queries.length;i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int v = queries[i][2];
            ans[s]+=v;
            if((e+1)<ans.length) // bound check
                ans[e+1]+=-v;
        }
        // prefix sum array

        for(int i=1;i<ans.length;i++){
            ans[i]+=ans[i-1];
        }
        return ans;
    }

    private static int[] approach1( int[][] queries) {
        int ans[] = {0,0,0,0,0,0,0,0,0,0};

        for(int i=0;i<queries.length;i++){
            int s=queries[i][0];
            int e=queries[i][1];
            int v=queries[i][2];

            for(int j=s;j<=e;j++){
                ans[j]=ans[j]+v;
            }
        }


        return ans;
    }
}
