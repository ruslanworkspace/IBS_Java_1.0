import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        int type, unit;
        double input = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        type = in.nextInt();
        switch (type) {
            case 1: // масса
                System.out.println("Выберите единицу измерения: 1 - грамм, 2 - фунт, 3 - унция, 4 - стон");
                unit = in.nextInt();
                if (unit >= 1 & unit <=4) {
                    System.out.print("Введите число: ");
                    input = in.nextDouble();
                    checkInputValue(input);
                }
                switch (unit) {
                    case 1: //грамм
                        Task_6_Weight.convertFromGrams(input);
                        break;
                    case 2: //фунт
                        Task_6_Weight.convertFromPounds(input);
                        break;
                    case 3: //унция
                        Task_6_Weight.convertFromOunces(input);
                        break;
                    case 4: //стон
                        Task_6_Weight.convertFromStones(input);
                        break;
                    default:
                        System.out.print("Недопустимое значение единиц измерений. Выход.");
                        break;
                }
                break;

            case 2: // расстояние
                System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
                unit = in.nextInt();
                if (unit >= 1 & unit <=4) {
                    System.out.print("Введите число: ");
                    input = in.nextDouble();
                    checkInputValue(input);
                }
                switch (unit) {
                    case 1: // метр
                        Task_6_Distances.convertFromMeters(input);
                        break;
                    case 2: //миля
                        Task_6_Distances.convertFromMiles(input);
                        break;
                    case 3: //ярд
                        Task_6_Distances.convertFromYards(input);
                        break;
                    case 4: //фут
                        Task_6_Distances.convertFromFeet(input);
                        break;
                    default:
                        System.out.print("Недопустимое значение единиц измерений. Выход.");
                        break;
                }
                break;

            default: // не найдено
                System.out.print("Недопустимое значение. Выход.");
                break;
        }
    }

    public static void checkInputValue(double input) {
        if (input < 0) {
            System.out.print("Отрицательные значения недопустимы. Выход.");
            System.exit(0);
        }

    }

}
