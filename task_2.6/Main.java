/*
Задание: Даны переменные a и b. Проверьте, что a делится без остатка на b. Если это так - выведите 'Делится' и результат деления, иначе выведите 'Делится с остатком' и остаток от деления.
*/

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 1;
        if (a / b != a / b + a % b)
            System.out.println("Делится с остатком " + a % b);
        else System.out.println("Делится " + a / b);

    }
}
