package ru.netology.stats;

public class StatsService {

    public int sum(int[] purchases) {
        int sum = 0;
        for (int purchase : purchases) {
            sum += purchase;

        }
        return sum;
    }

    public int average(int[] purchases) {
        int sum = sum(purchases);
        return sum / purchases.length;
    }

    public int getMax(int[] purchases) {
        int max = purchases[0];
        for (int purchase : purchases) {
            if (max < purchase) {
                max = purchase;
            }

        }
        return max;
    }

    public int MonthMax(int[] purchases) {
        int max = getMax(purchases);
        int monthCount = 0;
        int monthMax = 0;
        for (int purchase : purchases) {
            monthCount++;
            if (purchase == max) {
                monthMax = monthCount;
            }
        }
        return monthMax;
    }
    public int getMin(int[] purchases) {
        int min = purchases[0];
        for (int purchase : purchases) {
            if (min > purchase) {
                min = purchase;
            }

        }
        return min;
    }

    public int MonthMin(int[] purchases) {
        int min = getMin(purchases);
        int monthCount = 0;
        int monthMin = 0;
        for (int purchase : purchases) {
            monthCount++;
            if (purchase == min) {
                monthMin = monthCount;
            }
        }
        return monthMin;
    }

    public int MonthCountLessAverage(int[] purchases) {
        int average = average(purchases);
        int count = 0;
        for (int purchase : purchases) {
            if (purchase < average) {
                count++;
            }
        }
        return count;
    }

    public int MonthCountMoreAverage(int[] purchases) {
        int average = average(purchases);
        int count = 0;
        for (int purchase : purchases) {
            if (purchase > average) {
                count++;
            }
        }
        return count;
    }
}

