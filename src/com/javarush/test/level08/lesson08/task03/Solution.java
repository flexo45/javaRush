package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static void main(String[] args){

        getCountTheSameFirstName(createMap(), names[0]);
        getCountTheSameLastName(createMap(), sename[0]);
    }

    private static String[] names = {"Петя", "Вася", "Оля", "Федя", "Люся", "Ваня", "Саша", "Коля", "Миша", "Настя" };
    private static String[] sename = {"Иванов", "Петров", "Сидоров", "Жопов", "Говнов", "Софков", "Носков", "Лобков", "Давнов", "Сасов" };

    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();

        while (map.size() != 10){
            Random r = new Random();
            int Low = 0;
            int High = 10;
            int Result1 = r.nextInt(High-Low) + Low;
            int Result2 = r.nextInt(High-Low) + Low;
            map.put(sename[Result1], names[Result2]);
        }
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int count = 0;

        for(String n : map.values()){
            if(n.equals(name)){ count++; }
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        int count = 0;

        for(String k : map.keySet()){
            if(k.equals(lastName)){ count++; }
        }
        return count;
    }
}
