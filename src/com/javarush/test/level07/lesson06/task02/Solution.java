package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> al = new ArrayList<String>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++)
        {
            al.add(reader.readLine());
        }

        int maxStr = 0;

        for(int i = 0; i < al.size(); i++)
        {
            maxStr = al.get(i).length() > maxStr ? al.get(i).length() : maxStr;
        }

        for(int i = 0; i < al.size(); i++)
        {
            if(al.get(i).length() == maxStr)
            {
                System.out.println(al.get(i));
            }
        }
    }
}
