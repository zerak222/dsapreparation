package org.example.bitmanipulation;

public class FindNoOfSetBits {
    public static void main(String[] args) {
        int a = 8;

        int count =0;
        for(int i=0;i<32;i++){
            if((a &(1<<i))>0){
                count++;
            }
        }

        System.out.println(count);
    }
}
