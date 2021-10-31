/*
Напишите программу:

1. Ввести первое  число с клавиатуры и записать его в строковую переменную.
2. Ввести второе число с клавиатуры и сохранить его в целочисленную переменную типа int.
3. Сравнить 2 числа и вывести большее на экран .
4. Выведите также меньшее число на экран, предварительно переконвертировать его в тип double.
 */

// ???
import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        String input1 = Double.toString(in.nextDouble());

        System.out.print("Введите второе число: ");
        int input2 = (int) Math.round(in.nextDouble());

        System.out.println("Большее число: " + Math.max(Double.parseDouble(input1), input2));
        System.out.println("Меньшее число: " + Math.min(Double.parseDouble(input1), input2));
    }
}
