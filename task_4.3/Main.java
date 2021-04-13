/*
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Нужно сравнить каждый критерий по отдельности, и победителем будет тот, у которого больше "победивших" критериев.
Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет.
Если ничья и никто не выиграл, возвращаем либо true либо false, но должно выполняться условие:
если cat1.fight(cat2) возвращает true,
то cat2.fight(cat1) должен возвращать false.
Требования:
•	Класс Cat должен содержать конструктор без параметров.
•	Класс Cat должен содержать всего три поля: age, weight и strength. Поля должны быть публичные.
•	В классе Cat должен быть метод fight.
•	В методе fight реализовать механизм драки котов в зависимости от их веса, возраста и силы согласно условию.
•	Метод должен возвращать одно и тоже значение, если мы деремся с одним и тем же котом.
•	Если некий кот1 выигрывает у кота кот2, то кот2 должен проигрывать коту кот1.
*/

import sun.font.TrueTypeFont;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat(10, 5, 7);
        Cat cat2 = new Cat(5, 7, 9);
        System.out.println(cat2.fight(cat1));
    }
}

class Cat {
    public int age; //1-10
    public int weight; //3-8
    public int strength; //5-15

    public Cat(int age, int weight, int strength) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public boolean fight(Cat anotherCat) {
        boolean True = true;
        boolean False = false;
        if (age > anotherCat.age && weight > anotherCat.weight && strength > anotherCat.strength) return True;
        else if (age > anotherCat.age && weight > anotherCat.weight && strength < anotherCat.strength) return True;
        else if (age > anotherCat.age && weight < anotherCat.weight && strength > anotherCat.strength) return True;
        else if (age < anotherCat.age && weight > anotherCat.weight && strength > anotherCat.strength) return True;
        else return False;
    }
}
