/*
Помогите коту обрести имя с помощью метода setName.
Требования:
•	Класс Cat должен содержать только одну переменную name.
•	Переменная name должна иметь модификатор доступа private и тип String.
•	Метод setName класса Cat должен устанавливать значение переменной private String name равным переданному параметру String name.
*/


public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Жужик");
        cat.setName("Жужик");
        System.out.println(cat);
    }
}

class Cat {
    private String name = "безымянный кот";

    public Cat(String name) {
        this.name = name;
    }

    public void setName(String name) {
        if (this.name != null)
            System.out.println("Кота зовут " + this.name);
    }
}
