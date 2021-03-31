/*
Задание: Дан массив с числами. Проверьте, есть ли в нем два одинаковых числа подряд. Если есть - выведите 'да', а если нет - выведите 'нет'.
*/
public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 1, 3, 12, 12, 5};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j])
                    System.out.println("да");
                else System.out.println("нет");

            }
        }
    }
}
