package ru.netology.stats;

public class StatsService {
    public long salesAmount(long[] sales) {
        long amount = 0;

        for (long sale : sales) {
            amount = amount + sale;
        }

        return amount;
    }

    public double averageSalesAmount(long[] sales) {
        long amount = salesAmount(sales);
        double average = amount / sales.length;
        return average;
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

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public long belowAverage(long[] sales) {
        double average = averageSalesAmount(sales);
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                count++;
            }
        }

        return count++;
    }

    public long aboveAverage(long[] sales) {
        double average = averageSalesAmount(sales);
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                count++;
            }
        }

        return count++;
    }
}




