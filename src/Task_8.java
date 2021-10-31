// Напишите программу, где пользователь вводит любое целое положительное число n. А программа суммирует все нечетные числа от 1 до введенного пользователем числа n.


import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        int input, result=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое положительное число: ");
        input = in.nextInt();
        if (input <= 0) {
            System.out.print("Число неположительное! Выход ");
            System.exit(0);
        }
        for (int i = 1; i < input; i+=2){
            result += i;
        }
        System.out.printf("Сумма нечетных чисел от 1 до %d - %d", input, result);
    }
}
