package gomework;

// 3) Реализовать простой калькулятор

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        int firstNumber, secondNumber, operation;
        double result;
        Scanner xScanner = new Scanner(System.in);
        Scanner aScanner = new Scanner(System.in);
        Scanner bScanner = new Scanner(System.in);

        System.out.println("Выберите операцию: ");
        System.out.println("1: Сложение 2: Вычитание 3: Умножение 4: Деление");
        operation = xScanner.nextInt();
        
        switch (operation) {
            case 1:
                System.out.println("Введите числа, которые нужно сложить: ");
                firstNumber = aScanner.nextInt();
                secondNumber = bScanner.nextInt();
                result = firstNumber + secondNumber;
                System.out.print(firstNumber + " + " + secondNumber + " = " + (int)result);
                break;
            case 2:
                System.out.println("Введите числа, которые нужно вычесть: ");
                firstNumber = aScanner.nextInt();
                secondNumber = bScanner.nextInt();
                result = firstNumber - secondNumber;
                System.out.print(firstNumber + " - " + secondNumber + " = " + (int)result);
                break;
            case 3:
                System.out.println("Введите числа, которые нужно умножить: ");
                firstNumber = aScanner.nextInt();
                secondNumber = bScanner.nextInt();
                result = firstNumber * secondNumber;
                System.out.print(firstNumber + " * " + secondNumber + " = " + (int)result);
                break;
            case 4:
                System.out.println("Введите числа, которые нужно разделить: ");
                firstNumber = aScanner.nextInt();
                secondNumber = bScanner.nextInt();
                result = (double)firstNumber / secondNumber;
                if (secondNumber != 0){
                    System.out.print(firstNumber + " / " + secondNumber + " = " + result);
                } else { }System.out.print("Операция невозможна");
                break;
            default:
                break;
        }
    }
}
