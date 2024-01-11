package ru.netology.stats;

public class StatsService {

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;

    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public long sum(long[] sales) {
        long sumSales = 0;
        for (long sale : sales) {
            sumSales = sumSales + sale;

        }

        return sumSales;

    }

    public long average(long[] sales) {
        long sumSales = 0;
        for (long sale : sales) {
            sumSales = sumSales + sale;

        }
        long averageSale = sumSales / sales.length;
        return averageSale;

    }

    public int calcMonthsBelowTheAverage(long[] sales) {
        int count = 0;

        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                count++;
            }

        }
        return count;
    }

    public int calcMonthsAboveTheAverage(long[] sales) {
        int count = 0;

        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                count++;
            }

        }
        return count;
    }
}








