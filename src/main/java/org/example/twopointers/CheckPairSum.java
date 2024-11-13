package org.example.twopointers;

/*
    Given arr[n] distinct sorted elements , check if there exists a pair(i,j) such that
    arr[i]+arr[j] = k && i!=j
 */
public class CheckPairSum {
    public static void main(String[] args) {
        int arr[] = {3,7,8,12,19};
        int k = 15;
        int n = arr.length;
        int i=0;
        int j=n-1;

        while(i<j){
            int sum = arr[i]+arr[j];
            if(sum==k){
                System.out.println(arr[i]+":"+arr[j]);
                break;//if we want all the pairs, don't break
            }
            if(sum>k){
                j--;
            }else{
                i++;
            }
        }

    }
}
