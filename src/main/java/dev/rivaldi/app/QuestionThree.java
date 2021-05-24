package dev.rivaldi.app;

public final class QuestionThree {

    private static final int LOWEST_BOUNDARY_6_FACTOR = 12;

    private QuestionThree() {
    }

    public static int sixFactorCounter(Integer upperBound) {
        // min number should be 12
        if (upperBound < LOWEST_BOUNDARY_6_FACTOR) {
            return 0;
        }

        if (LOWEST_BOUNDARY_6_FACTOR == upperBound) {
            return 1;
        }

        int counter = 1;

        for (int i = LOWEST_BOUNDARY_6_FACTOR + 1; i <= upperBound; i++) {
            if (calculateSixFactor(i) == 6) {
                counter++;
            }
        }

        return counter;
    }

    private static int calculateSixFactor(int number) {
        int counter = 0;

        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                if (number / i == i) {
                    counter++;
                } else {
                    counter += 2;
                }

                if (counter > 6) {
                    break;
                }
            }
        }

        return counter;
    }
}
