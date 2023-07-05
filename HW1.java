package gomework;

// 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

public class Task01 {

    public static void main(String[] args) {
        short n = 8;
        int sum = 0;
        int mult = 1;
        for (int i = 1; i <= n; i++) {
            sum += i;
            mult *= i;
        }
        System.out.println("Сумма чисел от 1 до " + n + " = " + sum);
        System.out.println("Произведение чисел от 1 до " + n + " = " + mult);

    }
        
}
