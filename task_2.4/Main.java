/*
Задание: Пользователь вводит сумму вклада и процент, который будет начисляться ежегодно. Отобразить размер вклада поочередно на ближайшие 5 лет.
*/

public class Main {
    public static void main(String[] args) {
        double a = 1000;
        double b = 0.10;
        for (int i = 1; i <= 5; i++) {
            a = a + (a * b);
            System.out.println(a);

        }

    }
}
