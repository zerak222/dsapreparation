This project is for storing the programs which are related to preparation of DSA from the basics.

------------------------------------------------------------------------------------------
Arrays & SubArrays:
------------------------------------------------------------------------------------------

ContributionTechnique:
----------------------------
Q)Sum of all sub arrays for a given array.
Approach:  sum of each element multiplied by its number of occurrences in the sub arrays.
              =>  arr[i] * no of occurrences of arr[i]
              =>  arr[i] * (i+1)*(N-i)  



Sliding Window technique:
----------------------------
Q) Given array with n elements and a number k. Find Max subarray sums of length = k.
Approach : Sliding data , 
            => Find the sum of array elements of the first sub array of length k. starting from i=0
            => i=1 , add arr[k+1] to the sum and remove arr[0] for second sub array with length k.
            => continue this till we reach the end of the array
            => for every step find the max sum comparing it with existing sum and maintain the max sum value.


Kadanes Algorithm: Maximum sum of a subarray
--------------------------------------------
Q)Given an array with n elements , find the sum of subarray which has maximum sum
Approach: 
            Maintain two variables
            1) CurrentMaxSum : Which holds the current max sum value of a sub array.
            2) Answer : Which holds the maximum sum value.
    While iterating update the CurrentMaxSum with either CurrentMaxSum+arr[i] or arr[i] whichever is highest
After every iteration update the Answer to hold maximum of the CurrentMaxSum or the answer.
