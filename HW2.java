package gomework;

// 2) Вывести все простые числа от 1 до 1000

public class Task02 {
    public static void main(String[] args) {
        short num = 1000;
        for (short i = 1; i < num; i++) {
            boolean isPrime = true;

            for (short j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + ", ");
            }
        }

    }
}
