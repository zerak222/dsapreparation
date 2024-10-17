package org.example.subarrays;



public class SumOfAllSubArrays {
    public static void main(String[] args) {
        int a[] = {3,4,2};
        // brute force approach
        approach1(a);
        // with prefix sum array
        approach2(a);
        // final optimized approach using contribution technique
        approach3(a);
    }

    /**
     * Optimized approach with TC=O(N), Using Contribution technique
     * @param a
     */
    private static void approach3(int[] a) {
        long sum = 0;
        int n = a.length;
        for(int i=0;i<n;i++){
             sum = sum+a[i]*(n-i)*(i+1);
        }
        System.out.println("Answer : "+sum);
    }

    /*
    * Better approach than Brute force , using prefix sum array and finding the sum of elements with
    * that prefix array , TC= O(N^2)
    * */
    private static void approach2(int[] a) {
        // prepare prefix array
        long pf[] = new long[a.length];
        long sum = 0;
        for(int i=0;i<a.length;i++){
            sum= sum+a[i];
            pf[i]=sum;
        }
        long ans=0;
        for(int s=0;s<a.length;s++){
            for(int e=s;e<a.length;e++){
                if(s==0){
                    ans=ans+pf[e];
                }else{
                    ans=ans+pf[e]-pf[s-1];
                }
            }
        }
        System.out.println("Answer : "+ ans);
    }

    /*
    * Brute force where we will find all the sub arrays and just add them element by element to the sum
    * TC : O(N^3)
    * */
    private static void approach1(int[] a) {
        long sum = 0;
        for(int s=0;s<a.length;s++){
            for(int e=s;e<a.length;e++){
                int start = s;
                int end = e;
                while(start<=end){
                    sum= sum+(a[start]);
                    start++;
                }
                System.out.println(" ");
            }
        }
        System.out.println("Answer : "+ sum);
    }
}
