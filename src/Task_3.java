import java.util.Arrays;

public class Task_3 {
    public static void main(String[] args) {
        // объявление массива
        int[] arr = {5, 15, 10, 42, 13};
        // вывод объявленного массива в консоль
        // System.out.println(Arrays.toString(arr));

        // сохранение первого элемента массива
        int arr_first = arr[0];
        // присвоение первому элементу массива значение последнего элемента массива
        arr[0] = arr[arr.length-1];
        // присвоение последнему элементу массива сохраненное ранее значение первого элемента массива
        arr[arr.length-1] = arr_first;
        // вывод получившегося массива в консоль
        // System.out.println(Arrays.toString(arr));

        // суммируем последний и средний элементы массива
        // arr.length-1 - индекс последнего элемента массива
        // arr.length/2 - индекс среднего элемента массива (только для массивов с нечетным кол-вом элементов)
        int result = arr[arr.length-1] + arr[arr.length/2];
        // вывод результата в консоль
        System.out.println(result);

    }
}
