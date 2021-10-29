/*
Напишите программу:
    1. Пользователь вводит размер массива и данные с клавиатуры в массив
    2. Сравнить элементы массива с заранее заданными константами x, y, z.
    3. Если массив содержит хотя бы одну из констант, вывести текст "Данное значение имеется в константах".
*/

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        final int X = 10;
        final int Y = 20;
        final int Z = 30;
        int arrLen;
        int[] arr;
        boolean flag_arrContainsConst = false;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        arrLen = in.nextInt();
        System.out.printf("Введите %d элементов массива:\n", arrLen);
        arr = new int[arrLen];
        // вариант 1
        for (int i = 0; i < arrLen; i++){
            arr[i] = in.nextInt();
            if (arr[i] == X || arr[i] == Y || arr[i] == Z){
                flag_arrContainsConst = true;
            }
        }
        if (flag_arrContainsConst) System.out.println("Данное значение имеется в константах");

        // вариант 2
/*        for (int i = 0; i < arrLen; i++){
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < arrLen; i++){
            if (arr[i] == X || arr[i] == Y || arr[i] == Z){
                System.out.printf("%d - данное значение имеется в константах\n",arr[i]);
            }
        }*/

    }
}
