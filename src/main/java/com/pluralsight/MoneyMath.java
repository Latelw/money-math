package com.pluralsight;

import java.math.BigDecimal;

public class MoneyMath {
    public static void main(String[] args) {
        float num1 = 0f;
        double num2 = 0;
        BigDecimal num3 = BigDecimal.ZERO;
        for (int i = 0; i < 11 ; i++) {
            num1 = num1 + 0.10f;
            num2 = num2 + 0.10;
            num3 = num3.add( new BigDecimal("0.10"));
            System.out.println("Float: " + num1);
            System.out.println("Double: " + num2);
            System.out.println("Big Decimal: " + num3);
            System.out.println();


        }
        num3 = BigDecimal.ZERO;
        num2 = 0;
        num1 = 0f;

        for (int i = 0; i < 1001 ; i++) {
            num1 = num1 + 19.99f;
            num2 = num2 + 19.99;
            num3 = num3.add( new BigDecimal("19.99"));

        }

        System.out.println("Float: " + num1);
        System.out.println("Double: " + num2);
        System.out.println("Big Decimal: " + num3);
        System.out.println();
        //Float compared to Double
        System.out.println(num1 == num2);
        //Double compare to Big Decimal
        System.out.println(num3.compareTo(new BigDecimal(num2)));
        //It's off

    }
}
