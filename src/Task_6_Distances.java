import java.text.DecimalFormat;

public class Task_6_Distances {
    public static double fromMilesToMeters(double miles) {
        return miles * 1609.344;
    }
    public static double fromMilesToYards(double miles) {
        return miles * 1760;
    }
    public static double fromMilesToFeet(double miles) {
        return miles * 5280;
    }
    public static double fromMetersToMiles(double meters) {
        return meters / 1609.34;
    }
    public static double fromYardsToMiles(double yards) {
        return yards / 1760;
    }
    public static double fromFeetToMiles(double feet) {
        return feet / 5280;
    }

    public static void convertFromMeters(double meters)
    {
        DecimalFormat format = new DecimalFormat("0.###");
        System.out.printf("Метры: %s\n", format.format(meters));
        System.out.printf("Мили: %s\n", format.format(fromMetersToMiles(meters)));
        System.out.printf("Ярды: %s\n", format.format(fromMetersToMiles(fromMilesToYards(meters))));
        System.out.printf("Футы: %s\n", format.format(fromMetersToMiles(fromMilesToFeet(meters))));
    }
    public static void convertFromMiles(double miles)
    {
        DecimalFormat format = new DecimalFormat("0.###");
        System.out.printf("Мили: %s\n", format.format(miles));
        System.out.printf("Метры: %s\n", format.format(fromMilesToMeters(miles)));
        System.out.printf("Ярды: %s\n", format.format(fromMilesToYards(miles)));
        System.out.printf("Футы: %s\n", format.format(fromMilesToFeet(miles)));
    }
    public static void convertFromYards(double yards)
    {
        DecimalFormat format = new DecimalFormat("0.###");
        System.out.printf("Ярды: %s\n", format.format(yards));
        System.out.printf("Метры: %s\n", format.format(fromYardsToMiles(fromMilesToMeters(yards))));
        System.out.printf("Мили: %s\n", format.format(fromYardsToMiles(yards)));
        System.out.printf("Футы: %s\n", format.format(fromYardsToMiles(fromMilesToFeet(yards))));
    }
    public static void convertFromFeet(double feet)
    {
        DecimalFormat format = new DecimalFormat("0.###");
        System.out.printf("Футы: %s\n", format.format(feet));
        System.out.printf("Метры: %s\n", format.format(fromFeetToMiles(fromMilesToMeters(feet))));
        System.out.printf("Мили: %s\n", format.format(fromFeetToMiles(feet)));
        System.out.printf("Ярды: %s\n", format.format(fromFeetToMiles(fromMilesToYards(feet))));
    }
}