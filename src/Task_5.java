/*
Напишите простой калькулятор:

1. Ввести 2 числа с клавиатуры, затем один из символов ‘+’, ‘-’, ‘*’ или ‘/’.
2. В зависимости от символа вывести в консоль результат выполнения соответствующей арифметической операции.
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        // объявление переменных
        double a, b;
        char operation;
        double result = 0;
        String out = "";
        // создание объекла класса Scanner
        Scanner in = new Scanner(System.in);
        // создание объекла класса DecimalFormat (потребуется в конце при выводе результатов)
        DecimalFormat format = new DecimalFormat("0.##########");
        // чтение чисел и символа из консоли
        System.out.print("Введите 2 числа и один из символов арифметической операции (+, -, *, /).\n");
        System.out.print("Первое число: ");
        a = in.nextDouble();
        System.out.print("Второе число: ");
        b = in.nextDouble();
        System.out.print("Арифм операция: ");
        operation = in.next().charAt(0);
        // команда выбора
        switch (operation) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b != 0) result = a / b;
                else out = "Делить на 0 нельзя!";
                break;
            default: out = "Неизвестная операция";
                break;
        }
        // вывод результатов в консоль
        if (out.equals(""))
            System.out.printf("%s %c %s = %s\n", format.format(a), operation, format.format(b), format.format(result));
        else
            System.out.println(out);
    }
}