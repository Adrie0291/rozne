package org.example;

import static java.util.Arrays.stream;

// SPRAWDZAMY CZY SUMA LICZB W TABLICY JEST PARZYSTA CZY NIE
public class OddOrEven {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 1, 9};
        System.out.println(oddOrEven2(numbers));
    }

    public static String oddOrEven(int[] array) {
        int k = 0;
        for (int i : array) {
            k += i;
        }
        if (k % 2 == 0)
            return "even";
        else return "odd";

    }
    static String oddOrEven2(final int[] array) {
        return stream(array).sum() % 2 == 0 ? "even" : "odd";
    }
}

