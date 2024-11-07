package org.example.bitmanipulation;


import java.util.*;

public class Subsets {
    public static void main(String[] args) {
        int a[] = {3,2,4};
        int arrLength = a.length;
        int n = 1<<(a.length);
        List<List<Integer>> li = new ArrayList();
        for(int i=0;i<n;i++){
            List<Integer> li1 = new ArrayList<>();
            for(int j=0;j<arrLength;j++){
                if(checkbit(i,j)){
                    li1.add(a[j]);
                }
            }
            li.add(li1);
        }
        System.out.println(li);
    }

    private static boolean checkbit(int i, int j) {
        if((i & (1<<j))>0){
            return true;
        }
        return false;
    }
}
