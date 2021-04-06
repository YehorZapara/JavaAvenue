/*Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 4 ...
2 4 6 8 ...
3 6 9 12 ...
4 8 12 16 ...
... */
public class Main {
    public static void main(String[] args) {
        int[] mult = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i <= mult.length; i++) {
            for (int j = 0; j <= mult.length; j++) {
                System.out.println(i*j);
            }

        }

    }
}
