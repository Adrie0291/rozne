package org.example;

// PROGRAM SPRAWDZA 2 STRINGI. Jeśli drugi jest końcem pierwszego = true  7.
public class StringEndsWith {
    public static void main(String[] args) {

    String first = "czesc";
    String second = "esc";
        System.out.println(solution(first, second));
    }

    public static boolean solution(String str, String ending) {
        return str.endsWith(ending);

    }
}

