public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа 3");
        System.out.println("Задание 1 ");
        byte pen = 8;
        System.out.println("Значение переменной pen с типом byte равно " + pen);
        short table = 15555;
        System.out.println("Значение переменной table с типом short равно " + table);
        int car = 55555;
        System.out.println("Значение переменной car с типом int равно " + car);
        long cat = 489348;
        System.out.println("Значение переменной cat с типом long равно " + cat);
        float weight = 4.576f;
        System.out.println("Значение переменной cat с типом float равно " + weight);
        double size = 4.5749;
        System.out.println("Значение переменной size с типом double равно " + size);
        System.out.println("Задание 2 ");
        float a = 27.12f;
        System.out.println(a);
        long b = 987678965549L;
        System.out.println(b);
        float c = 2.786f;
        System.out.println(c);
        short d = 569;
        System.out.println(d);
        short v = -159;
        System.out.println(v);
        short e = 27897;
        System.out.println(e);
        byte t = 67;
        System.out.println(t);
        System.out.println("Задание 3");
        byte student1 = 23;
        byte student2 = 27;
        byte student3 = 30;
        short sheets = 480;
        int sheetsOneStudent = sheets / (student1 + student2 + student3);
        System.out.println("На каждого ученика рассчитано " + sheetsOneStudent + " листов бумаги ");
        System.out.println("Задание 4");
        byte bottle = 16;
        byte time = 2;
        byte t1 = 20;
        byte oneDay = 24;
        byte oneHour = 60;
        int t2 = oneDay * oneHour;
        int threeDays = 3;
        int t3 = t2 * threeDays;
        byte month = 30;
        int t4 = month * t2;
        int bottle1 = (t1 / time) * bottle;
        int bottle2 = (t2 / time) * bottle;
        int bottle3 = (t3 / time) * bottle;
        int bottle4 = (t4 / time) * bottle;
        System.out.println("За 20 минут машина произвела " + bottle1 + " штук бутылок ");
        System.out.println("За сутки машина произвела " + bottle2 + " штук бутылок ");
        System.out.println("За три дня машина произвела " + bottle3 + " штук бутылок ");
        System.out.println("За месяц машина произвела " + bottle4 + " штук бутылок ");
        System.out.println("Задание 5 ");
        byte totalCansOfPaint = 120;
        byte whitePaintCans = 2;
        byte brownPaintCans = 4;
        int oneClass = whitePaintCans + brownPaintCans;
        int totalClasses = totalCansOfPaint / oneClass;
        int totalWhitePaintCans = totalClasses * whitePaintCans;
        int totalBrownPaintCans = totalClasses * brownPaintCans;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhitePaintCans + " банок белой краски и " + totalBrownPaintCans + " банок коричневой краски");
        System.out.println("Задание 6 ");
        byte numberOfBananas = 5;
        byte numberOfIseCream = 2;
        byte numberOfEgs = 4;
        short mlMilk = 200;
        byte hundred = 100;
        byte gOneBananas = 80;
        byte in100gMilk = 105;
        byte gOneIseCream = 100;
        byte gOneEgs = 70;
        int weightBananas = numberOfBananas * gOneBananas;
        int weightIseCream = numberOfIseCream * gOneIseCream;
        int weightEgs = numberOfEgs * gOneEgs;
        int weightMilk = (mlMilk / hundred) * in100gMilk;
        int weightSportBreakfastGr = (weightEgs + weightBananas + weightMilk + weightIseCream);
        int grPerKg = 1000;
        float weightSportBreakfastKg = weightSportBreakfastGr / (float) grPerKg;
        System.out.println("Вес спортзавтрака " + weightSportBreakfastGr + " гр");
        System.out.println("Вес спортзавтрака " + weightSportBreakfastKg + " кг");
        System.out.println("Задание 7 ");
        short dietOne = 250;
        short dietTwo = 500;
        byte weightKg = 7;
        short inOneKgGr = 1000;
        int weightGr = weightKg * inOneKgGr;
        int quantityDietOne = weightGr / dietOne;
        int quantityDietTwo = weightGr / dietTwo;
        short quantityDiets = 2;
        int average = (dietOne + dietTwo) / quantityDiets;
        float dayInAverage = weightGr / (float) average;
        System.out.println("Если спортсмен будет терять в день по " + dietOne + " гр , то он похудеет через " + quantityDietOne);
        System.out.println("Если спортсмен будет терять в день по " + dietTwo + " гр , то он похудеет через " + quantityDietTwo);
        System.out.println("В среднем спортсмену портебуется " + dayInAverage + " , чтобы похудеть ");
        System.out.println("Задание 8 ");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        int boost = 10;
        int percent = 100;
        byte oneYear = 12;
        float boostSalary = (float) boost / (float) percent;
        float newSalaryMasha = (salaryMasha * boostSalary) + salaryMasha;
        float newSalaryDenis = (salaryDenis * boostSalary) + salaryDenis;
        float newSalaryKristina = (salaryKristina * boostSalary) + salaryKristina;
        int oldSalaryMasha = salaryMasha * oneYear;
        int oldSalaryDenis = salaryDenis * oneYear;
        int oldSalaryKristina = salaryKristina * oneYear;
        float upSalaryMasha = newSalaryMasha * oneYear;
        float upSalaryDenis = newSalaryDenis * oneYear;
        float upSalaryKristina = newSalaryKristina * oneYear;
        float annualSalaryDifferenceMasha = upSalaryMasha - oldSalaryMasha;
        float annualSalaryDifferenceDenis = upSalaryDenis - oldSalaryDenis;
        float annualSalaryDifferenceKristina = upSalaryKristina - oldSalaryKristina;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + annualSalaryDifferenceMasha + " рублей ");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + annualSalaryDifferenceDenis + " рублей ");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + annualSalaryDifferenceKristina + " рублей ");
        System.out.println("Домашняя работа завершена ");




    }
}