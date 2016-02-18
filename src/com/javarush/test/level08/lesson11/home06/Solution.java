package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<Human> children = new ArrayList<Human>();

        Human chield1 = new Human("Вася", true, 12, children);
        Human chield2 = new Human("Оля", false, 16, children);
        Human chield3 = new Human("Саша", true, 18, children);

        children.add(chield1);
        children.add(chield2);
        children.add(chield3);

        Human father = new Human("Олег Юрьевич", true, 45, children);
        Human mother = new Human("Марина Ивановна", false, 43, children);

        children.clear();
        children.add(mother);

        Human grandfather1 = new Human("Дед Иван", true, 88, children);
        Human grandmother1 = new Human("Баба Нина", false, 82, children);

        children.clear();
        children.add(father);

        Human grandfather2 = new Human("Дед Юра", true, 82, children);
        Human grandmother2 = new Human("Баба Лиза", false, 78, children);

        System.out.println(grandfather1.toString());
        System.out.println(grandmother1.toString());
        System.out.println(grandfather2.toString());
        System.out.println(grandmother2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(chield1.toString());
        System.out.println(chield2.toString());
        System.out.println(chield3.toString());
    }

    public static class Human
    {
        public String name;
        public boolean sex;
        public int age;
        public ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<Human>(children);
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
