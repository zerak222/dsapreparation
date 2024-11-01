package org.example.bitmanipulation;

public class FindNoOfSetBits {
    public static void main(String[] args) {
        int a = 8;
        // using left shift
        int count =0;
        for(int i=0;i<32;i++){
            if((a &(1<<i))>0){
                count++;
            }
        }

        System.out.println(count);

        // using right shift
        int rCount = 0;
        while(a>0){
            if((a&1)>0){
                rCount++;
            }
            a = a>>1;
        }
        System.out.println(rCount);
    }
}
