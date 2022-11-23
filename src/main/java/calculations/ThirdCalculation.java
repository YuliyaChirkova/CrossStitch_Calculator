package calculations;

public class ThirdCalculation {

    // Рассчитать размер канвы исходя из размера вышивки на канве другого каунта
    public static void main(String[] args) {

        double widthInCm = 119;  // ширина в см
        double heightInCm = 119;  // высота с см
        double widthInInches = 119;  // ширина в дюймах
        double heightInInches = 119;  //высота с дюймах
        final double TRANSFER = 2.54;  // коэффициент
        int firstCount = 20;  // каунт первой ткани
        int secondCount = 16;   // каунт второй ткани
        int firstThreads = 1;   // количество нитей в первой вышивке
        int secondThreads = 1;   // количество нитей во второй вышивке


        double widthСountOfCrosses = (widthInCm / TRANSFER * firstCount / firstThreads) / secondCount;
        double heightСountOfCrosses = (heightInCm / TRANSFER * firstCount / firstThreads) / secondCount;

        double widthFromCmToCm = widthСountOfCrosses * TRANSFER * secondThreads;
        double heightFromCmToCm = heightСountOfCrosses * TRANSFER * secondThreads;

        double widthFromCmToInch = widthСountOfCrosses * secondThreads;
        double heightFromCmToInch = heightСountOfCrosses * secondThreads;

        double widthFromInchToCm = (widthInInches * firstCount / firstThreads) / secondCount * TRANSFER * secondThreads;
        double heightFromInchToCm = (heightInInches * firstCount / firstThreads) / secondCount * TRANSFER * secondThreads;

        double widthFromInchToInch = (widthСountOfCrosses * firstCount / firstThreads) / secondCount * secondThreads;
        double heightFromInchToInch = (heightСountOfCrosses * firstCount / firstThreads) / secondCount * TRANSFER * secondThreads;
//------------------------------------------------------------------------------------------------

        // Рассчет канвы, из см в см
        System.out.println("Рассчет канвы, из см в см:\nШирина в см: " + widthFromCmToCm + ", Высота в см: " + heightFromCmToCm);

        // Рассчет канвы, из см в дюймы
        System.out.println("\nРассчет канвы, из см в дюймы:\nШирина в дюймах: " + widthFromCmToInch + ", Высота в дюймах: " + heightFromCmToInch);

        // Рассчет канвы, из дюймов в см
        System.out.println("\nРассчет канвы, из дюймов в см:\nШирина в см: " + widthFromInchToCm + ", Высота в см: " + heightFromInchToCm);

        // Рассчет канвы, из дюймов в дюймы
        System.out.println("\nРассчет канвы, из дюймов в дюймы:\nШирина в дюймах: " + widthFromInchToInch + ", Высота в дюймах: " + heightFromInchToInch);


    }
}
