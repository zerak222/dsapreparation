package org.example.twodarrays;
/*
    Given a 2d array which is sorted both row wise and column wise,
    find if an element k exists in that array or not.
 */
public class BinarySearchIn2DArray {
    public static void main(String[] args) {

        int arr[][]= {{10,20,30,40,50},
                      {12,22,35,45,58},
                      {18,25,49,54,68},
                      {38,48,55,59,72}
                     };
        int k = 51;

        int n = arr.length;
        int m = arr[0].length;
        int i=0;
        int j= m-1;
        boolean elementFound = false;
        while(i<n && j>=0){
            if(arr[i][j]==k){
                elementFound=true;
                System.out.println("Element found at index:("+i+","+j+")");
                break;
            }else if(arr[i][j]>k){
                j--;
            }else if(arr[i][j]<k){
                i++;
            }
        }
        if(!elementFound){
            System.out.println("Element not found");
        }

    }
}
