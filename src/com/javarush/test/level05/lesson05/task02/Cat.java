package com.javarush.test.level05.lesson05.task02;

/* Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет,
т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие:
если cat1.fight(cat2) = true , то cat2.fight(cat1) = false
*/

public class Cat
{
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat()
    {
    }

    public boolean fight(Cat anotherCat)
    {
        Integer thisCatRate = 0;
        Integer anotherCatRate = 0;

        if(anotherCat.age <= this.age)
        {
            thisCatRate++;
        }
        else
        {
            anotherCatRate++;
        }

        if(anotherCat.weight < this.weight)
        {
            thisCatRate++;
        }
        else
        {
            anotherCatRate++;
        }

        if(anotherCat.strength < this.strength)
        {
            thisCatRate++;
        }
        else
        {
            anotherCatRate++;
        }

        if(thisCatRate >= anotherCatRate)
        {
            return true;
        }

        return false;
    }
}
