package com.cabomaldade.coursera;

/* Solution by André Vasconcelos Souto
    1.2.30 Uniform random numbers.
    Write a program that prints five uniform random numbers
    between 0 and 1, their average value, and their minimum
    and maximum values. Use Math.random(), Math.min(), and Math.max().
 */

public class UniformRandom {
    public static void main(String[] args) {
        double[] uniformes = new double[5];

        double avg = 0.0;
        double min = 1.0;
        double max = 0.0;

        for (int i=0; i<= uniformes.length -1; i++) {
            uniformes[i] = Math.random();
            avg += uniformes[i];
            min = Math.min(min, uniformes[i]);
            max = Math.max(max, uniformes[i]);
        }

        for (int i=0; i<= uniformes.length -1; i++) {
            System.out.println("Number " + i + " = " + uniformes[i]);
            if (i == uniformes.length -1){
                System.out.println("Average :" + avg/uniformes.length);
                System.out.println("Minimum :" + min);
                System.out.println("Maximum :" + max);
            }
        }

    }
}
