import java.text.DecimalFormat;
import java.util.Scanner;

public class Task_6_v2 {
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
                        convertFromGrams(input);
                        break;
                    case 2: //фунт
                        convertFromPounds(input);
                        break;
                    case 3: //унция
                        convertFromOunces(input);
                        break;
                    case 4: //стон
                        convertFromStones(input);
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
                        convertFromMeters(input);
                        break;
                    case 2: //миля
                        convertFromMiles(input);
                        break;
                    case 3: //ярд
                        convertFromYards(input);
                        break;
                    case 4: //фут
                        convertFromFeet(input);
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

    // Масса
    public static void convertFromGrams(double grams)
    {
        DecimalFormat format = new DecimalFormat("0.###");
        System.out.printf("Граммы: %s\n", format.format(grams));
        System.out.printf("Фунты: %s\n", format.format(grams/453.59237));
        System.out.printf("Унции: %s\n", format.format(grams/28.349523125));
        System.out.printf("Стоуны: %s\n", format.format(grams/6350.29318	));
    }

    public static void convertFromPounds(double pounds)
    {
        DecimalFormat format = new DecimalFormat("0.###");
        System.out.printf("Фунты: %s\n", format.format(pounds));
        System.out.printf("Граммы: %s\n", format.format(pounds*453.59237 ));
        System.out.printf("Унции: %s\n", format.format(pounds*16));
        System.out.printf("Стоуны: %s\n", format.format(pounds/14));
    }

    public static void convertFromOunces(double ounces)
    {
        DecimalFormat format = new DecimalFormat("0.###");
        System.out.printf("Унции: %s\n", format.format(ounces));
        System.out.printf("Граммы: %s\n", format.format(ounces*28.349523125));
        System.out.printf("Фунты: %s\n", format.format(ounces/16	));
        System.out.printf("Стоуны: %s\n", format.format(ounces/224));
    }

    public static void convertFromStones(double stones)
    {
        DecimalFormat format = new DecimalFormat("0.###");
        System.out.printf("Стоуны: %s\n", format.format(stones));
        System.out.printf("Граммы: %s\n", format.format(stones*6350.29318));
        System.out.printf("Фунты: %s\n", format.format(stones*14));
        System.out.printf("Унции: %s\n", format.format(stones*224));
    }

    // Расстояние
    public static void convertFromMeters(double meters)
    {
        DecimalFormat format = new DecimalFormat("0.###");
        System.out.printf("Метры: %s\n", format.format(meters));
        System.out.printf("Мили: %s\n", format.format(meters/1609.344));
        System.out.printf("Ярды: %s\n", format.format(meters*1.09361329833771));
        System.out.printf("Футы: %s\n", format.format(meters*3.28083989501312));
    }
    public static void convertFromMiles(double miles)
    {
        DecimalFormat format = new DecimalFormat("0.###");
        System.out.printf("Мили: %s\n", format.format(miles));
        System.out.printf("Метры: %s\n", format.format(miles*1609.344));
        System.out.printf("Ярды: %s\n", format.format(miles*1760));
        System.out.printf("Футы: %s\n", format.format(miles*5280));
    }
    public static void convertFromYards(double yards)
    {
        DecimalFormat format = new DecimalFormat("0.###");
        System.out.printf("Ярды: %s\n", format.format(yards));
        System.out.printf("Метры: %s\n", format.format(yards/1.09361329833771));
        System.out.printf("Мили: %s\n", format.format(yards/1760));
        System.out.printf("Футы: %s\n", format.format(yards*3));
    }
    public static void convertFromFeet(double feet)
    {
        DecimalFormat format = new DecimalFormat("0.###");
        System.out.printf("Футы: %s\n", format.format(feet));
        System.out.printf("Метры: %s\n", format.format(feet/3.28083989501312));
        System.out.printf("Мили: %s\n", format.format(feet/5280));
        System.out.printf("Ярды: %s\n", format.format(feet/3));
    }
}
