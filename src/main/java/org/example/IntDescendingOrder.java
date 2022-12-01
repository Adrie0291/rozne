// Program pobiera liczbę i wypisuje w kolejności malejącej jej cyfry
package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IntDescendingOrder {
    public static void main(String[] args) {
        int number = 939291;
        System.out.println(sortDesc2(number));

    }
    public static int sortDesc(final int num) {
        int numer = num;
        int r = 0;
        Integer k = 0;
        List<Integer> listNumber = new ArrayList<>();
        while (numer > 0) {
            r = numer % 10;
            numer /= 10;
            listNumber.add(r);
        }
        Collections.sort(listNumber, Collections.reverseOrder());
        String liczbaNowa = "";
        for (int i = 0; i < listNumber.size(); i++) {
            liczbaNowa += listNumber.get(i) + "";

        }
        if (num == 0) {
            return 0;
        } else {
            return Integer.parseInt(liczbaNowa);
        }

    }
    public static int sortDesc2(final int num) {
        String[] array = String.valueOf(num).split("");
        Arrays.sort(array, Collections.reverseOrder());
        String numbString = String.join("", array);
        return Integer.valueOf(numbString);
    }
}

