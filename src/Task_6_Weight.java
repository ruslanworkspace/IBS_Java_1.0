import java.text.DecimalFormat;

public class Task_6_Weight {
    public static double fromPoundsToGrams(double pounds) {
        return pounds * 453.59237;
    }
    public static double fromPoundsToOunces(double pounds) {
        return pounds * 16;
    }
    public static double fromPoundsToStones(double pounds) {
        return pounds / 14;
    }
    public static double fromGramsToPounds(double grams) {
        return grams / 453.59237;
    }
    public static double fromOuncesToPounds(double ounces) {
        return ounces / 16;
    }
    public static double fromStonesToPounds(double stones) {
        return stones * 14;
    }

    public static void convertFromGrams(double grams)
    {
        DecimalFormat format = new DecimalFormat("0.###");
        System.out.printf("Граммы: %s\n", format.format(grams));
        System.out.printf("Фунты: %s\n", format.format(fromGramsToPounds(grams)));
        System.out.printf("Унции: %s\n", format.format(fromGramsToPounds(fromPoundsToOunces(grams))));
        System.out.printf("Стоуны: %s\n", format.format(fromGramsToPounds(fromPoundsToStones(grams))));
    }
    public static void convertFromPounds(double pounds)
    {
        DecimalFormat format = new DecimalFormat("0.###");
        System.out.printf("Фунты: %s\n", format.format(pounds));
        System.out.printf("Граммы: %s\n", format.format(fromPoundsToGrams(pounds)));
        System.out.printf("Унции: %s\n", format.format(fromPoundsToOunces(pounds)));
        System.out.printf("Стоуны: %s\n", format.format(fromPoundsToStones(pounds)));
    }
    public static void convertFromOunces(double ounces)
    {
        DecimalFormat format = new DecimalFormat("0.###");
        System.out.printf("Унции: %s\n", format.format(ounces));
        System.out.printf("Граммы: %s\n", format.format(fromOuncesToPounds(fromPoundsToGrams(ounces))));
        System.out.printf("Фунты: %s\n", format.format(fromOuncesToPounds(ounces)));
        System.out.printf("Стоуны: %s\n", format.format(fromOuncesToPounds(fromPoundsToStones(ounces))));
    }
    public static void convertFromStones(double stones)
    {
        DecimalFormat format = new DecimalFormat("0.###");
        System.out.printf("Стоуны: %s\n", format.format(stones));
        System.out.printf("Граммы: %s\n", format.format(fromStonesToPounds(fromPoundsToGrams(stones))));
        System.out.printf("Фунты: %s\n", format.format(fromStonesToPounds(stones)));
        System.out.printf("Унции: %s\n", format.format(fromStonesToPounds(fromPoundsToOunces(stones))));
    }
}