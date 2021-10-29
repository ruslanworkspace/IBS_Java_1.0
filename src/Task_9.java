/*
Напишите программу:
    1. Пользователь вводит размер массива и данные с клавиатуры в массив типа double.
    2. Посчитайте среднее арифметическое элементов массива.
    3. После этого произведите вывод массива на экран, где каждый элемент массива умножается на среднее арифметическое
*/

import java.util.Scanner;

public class Task_9{
    public static void main(String[] args) {
        int arrLen;
        double[] arr;
        double sum = 0;
        double avg;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        arrLen = in.nextInt();
        System.out.printf("Введите %d элементов массива:\n", arrLen);
        arr = new double[arrLen];
        for (int i = 0; i < arrLen; i++){
            arr[i] = in.nextDouble();
            sum += arr[i];
        }
        avg = sum / arrLen;
        //System.out.printf("Сревнее арифметическое элементов массива -  %f\n", avg);
        for (int i = 0; i < arrLen; i++){
            System.out.print(arr[i] * avg + " ");
        }
    }
}
