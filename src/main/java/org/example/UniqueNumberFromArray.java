package org.example;
// Program wypisuje unikalną liczbę z tablicy liczb

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UniqueNumberFromArray {
    public static void main(String[] args) {
        double[] numbers = {1, 1, 1, 1, 1, 3, 1, 1,};
        System.out.println(findUniq2(numbers));

    }

    public static double findUniq(double arr[]) {
        double k = 0;
        List<Double> numbers = new ArrayList<>();
        for (double v : arr) {
            numbers.add(v);

        }
        Collections.sort(numbers);

        if (numbers.get(0).equals(numbers.get(1))) {
            k = numbers.get(numbers.size() - 1);
        } else {
            k = numbers.get(0);
        }
        return k;
    }

    public static double findUniq2(double arr[]) {
        Arrays.sort(arr);
        if (arr[0] == arr[1])
            return arr[arr.length - 1];
        else
            return arr[0];

    }
}