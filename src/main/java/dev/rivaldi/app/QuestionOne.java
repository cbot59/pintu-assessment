package dev.rivaldi.app;

import java.util.List;

public final class QuestionOne {

    private QuestionOne() {
    }

    public static int maxProfit(List<Integer> prices) {
        // 0 element should return 0
        if (prices.isEmpty()) {
            return 0;
        }

        // single element should immediate return max profit
        if (prices.size() == 1) {
            return prices.stream()
                .findFirst()
                .orElse(0);
        }

        // init min price
        int minPrice = prices.get(0);

        // init max profit
        int maxProfit = 0;

        for (Integer price : prices) {
            // find min price
            minPrice = Math.min(minPrice, price);

            // calculate current profit
            int profit = price - minPrice;

            // find max profit
            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }
}
