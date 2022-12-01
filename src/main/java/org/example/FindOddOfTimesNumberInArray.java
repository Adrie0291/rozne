package org.example;

import java.util.Arrays;

public class FindOddOfTimesNumberInArray {
    public static void main(String[] args) {
        int[] nubmers = {3, 2, 1, 2, 3, 2, 1, 4};
        System.out.println(findIt(nubmers));
    }

    public static int findIt(int[] a) {
        // sort the array
        Arrays.sort(a);

        // traverse the array from the beginning
        int i = 0;
        while (i < a.length) {
            // store the current element
            int curr = a[i];

            // find the count of the current element
            int count = 0;
            while (i < a.length && a[i] == curr) {
                count++;
                i++;
            }

            // if the count of the current element is odd, return it
            if (count % 2 == 1) {
                return curr;
            }
        }

        // invalid input
        return -1;
    }
}
