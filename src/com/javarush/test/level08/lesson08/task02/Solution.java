package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static void main(String[] args){
        removeAllNumbersMoreThan10(createSet());
    }

    public static HashSet<Integer> createSet()
    {
        HashSet<Integer> hs = new HashSet<Integer>();
        for (int i = 0; i < 20; i++){
            hs.add(new Random().nextInt());
        }
        return hs;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        HashSet<Integer> new_set = new HashSet<Integer>();

        for(int i : set){
            if(i <= 10){
                new_set.add(i);
            }
        }
        return new_set;
    }
}
