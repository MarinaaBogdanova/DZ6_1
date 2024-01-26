
package ru.netology.stats;

public class StatsService {
    public int getSum(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public int getAverageAmount(int[] sales) {
        int sum = 0;
        int AverageAmount = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
            AverageAmount = sum / sales.length;
        }
        return AverageAmount;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int getUnderAverageAmount(int[] sales) {
        int AverageAmount = getAverageAmount(sales);
        int months = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < AverageAmount) {
                months++;
            }
        }
        return months;
    }

    public int getUpperAverageAmount(int[] sales) {
        int AverageAmount = getAverageAmount(sales);
        int months = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > AverageAmount) {
                months++;
            }
        }
        return months;
    }

}
