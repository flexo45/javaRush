package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Integer n1 = Integer.parseInt(reader.readLine());
        Integer n2 = Integer.parseInt(reader.readLine());
        Integer n3 = Integer.parseInt(reader.readLine());
        Integer n4 = Integer.parseInt(reader.readLine());

        if(n1 > n2 && n1 > n3 && n1 > n4)
        {
            System.out.println(n1);
        }
        else if(n2 > n1 && n2 > n3 && n2 > n4)
        {
            System.out.println(n2);
        }
        else if(n3 > n1 && n3 > n2 && n3 > n4)
        {
            System.out.println(n3);
        }
        else
        {
            System.out.println(n4);
        }
    }
}
