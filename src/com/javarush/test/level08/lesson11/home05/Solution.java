package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        String s1;
        String s2;

        for(int i = 0; i < s.length(); i++)
        {
            s1 = String.valueOf(s.charAt(i));
            if(i + 1 < s.length()){
                s2 = String.valueOf(s.charAt(i + 1));
            }
            else {
                break;
            }

            if(i == 0 && !s1.equals(" ")) {
                s = s.replace(s1 + s2 + s.charAt(i + 2) + s.charAt(i + 3), s1.toUpperCase() + s2 + s.charAt(i + 2) + s.charAt(i + 3));
            }

            if(s1.equals(" ") &&  !s2.equals(" ")) {
                s = s.replace(s1 + s2, s1 + s2.toUpperCase());
            }
        }

        System.out.println(s);
    }


}
