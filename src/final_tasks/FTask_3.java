/*
Напишите программу, где пользователь вводит сначала количество строк n, затем сами строки.
Среди данных строк найти строку с максимальным количеством различных символов.
Если таких строк будет много, то вывести первую.
Пример для теста работы программы:
	Количество строк: 3
	Строка 1: привет
	Строка 2: анализ
	Строка 3: 111111111111
	Ответ: привет
*/

package final_tasks;

import java.util.Scanner;

public class FTask_3 {
	public static void main(String[] args) {
		int n;
		String[] arr;
		String str_max = "";
		Scanner in = new Scanner(System.in);
		System.out.print("Количество строк: ");
		n = in.nextInt();
		if (n <= 0) {
			System.out.println("Неположительное число. Выход.");
			System.exit(-1);
		}
		arr = new String[n];
		in.nextLine();
		for (int i = 0; i < n; i++){
			System.out.printf("Строка %d: ", i+1);
			arr[i] = in.nextLine();
			if (arr[i].chars().distinct().count() > str_max.chars().distinct().count())
			{
				str_max=arr[i];
			}
		}
		System.out.printf("Ответ: %s\n", str_max);
	}
}