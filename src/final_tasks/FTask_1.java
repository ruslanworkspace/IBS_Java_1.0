// Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу.
// Пользователь вводит текущий курс и количество рублей.
// Итоговое значение должно быть округлено до двух знаков после запятой. Пример для теста работы программы:
//    Курс доллара: 67,55
//    Количество рублей: 1000
//    Итого: 14,80 долларов

package final_tasks;
import java.util.Scanner;

public class FTask_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Курс доллара: ");
        double USD_rate = in.nextDouble();
        if (USD_rate <= 0) {
            System.out.print("Неположительное значение. Выход.");
            System.exit(0);
        }

        System.out.print("Количество рублей: ");
        double RUB_amount = in.nextDouble();
        if (RUB_amount < 0) {
            System.out.print("Отрицательное значение. Выход.");
            System.exit(0);
        }

        System.out.printf("Итого: %.2f долларов", RUB_amount/USD_rate);
    }
}
