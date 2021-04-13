/*
Создать абстрактный класс Animal с характеристиками животного.
Создать класс Horse который наследуется от Animal, в классе Horse реализовать метод public void run(){ System.out.println("Игого, я поскакал(а)"); }
Создать класс Pegasus который наследуется от Horse, в классе Pegasus реализовать метод public void fly(){ System.out.println("Игого, я полетел(а)"); }
Создать объект лошади и вызвать метод run();
Создать объект пегаса и вызвать метод fly();
*/

public class Main{
    public static void main(String[] args) {
        Horse Loshadka = new Horse("Loshadka",13,320);
        Loshadka.run();
        Pegasus Pegas = new Pegasus("Pegas",12,440);
      Pegas.fly();
    }
}

abstract class Animal {
    String name;
    int age;
    int weight;

    public Animal(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }
}

class Horse extends Animal{
    public Horse(String name, int age, int weight) {
        super(name, age, weight);
    }

    public void run(){
        System.out.println("Игого, я поскакал(а)");
    }
}
class Pegasus extends Horse{
    public Pegasus(String name, int age, int weight) {
        super(name, age, weight);
    }

    public void fly(){
        System.out.println("Игого, я полетел(а)");
    }
}
