package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        Man man1 = new Man("man1", 23, "addr1");
        Man man2 = new Man("man2", 25, "addr2");

        Woman woman1 = new Woman("woman1", 18, "addr1");
        Woman woman2 = new Woman("woman2", 20, "addr2");

        print(man1.toString());
        print(man2.toString());

        print(woman1.toString());
        print(woman2.toString());
    }

    public static class Man
    {
        public String name;
        public Integer age;
        public String address;

        public Man(String name, Integer age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString()
        {
            return name + " " + age + " " + address;
        }
    }

    public static class Woman
    {
        public String name;
        public Integer age;
        public String address;

        public Woman(String name, Integer age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString()
        {
            return name + " " + age + " " + address;
        }
    }

    public static void print(String text)
    {
        System.out.println(text);
    }

}
