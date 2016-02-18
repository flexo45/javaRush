package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
    }

    public static boolean isDateOdd(String date)
    {
        Date currentDate = new Date(date);
        Date startTimeDate = new Date();
        startTimeDate.setYear(currentDate.getYear());
        startTimeDate.setMonth(0);
        startTimeDate.setDate(1);
        startTimeDate.setHours(0);
        startTimeDate.setMinutes(0);
        startTimeDate.setSeconds(0);

        long msStartDate = startTimeDate.getTime();
        long msCurrentDate = currentDate.getTime();
        long msOneDay = 24 * 60 * 60 * 1000;
        int days = (int)((msCurrentDate - msStartDate) / msOneDay) + 1;

        return (days % 2) == 0;
    }
}
