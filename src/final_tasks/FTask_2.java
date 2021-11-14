//Напишите программу, которая позволит решить простое уравнение относительно x.
//Программа принимает на вход строку длиной 5 символов.
//Второй символ строки является знаком ‘+’ или ‘-’, четвертый символ строки ‘=’.
//Первым, третьим и пятым символом являются две цифры (от 0 до 9) и буква ‘x’ (обозначает неизвестное) в любом порядке.
//Нужно найти неизвестное.
//
//Пример для теста работы программы:
//    Ввод: x+5=7
//    Вывод: 2
//    Ввод: 3-x=9
//    Вывод: -6
//    Ввод: 3-3=x
//    Вывод: 0


package final_tasks;

import java.util.Scanner;

public class FTask_2 {
    public static void main(String[] args) {
        int x;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите уравнение: ");
        String input = in.nextLine().toLowerCase();
        checkInputValue(input);

        // уравнения типа x+a=b и x-a=b
        if (input.startsWith("x")) {
            if (input.charAt(1) == '+'){
                x = Character.getNumericValue(input.charAt(4)) - Character.getNumericValue(input.charAt(2));
            }
            else {
                x = Character.getNumericValue(input.charAt(2)) + Character.getNumericValue(input.charAt(4));
            }
        }
        // уравнения типа a+b=x и a-b=x
        else if (input.endsWith("x")) {
            if (input.charAt(1) == '+'){
                x = Character.getNumericValue(input.charAt(2)) + Character.getNumericValue(input.charAt(0));
            }
            else {
                x = Character.getNumericValue(input.charAt(0)) - Character.getNumericValue(input.charAt(2));
            }
        }
        // уравнения типа a+x=b и a-x=b
        else {
            if (input.charAt(1) == '+'){
                x = Character.getNumericValue(input.charAt(4)) - Character.getNumericValue(input.charAt(0));
            }
            else {
                x = Character.getNumericValue(input.charAt(0)) - Character.getNumericValue(input.charAt(4));
            }
        }
        System.out.printf("Вывод: %d\n", x);

    }

    public static void checkInputValue(String input) {
        int x_count = 0;

        if (input.length() != 5) {
            System.out.print("Уравнение должно состоять строго из 5-ти символов! Выход.");
            System.exit(-1);
        }

        for (int i = 0; i < 5; i++){
            switch (i){
                // цифры или 'x'
                case 0:
                case 2:
                case 4:
                    if (Character.isDigit(input.charAt(i))) {
                        continue;
                    }
                    else if (input.charAt(i) == 'x') {
                        x_count++;
                    }
                    else {
                        System.out.printf("%d-й символ должен быть цифрой или буквой \"x\", а у вас \"%c\"! Выход.", i+1, input.charAt(i));
                        System.exit(-1);
                    }
                    break;
                // символ + или -
                case 1:
                    if ( !( (input.charAt(i) == '+') || (input.charAt(i) == '-') ) ) {
                        System.out.printf("%d-й символ должен быть \"+\" или \"-\", а у вас \"%c\"! Выход. ", i+1, input.charAt(i));
                        System.exit(-1);
                    }
                    break;
                // символ =
                case 3:
                    if (input.charAt(i) != '=') {
                        System.out.printf("%d-й символ должен быть \"=\", а у вас \"%c\"! Выход.", i+1, input.charAt(i));
                        System.exit(-1);
                    }
                    break;
                }
            }
        if (x_count != 1)
        {
            System.out.println("В уравнении должно быть одно неизвестное! Вы ввели уравнение: " +input );
            System.exit(-1);
        }
    }
}
