package dev.rivaldi.app;

import org.junit.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.Assert.assertEquals;

public class QuestionTwoTest {

    @Test
    public void uniqueStrings() throws Exception {
        String case1 = QuestionTwo.uniqueStrings("sebaerb");
        assertEquals("sebar", case1);

        String case2 = QuestionTwo.uniqueStrings(readStringFromFile("/gistfile2.txt"));
        assertEquals("sfgxclryzidpuvejaqbtwmhkno", case2);
    }

    private static String readStringFromFile(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get("src/test/resources" + fileName)),
            StandardCharsets.UTF_8
        );
    }
}
