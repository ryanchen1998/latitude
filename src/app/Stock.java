package app;

public class Stock {

    /**
     * Calculates the maximum profit that can be achieved from one purchase
     * and one sale of a stock using Kanade's algorithm.
     * 
     * @param stockPrices The list of yesterday's stock prices
     * @return The maximum profit
     */
    public int maximiseProfit(int[] stockPrices) {
        if(stockPrices == null || stockPrices.length < 2) {
            return 0;
        }

        int currentSum = 0;
        int bestSum = 0;
        for(int i = 1; i < stockPrices.length; i++) {
            currentSum = Math.max(0, currentSum += stockPrices[i] - stockPrices[i-1]);
            bestSum = Math.max(currentSum, bestSum);
        }
        return bestSum;
    }

    public static void main(String[] args) throws Exception {
        Stock stock = new Stock();
        int[] stockPrices = {10, 7, 5, 8, 11, 9};

        int maxProfit = stock.maximiseProfit(stockPrices);
        System.out.println(maxProfit);
    }
}
