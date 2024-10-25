package org.example.twodarrays;

public class PrintOuterMostLoop {
    public static void main(String[] args) {
        int a[][]= {
                {10,20,25,15,12},
                {19,18,13,28,101},
                {15,5,6,7,34},
                {9,94,38,10,28},
                {6,7,8,12,55}
                    };

        int i=0;
        int j=0;
        int rowLength = a.length;
            for(int k=1;k<rowLength;k++){
                System.out.print(a[i][j]+" ");
                j++;
            }
            for(int k=1;k<rowLength;k++){
                System.out.print(a[i][j]+" ");
                i++;
            }
            for(int k=1;k<rowLength;k++){
                System.out.print(a[i][j]+" ");
                j--;
            }
            for(int k=1;k<rowLength;k++){
                System.out.print(a[i][j]+" ");
                i--;
            }
    }
}
