package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        Integer[] list = new Integer[n];

        for(Integer i = 0; i < n; i++)
        {
            list[i] = Integer.parseInt(reader.readLine());
        }

        int maximum = list[0];

        for(Integer i = 1; i < list.length; i++)
        {
            maximum = list[i] > maximum ? list[i] : maximum;
        }

        System.out.println(maximum);
    }
}
