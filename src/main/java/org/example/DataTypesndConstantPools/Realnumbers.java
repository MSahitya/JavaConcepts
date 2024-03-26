package org.example.DataTypesndConstantPools;

public class Realnumbers {
    public static void main(String[] args) {
        //Float,double(default)
        System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
        double d = Double.MIN_VALUE;
        System.out.println(d);
        //E-Notation Scientific 0.00098	9.8 x 10^-4	9.8e-4	9.8 x 10^-4

        double d1 = 1.0 / 0.0;//will not throw ArithmeticExcpetion and return Double.INFINITY.
        System.out.println(d1);

        //the comparison x == Double.NaN always evaluates to false, even if x itself is a NaN. To test if x is a NaN, one should use the method called Double.isNaN(x) to check if the given number is NaN or not.
         char x='a';

         if(x == Double.NaN)
             System.out.println(x+"\t is not a number");
         else
             System.out.println(x+"\t is  a number");


        char x1='a';

        if(Double.isNaN(x1))
            System.out.println(x+"\t is not a number");
        else
            System.out.println(x+"\t is  a number");

          }
}
