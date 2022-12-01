package org.example;

public class GetTheMiddleCharacter {
    public static void main(String[] args) {
        String word = "test";
        System.out.println(getMiddle3(word));
    }

    public static String getMiddle(String word) {
        String newWord = "";
        int k = word.length() / 2;
        if (word.length() % 2 == 0) {
            newWord = word.charAt(k - 1) + "" + word.charAt(k);
            return newWord;
        } else {
            return word.charAt(k) + "";

        }
    }

    public static String getMiddle2(String word) {
        int length = word.length();
        int mid = length / 2;
        boolean isEven = length % 2 == 0;
        return isEven ? word.substring(mid - 1, mid + 1) :
                String.valueOf(word.charAt(mid));
    }

    public static String getMiddle3(String word) {

        if (word.length() > 2)
            return getMiddle(word.substring(1, word.length() - 1));

        return word;
    }
}



