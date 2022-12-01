package org.example;

public class StringS {
    public static void main(String[] args) {
        System.out.println("Time 2:" +  czasNano());
        String s = "a";
        long start = System.nanoTime();
        for (int i = 0; i < 500000; i++) {
            s = s + "a";
            //s = new StringBuilder(s).append("a").toString();
        }
        System.out.println("Time1: " + (System.nanoTime() - start) / 100000000);

    }

    public static long czasNano() {
        String s = "a";
        long start = System.nanoTime();
        StringBuilder sB = new StringBuilder(s);

        for (int i = 0; i < 500000; i++) {
            sB.append("a");
        }

        s = sB.toString();
        return (System.nanoTime() - start) / 100000000;
    }
}
