/*
Задание: Сделайте функцию, которая параметрами принимает 2 числа. Если эти числа равны - пусть функция вернет true, а если не равны - false.
*/


public class Main {
    public static void main(String[] args) {
        equ(5, 4);

    }


    public static void equ(int a, int b) {
        if (a == b) System.out.println("true");
        else System.out.println(false);
    }
}
