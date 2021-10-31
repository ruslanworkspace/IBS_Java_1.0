//Напишите программу, где пользователь должен ввести строку из слов, разделенных пробелами. Например: “I love java 8 Я люблю java 14 core1”. Выполните следующие действия:
//  1. Выведите слова, состоящие только из латиницы.
//  2. Выведите количество этих слов.

import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {
        int count = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = in.nextLine();
        for (String word: input.split(" ")) {
            // поиск слов, состоящих только из латиницы, с использованием регулярного выражения [a-zA-Z]+
            if (word.matches("[a-zA-Z]+")) {
                System.out.println(word);
                count++;
            }
        }
        if (count == 0) System.out.println("Во входной строке нет слов, состоящих только из латиницы.");
        else System.out.printf("Количество найденных слов: %d\n", count);
    }
}
