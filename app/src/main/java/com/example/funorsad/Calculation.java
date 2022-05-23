package com.example.funorsad;

import java.util.ArrayList;

public class Calculation {

    public static String calc(String s) {
        double digit = 0;
        for (String str : s.split("\\+")) {
            if (str.contains("-")) {
                String[] str1 = str.split("-");
                if (!str1[0].contains("*") || !str1[0].contains("/")) {
                    digit += calcMulAndDiv(str1[0]);
                }
                for (int i = 1; i < str1.length; i++) {
                    digit -= calcMulAndDiv(str1[i]);
                }
            }
            else if (str.contains("*") || str.contains("/")) {
                digit += calcMulAndDiv(str);
            }
            else {
                digit += Double.parseDouble(str);
            }
        }
        if (digit % 1 != 0) {
            return String.valueOf(digit);
        }
        else {
            return String.valueOf((double) digit);
        }
    }
    public static double calcMulAndDiv(String s) {
        double digit = 1;
        String[] str = s.split("\\*");
        ArrayList<Integer> indexMul, indexDiv = new ArrayList<>();
        for (String s1 : str) {
            if (s1.contains("/")) {
                double d = 1;
                String[] strings = s1.split("/");
                d *= Double.parseDouble(strings[0]);
                for (int i = 1; i < strings.length; i++) {
                    d /= Double.parseDouble(strings[i]);
                }
                digit *= d;
            }
            else {
                digit *= Double.parseDouble(s1);
            }
        }
        return digit;
    }
}
