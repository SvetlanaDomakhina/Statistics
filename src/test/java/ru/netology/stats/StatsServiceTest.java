package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {


    @Test
    public void shouldFindMinSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinMonth = 9;
        int actualMonth = service.minSales(sales);
        Assertions.assertEquals(expectedMinMonth, actualMonth);


    }

    @Test
    public void shouldFindMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxMonth = 8;
        int actualMaxMonth = service.maxSales(sales);
        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);


    }

    @Test
    public void ShouldFindSumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actualSum = service.sum(sales);
        long expectedSum = 180;
        Assertions.assertEquals(expectedSum, actualSum);

    }

    @Test
    public void ShouldFindAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actualAverage = service.average(sales);
        long expectedAverage = 15;
        Assertions.assertEquals(expectedAverage, actualAverage);

    }

    @Test
    public void ShouldFindMonthsBelowTheAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actualAverage = service.calcMonthsBelowTheAverage(sales);
        long expectedAverage = 5;
        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void ShouldFindMonthsAboveTheAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actualAverage = service.calcMonthsAboveTheAverage(sales);
        long expectedAverage = 5;
        Assertions.assertEquals(expectedAverage, actualAverage);
    }
}
