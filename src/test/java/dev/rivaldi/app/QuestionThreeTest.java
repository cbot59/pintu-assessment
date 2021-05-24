package dev.rivaldi.app;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuestionThreeTest {

    @Test
    public void sixFactorCounter() {
        int case1 = QuestionThree.sixFactorCounter(128);
        assertEquals(19, case1);

        int case2 = QuestionThree.sixFactorCounter(1024);
        assertEquals(112, case2);

        int case3 = QuestionThree.sixFactorCounter(16384);
        assertEquals(1168, case3);

        int case4 = QuestionThree.sixFactorCounter(262144);
        assertEquals(13208, case4);

        // undetermined yet, my pc unable to compute it in a short time
//        int case5 = QuestionThree.sixFactorCounter(134217728);
//        System.out.println(case5);
    }
}
