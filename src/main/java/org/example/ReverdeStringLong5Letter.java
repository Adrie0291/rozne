package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Program ma odwracać wyraz w zdaniu, jeśli dany wyraz składa się z 5 lub więcej liter
public class ReverdeStringLong5Letter {
    public static void main(String[] args) {
        String manyWord = "Co dzisiaj robi";
        System.out.println(spinWords(manyWord));
    }

    public static String spinWords(String sentence) {

        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 4) {
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }
        return String.join(" ", words);

    }
}