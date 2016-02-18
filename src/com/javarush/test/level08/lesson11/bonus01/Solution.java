package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        HashMap<String, Integer> calendar = new HashMap<String, Integer>();

        calendar.put("January", 1);
        calendar.put("February", 2);
        calendar.put("March", 3);
        calendar.put("April", 4);
        calendar.put("May", 5);
        calendar.put("June", 6);
        calendar.put("July", 7);
        calendar.put("August", 8);
        calendar.put("September", 9);
        calendar.put("October", 10);
        calendar.put("November", 11);
        calendar.put("December", 12);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String monthName = reader.readLine();

        for (Map.Entry<String, Integer> pair : calendar.entrySet()){
            if(pair.getKey().toLowerCase().equals(monthName.toLowerCase())){
                System.out.println(pair.getKey() + " is " + pair.getValue().toString() + " month");
            }
        }
    }

}
