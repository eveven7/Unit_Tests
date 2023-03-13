package org.example.LettersCounter;

public class LettersCounter {
    public static int Count(char character, String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == character)
                count++;
        }
        return count;
    }
}
