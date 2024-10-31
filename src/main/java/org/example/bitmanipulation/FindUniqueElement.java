package org.example.bitmanipulation;

/*
    Given array of N elements, each elements repeats twice in the except one element.
    Find that one element?
 */
public class FindUniqueElement {
    public static void main(String[] args) {
        int arr[] = {1,2,1,2,3,4,5,3,4};

        int ele = arr[0];
        for(int i=1;i<arr.length;i++){
            ele = arr[i]^ele;
        }
        System.out.println("Ans:"+ele);
    }
}
