package com.javarush.test.level08.lesson11.home08;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Пять наибольших чисел
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Вывести пять наибольших чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array)
    {
        boolean changing = true;
        int x1;
        int x2;

        while (changing){
            changing = false;
            for(int i = 0; i < array.length; i++)
            {
                x1 = array[i];
                if(i + 1 < array.length){
                    x2 = array[i + 1];
                }
                else {
                    break;
                }
                if(x1 < x2) {
                    array[i] = x2;
                    array[i + 1] = x1;
                    changing = true;
                }
            }
        }
    }
}
