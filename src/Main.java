public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }


    public static void task1() {
        System.out.println("Задача 1");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");

        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2016;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");


        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год " + year + " - высокосный");
        } else {
            System.out.println("Год " + year + " - НЕ высокосный");

        }

    }

    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int days = 1;
        if (deliveryDistance > 20) {
            days++;
        }
        if (deliveryDistance > 60) {
            days++;
        }
        if (deliveryDistance > 100) {
            days = -1;
        }
        if (days != -1) {
            System.out.println("Доставка занимает " + days + " дня");
        } else {
            System.out.println("Доставки нет!");
        }


    }

    public static void task5() {
        System.out.println("Задача 5");
        int mont = 11;
        switch (mont) {
            case 12:
            case 1:
            case 2:
                System.out.println("Месяц под номером " + mont + " относится к сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц под номером " + mont + " относится к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц под номером " + mont + " относится к сезону лета");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц под номером " + mont + " относится к сезону осень");
                break;
            default:
                System.out.println("Нет такого месяца - " + mont);

        }
    }
    }
