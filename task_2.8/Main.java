
/*
Задание: Дан массив с элементами [2, 3, 4, 5]. С помощью цикла for найдите произведение элементов этого массива.
*/

public class Main {
    public static void main(String[] args) {
        int[] elem = {2, 3, 4, 5};
        int num = 1;
        for (int i = 0; i < elem.length; i++) {
            num *= elem[i];
            System.out.println(num);
        }

    }
}
