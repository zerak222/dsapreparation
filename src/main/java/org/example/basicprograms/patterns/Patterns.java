package org.example.basicprograms.patterns;

public class Patterns {

    public static void main(String[] args) {
        pattern1();
        pattern2();
        pattern3();
        pattern4();
    }
    /*
                 * * * * *
                 * * * *
                 * * *
                 * *
                 *
     */
    public static void pattern1(){
        for(int i=1;i<=5;i++){
            for(int j=i;j<=5;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /*
                *
                * *
                * * *
                * * * *
                * * * * *
     */
    public static void pattern2(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /*
             * * * * *
               * * * *
                 * * *
                   * *
                     *

     */
    public static void pattern3(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(j<=i-1)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
    /*
                 *
               * *
             * * *
           * * * *
         * * * * *

     */
    public static void pattern4(){
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                if(j>=i-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

}
