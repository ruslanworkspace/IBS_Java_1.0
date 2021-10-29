//Напишите программу, где пользователь вводит данные с клавиатуры в матрицу,
// а после этого произведите вывод первой строки матрицы на экран, где каждый элемент умножается на 3.
// Размерность матрицы задается пользователем.

import java.util.Arrays;
import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        int columns, rows;
        int[][] twoDimArray;
        Scanner in = new Scanner(System.in);
        System.out.println("Размерность матрицы");
        System.out.print("Кол-во строк: ");
        rows = in.nextInt();
        if (rows < 1 ) {
            System.out.print("Кол-во строк не может быть меньше 1 ");
            System.exit(-1);
        }

        System.out.print("Кол-во столбцов: ");
        columns = in.nextInt();
        if (columns < 1 ) {
            System.out.print("Кол-во столбцов не может быть меньше 1 ");
            System.exit(-1);
        }
        System.out.print("Введите элементы массива:\n");
        twoDimArray = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("[%d][%d]: ", i, j);
                twoDimArray[i][j] = in.nextInt();
            }
        }
        System.out.print("Первая строка, умноженная на 3:\n");
        for (int j = 0; j < columns; j++) {
            System.out.print(twoDimArray[0][j]*3 + " ");
        }
    }
}
