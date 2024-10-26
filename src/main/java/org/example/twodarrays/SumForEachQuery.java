package org.example.twodarrays;

public class SumForEachQuery {
    public static void main(String[] args) {


        int a[][] = {
                {3,2,4,1,6},
                {-1,4,3,2,4},
                {2,7,6,3,2},
                {1,2,7,8,1}
        };
        int q[][]={
                {1,2,2,4}
        };

        solve(a,q);
    }

    private static void solve(int[][] a, int[][] q) {

        int ps[][] = getPrefixSumArray(a);

        for(int i=0;i<q.length;i++){
            int x1 = q[i][0];
            int y1 = q[i][1];
            int x2 = q[i][2];
            int y2 = q[i][3];
            int sum = 0;
            sum+=ps[x2][y2];
            if(x1>0){
                sum-=ps[x1-1][y2];
            }
            if(y1>0){
                sum-=ps[x2][y1-1];
            }
            if(x1>0 && y1>0){
                sum+=ps[x1-1][y1-1];
            }
            System.out.println("Query"+i+":"+sum);
        }


    }

    private static int[][] getPrefixSumArray(int[][] a) {
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
