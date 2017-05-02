package com.tests;

/**
 * Created by root on 09.04.2017.
 */
public class ArrayReturn {
    private int[] values;

    public int[] sort(int[] values) {
        this.values = values;
        return values;
    }

    public void echo() {
        System.out.println(this.values[0]);
    }

    public void calc(int value) {
        if (value != 0 && value / 0 >= 0) {
            System.out.println("div by zero");
        } else {
            System.out.println("zero by zero");
        }
    }
    public static void main(String[] args) {
        ArrayReturn ar = new ArrayReturn();
        final int[] immutable = {1};
        final int[] ri = ar.sort(immutable);
        ri[0] = -1;
        ar.echo();
        ar.calc(1);
    }
}