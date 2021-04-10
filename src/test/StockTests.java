package test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import app.Stock;

public class StockTests {
    
    @Test
    public void nullMaximiseProfit() {
        Stock stock = new Stock();
        int[] stockPrices = null;
        int maxProfit = stock.maximiseProfit(stockPrices);
        assertEquals(0, maxProfit);
    }

    @Test
    public void singleValueMaximiseProfit() {
        Stock stock = new Stock();
        int[] stockPrices = {3};
        int maxProfit = stock.maximiseProfit(stockPrices);
        assertEquals(0, maxProfit);
    }

    @Test
    public void normalMaximiseProfit() {
        Stock stock = new Stock();
        int[] stockPrices = {10, 7, 5, 8, 11, 9};
        int maxProfit = stock.maximiseProfit(stockPrices);
        assertEquals(6, maxProfit);
    }

    @Test
    public void flatMaximiseProfit() {
        Stock stock = new Stock();
        int[] stockPrices = {5, 5, 5, 5, 5, 5};
        int maxProfit = stock.maximiseProfit(stockPrices);
        assertEquals(0, maxProfit);
    }
}
