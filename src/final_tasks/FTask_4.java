package final_tasks;

import java.util.Scanner;

public class FTask_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает.");
        int attempts = 3; // количество попыток
        while (attempts != 0) {
            String input = in.nextLine();
            // Если пользователь просит подсказку
            if (input.equalsIgnoreCase("Подсказка")) {
                // Проверяем, что текущая попытка первая (что осталось еще 3 попытки)
                if (attempts == 3) {
                    System.out.println("zip с подвохом.");
                    attempts = 1; // после использования подсказки уменьшаем число попыток до 1 (последняя попытка)
                } else {
                    System.out.println("Подсказка уже недоступна");
                }
                // После вывода подсказки снова считываем ответ пользователя
                input = in.nextLine();
            }

            // Проверка ответа
            if (input.equalsIgnoreCase("Заархивированный вирус")) {
                // Если правильно, то сообщаем пользователю и выходим из программы
                System.out.println("Правильно!");
                System.exit(0);
            }
            else {
                // Если неправильно, то уменьшаем число попыток на 1
                attempts--;
            }
            // Если еще остались попытки
            if (attempts > 0) {
                System.out.println("Подумай еще!");
            }
        }
        System.out.println("Обидно, приходи в другой раз");
    }
}