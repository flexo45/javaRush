package com.javarush.test.level04.lesson13.task04;

import java.io.*;

/* Рисуем линии
Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        String row = "";

        for (Integer x = 1; x <= 10; x++)
        {
            row += "8";
        }

        System.out.println(row);

        for (Integer x = 1; x <= 10; x++)
        {
            System.out.println("8");
        }
    }
}
