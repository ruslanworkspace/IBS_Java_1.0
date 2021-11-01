//Напишите программу, заполняющую массив из 15 элементов рандомными значениями в диапазоне от -20 до 20. Далее:
//    1. Выведите максимальный и минимальный элемент массива.
//    2. Из максимального и минимального значения выведите наибольшее по модулю.

import java.util.Random;

public class Task_14 {
    public static void main(String[] args) {
        Random random = new Random();
        int max, min;
        int[] array = new int[15];
        array[0] = min = max = random.nextInt(41) - 20;
        for (byte i = 1; i < array.length; i++){
            array[i] = (random.nextInt(41) - 20);
            if (array[i] > max) max = array[i];
            if (array[i] < min) min = array[i];
        }

        System.out.printf("Максимальный элемент массива: %d\n", max);
        System.out.printf("Минимальный элемент массива: %d\n", min);
        System.out.printf("Наибольший по модулю: %d\n", Math.max(Math.abs(min),Math.abs(max)));
    }
}
