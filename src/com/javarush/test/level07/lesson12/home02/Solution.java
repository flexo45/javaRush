package com.javarush.test.level07.lesson12.home02;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();

        Integer N = Integer.parseInt(reader.readLine());
        Integer M = Integer.parseInt(reader.readLine());

        for (int i = 0; i < N; i++) list.add(reader.readLine());

        ArrayList<String> temp = new ArrayList<String>();

        for (int i = 0; i < M; i++)
        {
            temp.add(list.get(i));
        }
        for(String s : temp)
        {
            list.remove(s);
            list.add(s);
        }
        for(String s : list)
        {
            System.out.println(s);
        }
    }
}
