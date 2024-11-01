package org.example.bitmanipulation;

/*
  Unset the ith bit of number n if it is set
 */
public class UnsetIthBitIfSet {
    public static void main(String[] args) {
        int n =26;
        int i=3;

        int ans =solve(n,i);
        System.out.println(ans);


    }

    private static int solve(int n, int i) {
        if((n & (1<<i))==0){
            return n;
        }else{
            return n^(1<<i);
        }
    }
}
