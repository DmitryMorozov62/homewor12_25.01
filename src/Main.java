import java.time.*;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        System.out.println("Задача 1");
        //пишем код для задачи 1
        int year = 2014;
        int print = checkYear(year);
        printYear(year,print);
    }
    public static int checkYear(int year) {
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            return 0;
        } else {
            return 1;
        }
    }
    public static void printYear(int year,int print) {
        if (print == 0) {
            System.out.println("год " + year + " является високосным");
        } else {
            System.out.println("год " + year + " не является високосным");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        //пишем код для задачи 2
        int clientOS = 1;
        int year = 2017;
        int os = getClient(clientOS,year);
        printClient(os);
    }
    public static int getClient(int clientOS, int year) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0) {
            if (year > currentYear) {
                return 0;
            }else {
                return 1;
            }
        } else {
            if (year <= 2015) {
                return 2;
            } else {
                return 3;
            }
        }
    }
    public static void printClient(int os) {
        if (os == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (os == 1) {
            System.out.println("Установите облегченную версию для iOS по ссылке");
        } else if (os == 2) {
            System.out.println("Установите облегченную версию для Android по ссылке");
        } else {
            System.out.println("Установите версию для Android по ссылке");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        //пишем код для задачи 3
        int deliveryDistance = 110;
        int time = timingDelivery(deliveryDistance);
        printResult(time);
    }
    public static int timingDelivery (int distance) {
        int delivery = 0;
        if (distance <= 20) {
            delivery++;
            return delivery;
        } else if (distance <= 60){
            delivery += 2;
            return delivery;
        } else if (distance <= 100) {
            delivery += 3;
            return delivery;
        } else {
            return 0;
        }
    }
    public static void printResult (int time) {
        if (time == 0) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется дней: " + time);
        }
    }
}
