package org.example;
// PROGRAM WYSZUKUJE MAX I MIN LICZBĘ wprowadzoną w postaci String ze spacjami
public class MaxMInNumberFromStringwithSpace {
    public static void main(String[] args) {
        String num = "3 2 9 2 2 1";
        System.out.println(highAndLow(num));
    }

    public static String highAndLow(String numbers) {

        String[] numberString = numbers.split(" "); // split by " "
        int lNum = Integer.parseInt(numberString[0]); //lowest number init;
        int hNum = Integer.parseInt(numberString[0]); // highest number init;
        for (int i = 1; i < numberString.length; i++) {//compare
            if (lNum > Integer.parseInt(numberString[i]))
                lNum = Integer.parseInt(numberString[i]);
            if (hNum < Integer.parseInt(numberString[i]))
                hNum = Integer.parseInt(numberString[i]);
        }

        return String.valueOf(hNum) + " " + String.valueOf(lNum);
    }

}
