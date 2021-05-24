package dev.rivaldi.app;

import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class QuestionOneTest {

    @Test
    public void maxProfit() {
        int case1 = QuestionOne.maxProfit(Arrays.asList(5, 4, 3, 2, 1));
        assertEquals(0, case1);

        int case2 = QuestionOne.maxProfit(Arrays.asList(3, 2, 1, 5, 6, 2));
        assertEquals(5, case2);

        int case3 = QuestionOne.maxProfit(readIntFromFile("/gistfile1.txt"));
        assertEquals(299994700, case3);
    }

    private List<Integer> readIntFromFile(String fileName) {
        List<Integer> integers = new ArrayList<>();
        try (Scanner scanner = new Scanner(getClass().getResourceAsStream(fileName),
            StandardCharsets.UTF_8.name()
        )) {
            while (scanner.hasNext()) {
                if (scanner.hasNext()) {
                    integers.add(scanner.nextInt());
                } else {
                    scanner.next();
                }
            }
        }

        return integers;
    }
}
