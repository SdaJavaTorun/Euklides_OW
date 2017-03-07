package com.tab.euklides;

public class Main {

    public static int nwd(int a, int b) {

        while (b != a) {
            if (a > b) a = a - b;
            else b = b - a;

        }
        return a;

    }

    public static void main(String[] args) {

        int a = 28;
        int b = 24;
        System.out.println("NWD wynosi: "+ nwd(a, b));

    }
}
