package dev.rivaldi.app;

import java.util.LinkedHashSet;
import java.util.Set;

public final class QuestionTwo {

    private QuestionTwo() {
    }

    public static String uniqueStrings(String s) {
        // LinkedHashSet ensures order is maintained
        Set<Character> uniqueChars = new LinkedHashSet<>();
        int uniqueCharsLength = 0;

        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (uniqueChars.add(c)) {
                // immediate replace chars
                chars[uniqueCharsLength] = c;
                uniqueCharsLength++;
            }
        }

        return new String(chars, 0, uniqueCharsLength);
    }
}
