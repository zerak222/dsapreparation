package org.example.twopointers;
/*
   Given arr[N] , arr[i] represents height of each wall.
   Find Max water accumulated between any 2 walls?
   Note : Between 2 walls 1 unit of distance is present

     Example :
     arr[] = {3,7,4,5,2}
     ans : 10 (indexes : 1,3)

 */
public class WaterLogging {
    public static void main(String[] args) {
            int h[]={3,7,4,5,2};

            int i=0;
            int j=h.length-1;
            int waterAmount = 0;
            while(i<j){
                int amount = (j-i)*(Math.min(h[i],h[j]));
                waterAmount = Math.max(amount,waterAmount);
                if(h[i]<h[j]){
                    i++;
                }else{
                    j--;
                }
            }

            System.out.println("Water:"+waterAmount);
    }
}
