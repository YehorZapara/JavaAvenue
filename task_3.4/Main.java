
/*
Задание: Сделайте функцию, которая параметрами принимает 2 числа. Если их сумма больше 10 - пусть функция вернет true, а если нет - false.
*/


public class Main {
    public static void main(String[] args) {
        sum(5, 4);

    }

    static void sum(int a, int b) {
        if ((a + b) < 10) System.out.println("true");
        else System.out.println("false");
    }
}
