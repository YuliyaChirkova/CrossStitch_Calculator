package calculations;

public class FirstCalculation {

    //Рассчитать размер канвы, когда известно количество крестиков

    public static void main(String[] args) {

        int widthInCrosses = 119;  // ширина в крестиках
        int heightInCrosses = 119;  //высота в крестиках
        final double TRANSFER = 2.54;  // коэффициент
        int canvasCount = 20;  // каунт ткани
        int threads = 1;   // количество нитей в вышивке, для Аиды всегда 1

        double widthFromCrossesToCm = widthInCrosses / canvasCount * TRANSFER * threads;
        double heightFromCrossesToCm = heightInCrosses / canvasCount * TRANSFER * threads;


        double widthFromCrossesToInches = widthInCrosses / canvasCount * threads;
        double heightFromCrossesToInches = heightInCrosses / canvasCount * threads;
//-----------------------------------------------------------------------------------------------------------------------

        // Рассчет канвы в см
        System.out.println("Рассчет канвы в см:\nШирина в см: " + widthFromCrossesToCm + ", Высота в см: " + heightFromCrossesToCm);

        //Рассчет канвы в дюймах
        System.out.println("\nРассчет канвы в дюймах:\nШирина в дюймах: " + widthFromCrossesToInches + ", Высота в дюймах: " + heightFromCrossesToInches);
    }


}
