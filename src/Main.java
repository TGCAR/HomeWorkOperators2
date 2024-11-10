public class Main {
    public static void main(String[] args) {

        // Задача 1

        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Задача 2

        int clientDevicesYear = 2010;
        if (clientOS == 0 && clientDevicesYear <= 2015) {
            System.out.println("Установите блегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDevicesYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Задача 3

        int year = 2384;
        if (year < 1584) {
            System.out.println(year + " Год должен быть больше чем 1584. ");
        } else if (year % 100 == 0) {
            System.out.println(year + " Год не является високосным. ");
        } else if (year % 400 == 0) {
            System.out.println(year + " Год является високосным. ");
        } else if (year % 4 == 0) {
            System.out.println(year + " Год является високосным");
        } else {
            System.out.println(year + " Год не является високосным");
        }

        // Задача 4

        int
    }
}


