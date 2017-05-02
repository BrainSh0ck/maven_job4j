package com.tests;

/**
 * Created by root on 09.04.2017.
 */
public class PrimitiveParam {
    public static void main(String[] args) {
        int value = 1;
        PrimitiveParam.change(value);
        System.out.print(value);
        ++value;
        System.out.println(value);
        System.out.println(PrimitiveParam.abs(0));
        System.out.println(2 > 0 && 3 < 5 && !false);
        boolean toBe = true;
        boolean notToBe = false;
        System.out.println(toBe || notToBe);
        //Integer a = null;
        //int b = a;
        //System.out.println(b);
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //int[][] b = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] array = { {1, 2}, {3, 4} };
        System.out.println(array[0][0]);
        System.out.println(array[1][1]);
        //System.out.println(array[2][2]);
        //System.out.println(array[3][3]);
    }

    public static void change(Integer value) {
        ++value;
    }
    static String abs(int val) {
        final String result;
        if (val >= 0) {
            result = "positive";
        } else {
            result = "negative";
        }
        return result;
    }
}