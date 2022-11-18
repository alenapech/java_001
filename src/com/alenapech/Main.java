package com.alenapech;

public class Main {

    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;

        System.out.println("\ta\t|\tb\t|a & b\t|a | b\t|a ^ b\t|!b\t\t|");
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf(" %b\t| %b\t| %b\t| %b\t| %b\t| %b\t|\n", a, b ,a & b, a | b, a ^ b, !b);
                b = false;
            }
            a = false;
            b = true;
        }
    }
}
