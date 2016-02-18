package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача конструктора – сделать объект валидным. Например, если вес не известен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    public String name;
    public Integer weight;
    public Integer age;
    public String color;
    public String addres;

    public Cat(String name)
    {
        this.name = name;
        this.weight = 3;
        this.age = 2;
    }

    public Cat(String name, Integer weight, Integer age)
    {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public Cat(String name, Integer age)
    {
        this.name = name;
        this.weight = 3;
        this.age = age;
    }

    public Cat(Integer weight, String color)
    {
        this.weight = weight;
        this.age = 2;
        this.color = color;
    }

    public Cat(Integer weight, String color, String addres)
    {
        this.weight = weight;
        this.age = 2;
        this.color = color;
        this.addres = addres;
    }
}
