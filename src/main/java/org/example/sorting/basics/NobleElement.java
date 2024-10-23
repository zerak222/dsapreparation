package org.example.sorting.basics;

import java.util.Arrays;

/**
 *  Given an array arr[] of integers, find the count of Noble Integers
 *
 *  An arr[i] is noble if count of elements smaller than arr[i] equals arr[i]
 *
 *
 *  Example :
 *
 *  1) Array a = {1,-5,3,5,-10,4}
 *          sorted array = {-10,-5,1,3,4,5}
 *                indexes     0,1, 2,3,4,5
    less elements count       0,1, 2,3,4,5
           ans where (count = arr[i])  all satisfy => 6

    2)  Array a = {1,-5,3,5,-10,4}
          sorted ={-10,-5,1,3,4,5}
          count  =   0, 1,2,3,4,5
          ans(where count=arr[i]) = 3  (3,4,5 indices)

    3) Repeating elements

        Array a = {-10,1,1,3,100}
         already sorted
         count  =    0,1,1,3,4
         ans(where count=arr[i]) = 3 ( 1,2,3 indices)
 *
 *
 */
public class NobleElement {

    public static void main(String[] args) {

        int a[] = {-10,1,1,3,100};
        int ans = 0;
        Arrays.sort(a);
        if(a[0]==0){
            ans++;
        }
        int count = 0;
        for(int i=1;i<a.length;i++){
            if(a[i]!=a[i-1]){
                count = i;
            }
            if(count==a[i]){
                ans++;
            }
        }

        System.out.println("Nobel elements count: "+ans);

    }
}
