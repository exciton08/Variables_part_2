public class Main {
    public static void main(String[] args) {

        //Задача 1
        System.out.println("Задача 1");
        int applesCount = 5;
        System.out.println("Значение переменной applesCount с типом int равно " + applesCount);
        byte orangesCount = 4;
        System.out.println("Значение переменной orangesCount с типом byte равно " + orangesCount);
        short catsCount = 3;
        System.out.println("Значение переменной catsCount с типом short равно " + catsCount);
        long peopleCount = 7_500_000_000L;
        System.out.println("Значение переменной peopleCount с типом long равно " + peopleCount);
        float pi = 3.141592f;
        System.out.println("Значение переменной pi с типом float равно " + pi);
        double e = 2.8;
        System.out.println("Значение переменной e с типом double равно " + e);

        //Задача 2
        System.out.println(" ");
        System.out.println("Задача 2");
        float var_1 = 27.12f;
        long var_2 = 987_678_965_549L;
        double var_3 = 2.786;
        boolean var_4 = false;
        char var_5 = 569;
        short var_6 = -159;
        int var_7 = 27_897;
        byte var_8 = 67;

        //Задача 3
        System.out.println(" ");
        System.out.println("Задача 3");
        int pupilsInFirstClass = 23;
        int pupilsInSecondClass = 27;
        int pupilsInThirdClass = 30;
        int totalPapers = 480;
        int papersPerPupil = totalPapers / (pupilsInFirstClass + pupilsInSecondClass + pupilsInThirdClass);
        System.out.println("На каждого ученика рассчитано " + papersPerPupil + " листов бумаги");

        //Задача 4
        System.out.println(" ");
        System.out.println("Задача 4");
        int bottle = 16;
        int minutes = 2;
        int productivityPerMinute = bottle / minutes;
        int twentyMinutes = 20;
        System.out.println("За " + twentyMinutes + " минут машина произвела бутылок: " + productivityPerMinute * twentyMinutes + " штук");
        int minutesPerDay = 24 * 60;
        System.out.println("За " + minutesPerDay + " минут машина произвела бутылок: " + productivityPerMinute * minutesPerDay + " штук");
        int minutesInThreeDay = 3 * minutesPerDay;
        System.out.println("За " + minutesInThreeDay + " минут машина произвела бутылок: " + productivityPerMinute * minutesInThreeDay + " штук");
        int minutesInMonth = 30 * minutesPerDay;
        System.out.println("За " + minutesInMonth + " минут машина произвела бутылок: " + productivityPerMinute * minutesInMonth + " штук");

        //Задача 5
        System.out.println(" ");
        System.out.println("Задача 5");
        int totalCans = 120;
        int whiteCansPerClass = 2;
        int brownCansPerClass = 4;
        int totalClasses = totalCans / (whiteCansPerClass + brownCansPerClass);
        int totalWhiteCans = totalClasses * whiteCansPerClass;
        int totalBrownCans = totalClasses * brownCansPerClass;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhiteCans + " банок белой краски и " + totalBrownCans + " банок коричневой краски");

        //Задача 6
        System.out.println(" ");
        System.out.println("Задача 6");
        int bananas = 5;                               // Количество бананов;
        int bananaWeightInGrams = 80;                  // Вес 1 банана в гр.;
        int amountOfMilkInMilliliters = 200;           // Количество молока в мл.;
        int oneHundredMillilitersOfMilkInGrams = 105;  // Вес 100 мл. молока в гр.;
        int iceCreams = 2;                             // Количество мороженного;
        int iceCreamWeightInCrams = 100;               // Вес 1 мороженного в гр.;
        int eggs = 2;                                  // Количество сырых яиц;
        int eggWeightInCrams = 100;                    // Вес 1 яйца в гр.;
        int totalBananasWeightInGrams = bananas * bananaWeightInGrams;
        int totalMilkWeightInGrams = amountOfMilkInMilliliters * oneHundredMillilitersOfMilkInGrams;
        int totalIceCreamWeightInGrams = iceCreams * iceCreamWeightInCrams;
        int totalEggsWeightInGrams = eggs * eggWeightInCrams;
        int sportsBreakfastInGrams = totalBananasWeightInGrams + totalMilkWeightInGrams + totalIceCreamWeightInGrams + totalEggsWeightInGrams;
        System.out.println("Вес спорт-завтрака в граммах: " + sportsBreakfastInGrams);
        // Способ 1
        float sportsBreakfastInKilograms = (float) sportsBreakfastInGrams / 1000;
        System.out.println("Вес спорт-завтрака в килограммах: " + sportsBreakfastInKilograms);
        // Способ 2
        double sportsBreakfastInKilograms2 = sportsBreakfastInGrams / 1000.0;
        System.out.println("Вес спорт-завтрака в килограммах: " + sportsBreakfastInKilograms);

        //Задача 7
        System.out.println(" ");
        System.out.println("Задача 7");
        int totalDropWeightInKg = 7;
        int dropWeightInGramsPerDay_1 = 250;
        int dropWeightInGramsPerDay_2 = 500;
        int totalDropWeightInGrams = totalDropWeightInKg * 1000;  // 1 кг. = 1000 гр.
        int countDay1 = totalDropWeightInGrams / dropWeightInGramsPerDay_1;
        int countDay2 = totalDropWeightInGrams / dropWeightInGramsPerDay_2;
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм, то уйдет " + countDay1 + " дней на похудение");
        System.out.println("Если спортсмен будет терять каждый день по 500 грамм, то уйдет " + countDay2 + " дней на похудение");
        int averageDay = (countDay1 + countDay2) / 2;
        System.out.println(averageDay + " дней может потребоваться в среднем, чтобы добиться результата похудения");

        //Задача 8
        System.out.println(" ");
        System.out.println("Задача 8");
        int mashaSalaryPerMonth = 67_760;
        int denisSalaryPerMonth = 83_690;
        int kristinaSalaryPerMonth = 76_230;
        int increasePercentageSalaryPerMonth = 10;
        int newMashaSalaryPerMonth = mashaSalaryPerMonth + (mashaSalaryPerMonth * increasePercentageSalaryPerMonth) / 100;
        int newDenisSalaryPerMonth = denisSalaryPerMonth + (denisSalaryPerMonth * increasePercentageSalaryPerMonth) / 100;
        int newKristinaSalaryPerMonth = kristinaSalaryPerMonth + (kristinaSalaryPerMonth * increasePercentageSalaryPerMonth) / 100;
        int mashaProfitPerYear = (newMashaSalaryPerMonth - mashaSalaryPerMonth) * 12;
        int denisProfitPerYear = (newDenisSalaryPerMonth - denisSalaryPerMonth) * 12;
        int kristinaProfitPerYear = (newKristinaSalaryPerMonth - kristinaSalaryPerMonth) * 12;
        System.out.println("Маша теперь получает " + newMashaSalaryPerMonth + " рублей. Годовой доход вырос на " + mashaProfitPerYear + " рублей");
        System.out.println("Денис теперь получает " + newDenisSalaryPerMonth + " рублей. Годовой доход вырос на " + denisProfitPerYear + " рублей");
        System.out.println("Кристина теперь получает " + newKristinaSalaryPerMonth + " рублей. Годовой доход вырос на " + kristinaProfitPerYear + " рублей");

    }
}