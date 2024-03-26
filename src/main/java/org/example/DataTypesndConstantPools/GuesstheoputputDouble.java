package org.example.DataTypesndConstantPools;

import java.util.Arrays;

public class GuesstheoputputDouble {
    public static void main(String[] args) {




        ////////////////////////

        double sum  =  0.30;
        double val1 = 0.10;
        double val2 = 0.20;


        System.out.println( sum ==  (val1 +  val2) );//false
        System.out.println(sum+"\t"+(val1+val2));

        Integer a = 20;
        Integer b = 20;
        System.out.println(a==b);//True

        Integer c = 250;
        Integer d = 250;
        System.out.println(c==d);//false

        System.out.print(Double.NaN+"\t"+Double.POSITIVE_INFINITY);

    }
}
