package org.example.bitmanipulation;

/*
    Given ar[N], where every element repeats thrice except for 1 element, which occurs once.
    Find that unique element.
 */
public class FindUniqueElement3RepeatingNum {
    public static void main(String[] args) {
        int arr[] = {4,5,5,4,1,6,6,4,5,6};
        int n = arr.length;
        int ans = 0;
        for(int i=0;i<32;i++){
            int count =0;
            // count no of set bits in i th position
            for(int j=0;j<n;j++){
                if((arr[j]&(1<<i))>0){
                    count++;
                }
            }
            // if the count is divisible by 3 , if not then set ith bit in ans
            if(count % 3 !=0){
                ans = ans | (1<<i);
            }
        }
        System.out.println("ans:"+ans);
    }
}
