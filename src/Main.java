public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task6();
        task7();
        task8();

    }

    public static void task1() {
        System.out.println("Задача 1 ");
        int investment = 15_000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            total = total + investment;
            System.out.println("Месяц " + i++ + ", сумма накоплений равна " + total + " рублей");
        }

    }

    public static void task2() {
        System.out.println("Задача 2");
        int number = 0;
        while (number < 10) {
            number = number + 1;
            System.out.print(number);
        }
        for (int i = 10; i >= 1; i = --i) {
            System.out.print(i);
        }
    }

    public static void task3() {
        System.out.println(" Задача 3");
        int totalPeople = 12_000_000;
            for (int i = 0; i < 10; i++) {
                totalPeople = totalPeople + (totalPeople / 1000 * 9);
                System.out.println("Год " + i + 1 + " численность населения составляет " + totalPeople);

            }

    }
    public static void task4() {
        System.out.println("Задача 4");
        double monthCapital = 15_000;
        int totalCapital  = 12_000_000;
        int month = 0;
        while (monthCapital < totalCapital) {
            monthCapital *= 1.07;
            ++month;
            System.out.println("Месяц " + month + " - накопления " + monthCapital);

        }
    }
    public static void task5() {
        System.out.println(" Задача 5");
        double monthCapital = 15_000;
        int totalCapital  = 12_000_000;
        int month = 0;
        while (monthCapital < totalCapital) {
            monthCapital *= 1.07;
            ++month;

            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " - накопления " + monthCapital);
            }
        }
    }
    public static void task6() {
        System.out.println(" Задача 6");
        int capital = 15_000;
        int month = 9 * 12;
        for (int i = 1; i <= month; ++i) {
            capital *= 1.07;

            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " - накопления " + capital);
            }
        }
    }
    public static void task7() {
        System.out.println(" Задача 7");
        int fridayOne = 4;

        for (int i = 4; i <= 31; i = i + 7) {
            System.out.println("Сегодня пятница " + i + "-е число. Необходимо подготовить отчет");

        }
    }
    public static void task8() {
        System.out.println(" Задача 8");
        int year = 2023;
        int year1 = year - 200;
        int year2 = year + 100;

        for (int i = year1; i <= year2 ; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
            
        }
    }
}