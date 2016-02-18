package com.javarush.test.level02.lesson05.task01;

/* 19
Закоментарь максимальное количество строк, чтобы на экран вывелось число 19
*/
public class Solution
{
    public static void main(String[] args)
    {
        int x = 1;
        int y = 0;

        y = y + x;  //y1

        x = x * 2;  //x2
        y = y + x;  //y3

        x = x * 2;  //x4
        //y = y + x;  //y8

        x = x * 2;  //x8
        //y = y + x;  //y16

        x = x * 2;  //x16
        y = y + x;  //32

        System.out.println(y);
    }
}
