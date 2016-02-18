package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++)
        {
            list.add(Integer.parseInt(reader.readLine()));
        }

        ArrayList<Integer> sorted = new ArrayList<Integer>();

        for (Integer x : list)
        {
            Integer index = 0;

            if(sorted.isEmpty()) sorted.add(x);
            else
            {
                if(x < sorted.get(0)) sorted.add(0, x);
                else
                {
                    for(Integer y : sorted)
                    {
                        if(x < y) index = sorted.indexOf(y);
                        else index = -1;
                    }

                    if(index == -1) sorted.add(x);
                    else sorted.add(index, x);
                }
            }
        }

        for (Integer i : sorted) System.out.println(i);
    }
}
