package org.example;

import java.util.stream.IntStream;

// program wypisuje sumę liczb wielokrotności 3 i 5, max liczba to podana liczba
public class Mutliple3And5 {
    public static void main(String[] args) {
        int numb = 32;
        System.out.println(solution(numb));
    }

    public static int solution(int number) {
        int sumNumb = 0;
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sumNumb += i;
            }
        }
        return sumNumb;
    }

    public static int solution2(int number) {
        return IntStream.range(0, number)
                .filter(n -> (n % 3 == 0) || (n % 5 == 0))
                .sum();
    }
}
