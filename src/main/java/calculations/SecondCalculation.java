package calculations;

public class SecondCalculation {

    //Рассчитать вышивку в крестиках, когда известен размер в см или дюймах
    public static void main(String[] args) {

        double widthInCm = 119;  // ширина в см
        double heightInCm = 119;  // высота с см

        double widthInInches = 119;  // ширина в дюймах
        double heightInInches = 119;  //высота с дюймах

        final double TRANSFER = 2.54;  // коэффициент

        int canvasCount = 20;  // каунт ткани

        int threads = 1;   // количество нитей в вышивке, для Аиды всегда 1

        double widthFromCmToCrosses = widthInCm / TRANSFER * canvasCount / threads;
        double heightFromCmToCrosses = heightInCm / TRANSFER * canvasCount / threads;

        double widthFromInchesToCrosses = widthInInches * canvasCount / threads;
        double heightFromInchesToCrosses = heightInInches * canvasCount / threads;
//-----------------------------------------------------------------------------------------------------------------------

        // Рассчет канвы из см в крестики
        System.out.println("Рассчет канвы из см в крестики:\nШирина в крестиках: " + widthFromCmToCrosses + ", Высота в крестиках: " + heightFromCmToCrosses);

        //Рассчет канвы из дюймов в крестики
        System.out.println("\nРассчет канвы из дюймов в крестики:\nШирина в дюймах: " + widthFromInchesToCrosses + ", Высота в дюймах: " + heightFromInchesToCrosses);



    }
}
