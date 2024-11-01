package org.example.bitmanipulation;
/*
    A Group of computer scientists is working on a project that involves encoding binary numbers.
    They need to create a binary number with a specific pattern for their project.
    The pattern requires A 0's followed by B 1's followed by C 0's.
    To simplify the process, they need a function that takes A,B and C as inputs and returns the decimal value of the
    resulting binary number.
    Can you help them by writing a function that can solve this problem efficiently?
 */
public class ScientistsProblem {
    public static void main(String[] args) {
        int answer = solve(4, 3, 2);
        System.out.println(answer);
    }

    public static int solve(int A,int B,int C){
        int ans=0;
        int start = B+C-1;
        for(int i=start;i>=C;i--){
            ans = ans+(1<<i);
        }
        return ans;
    }
}
