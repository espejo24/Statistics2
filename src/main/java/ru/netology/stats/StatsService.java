package ru.netology.stats;

public class StatsService {
    public int calculateSum(long[] sales) {      // сумма всех
        int sum = 0;
        for (long sale : sales) {
            sum = (int) (sum + sale);

        }
        return sum;

    }

    public int calculateAverage(long[] sales) {       // средняя сумма продаж
        return calculateSum(sales) / sales.length;
    }


    public int maxSales(long[] sales) {           // месяц с максимум продаж
        int maxMonth = 0;
        int mes = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = mes;
            }
            mes = mes + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {           // месяц с минимум продаж
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int calculateBelowAverage(long[] sales) {       // месяцы ниже среднего
        int calculateAverage = calculateSum(sales) / sales.length;   // 15                                         // cреднее 15
        int count = 0;
        for (long sale : sales) {
            if (sale < calculateAverage) {
                count = count + 1;
            }
            //return count + 1;
        }
        return count;

    }
    public int calculateAboveAverage(long[] sales) {       // месяцы выше среднего
        int calculateAverage = calculateSum(sales) / sales.length;   // 15                                         // cреднее 15
        int count = 0;
        for (long sale : sales) {
            if (sale > calculateAverage) {
                count = count + 1;
            }
            //return count + 1;
        }
        return count;

    }
}