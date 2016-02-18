package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> map = createMap();

    public static void main(String[] a){

        removeAllSummerPeople(map);
        map.toString();
    }

    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Petr", new Date("APRIL 1 1980"));
        map.put("Ivan", new Date("JANUARY 1 1980"));
        map.put("Sidor", new Date("JULY 1 1980"));
        map.put("Anna", new Date("SEPTEMBER 1 1980"));
        map.put("Semen", new Date("OCTOBER 1 1980"));
        map.put("Olga", new Date("AUGUST 1 1980"));
        map.put("Liza", new Date("NOVEMBER 1 1980"));
        map.put("Micha", new Date("DECEMBER 1 1980"));
        map.put("Leo", new Date("MAY 1 1980"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Boolean stop = false;

        while (!stop){
            stop = true;
            String name = "";
            for (Map.Entry<String, Date> i : map.entrySet()){
                if(i.getValue().getMonth() >= 5 && i.getValue().getMonth() <= 7){
                    name = i.getKey();
                    stop = false;
                    break;
                }
            }
            if(!stop){
                map.remove(name);
            }
        }
    }
}
