/*
Напишите программу, принимающую на вход строку “I like Java!!!”, которая будет выполнять следующие действия:

1. Проверить, содержит ли строка подстроку “Java” (используйте contains()).
2. Проверить, начинается ли строка с подстроки “I like” (используйте startsWith()).
3. Проверить, заканчивается ли строка с подставки “!!!” (используйте endsWith()).
4. Если 3 предыдущих условия верны, выведите данную строку, преобразованную к верхнему регистру.
5. Замените все символы ‘a’ на ‘о’ и введите подстроку “Jovo” на экран  (используйте substring()).
 */

import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {
        boolean flag_contains = false;
        boolean flag_startsWith = false;
        boolean flag_endsWith = false;
        int indexOfSubstring = -1;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку \"I like Java!!!\": ");
        String input = in.nextLine();

//        // Проверяем, соответствует ли вдохная строка ожидаемой (регистронезависимое сравнение)
//        if (!input.equalsIgnoreCase("I like Java!!!")) {
//            System.out.println("Вы ввели не \"I like Java!!!\"");
//            System.exit(-1);
//        }

        // проверяем, содержит ли входная строка подстроку "Java"
        if (input.contains("Java")) {
            flag_contains = true; // Выставляем флаг в true
            indexOfSubstring = input.indexOf("Java"); // Сохраняем индекс, с которого начинается подстрока в строке.
            System.out.println("Строка содержит подстроку \"Java\"");
        }
        else {
            System.out.println("Строка НЕ содержит подстроку \"Java\"");
        }
        // проверяем, начинается ли входная строка с подстроки "I like"
        if (input.startsWith("I like")) {
            flag_startsWith = true; // Выставляем флаг в true
            System.out.println("Строка начинается с подстроки \"I like\"");
        }
        else {
            System.out.println("Строка НЕ начинается с подстроки \"I like\"");
        }
        // проверяем, заканчивается ли входная строка подстрокой "!!!"
        if (input.endsWith("!!!")) {
            flag_endsWith = true; // Выставляем флаг в true
            System.out.println("Строка заканчивается подстрокой \"!!!\"");
        }
        else {
            System.out.println("Строка НЕ заканчивается подстрокой \"!!!\"");
        }

        // проверяем успешны ли предыдущие 3 проверки
        if (flag_contains && flag_startsWith && flag_endsWith) {
            System.out.println(input.toUpperCase());
        }
        // если входная строка содержит подстроку "Java"
        if (flag_contains) {
            System.out.println(input.replace('a', 'o').substring(indexOfSubstring,indexOfSubstring+4));
        }
    }
}
