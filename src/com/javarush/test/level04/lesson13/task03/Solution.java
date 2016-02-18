package com.javarush.test.level04.lesson13.task03;

import java.io.*;

/* Рисуем треугольник
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример:
8
88
888
...
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        for(Integer i = 1; i <= 10; i++)
        {
            String row = "";

            for (Integer x = 0; x < i; x++)
            {
                row += 8;
            }

            System.out.println(row);
        }
    }
}
