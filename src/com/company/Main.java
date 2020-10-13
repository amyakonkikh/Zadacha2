package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String num[] = str.split("[*/+-]");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
        double chisla[] = new double[num.length + 1];
        for (int i = 0; i < num.length; i++) {
            chisla[i] = Integer.parseInt(num[i]);
        }

        char r = (str.indexOf('*') < 0 ?
                (str.indexOf('/') < 0 ?
                        (str.indexOf('+') < 0 ?
                                (str.indexOf('-') < 0 ?
                                        '0' : '-') : '+') : '/') : '*');
        switch (r) {
            case '*':
                System.out.println(chisla[0] * chisla[1]);
                break;
            case '/':
                System.out.println(chisla[0] / chisla[1]);
                break;
            case '+':
                System.out.println(chisla[0] + chisla[1]);
                break;
            case '-':
                System.out.println(chisla[0] - chisla[1]);
                break;
        }
    }
}
