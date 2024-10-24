package org.example.arrays.prefixarray;

import java.util.Arrays;

public class PrefixAndSuffixMaxArray {
    public static void main(String[] args) {
        int a[]={2,4,3,1,12,5,6,8};
        int n=a.length;
        int pfMax[]=new int[n];
        int sfMax[]=new int[n];

        int ele = a[0];
        for(int i=0;i<n;i++){
            pfMax[i]=Math.max(ele,a[i]);
            ele =pfMax[i];
        }
        int sfEle = a[n-1];
        for(int i=n-1;i>=0;i--){
            sfMax[i]=Math.max(sfEle,a[i]);
            sfEle=sfMax[i];
        }

        System.out.println("PrefixMax array:"+ Arrays.toString(pfMax));
        System.out.println("SuffixMax array:"+ Arrays.toString(sfMax));

    }
}
