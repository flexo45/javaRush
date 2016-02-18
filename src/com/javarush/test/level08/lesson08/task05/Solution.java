package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    private static String[] names = {"Петя", "Вася", "Оля", "Федя", "Люся", "Ваня", "Саша", "Коля", "Миша", "Настя" };
    private static String[] sename = {"Иванов", "Петров", "Сидоров", "Жопов", "Говнов", "Софков", "Носков", "Лобков", "Давнов", "Сасов" };

    public static void main(String[] a){
        HashMap<String , String> m = createMap();
        removeTheFirstNameDuplicates(m);
        m.toString();
    }

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

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        int count;

        HashMap<String, String> copy = new HashMap<String, String>(map);

        for(Map.Entry<String, String> pair : copy.entrySet()){
            count = getCountOfElements(map, pair.getValue());
            if(count > 1){
                removeItemFromMapByValue(map, pair.getValue());
            }
        }
    }

    private static int getCountOfElements(HashMap<String, String> map, String value){
        int count = 0;
        for(Map.Entry<String, String> pair : map.entrySet()){
            if(pair.getValue().equals(value)){
                count++;
            }
        }
        return count;
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
