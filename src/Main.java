import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        System.out.println("Задача 1");
        //пишем код для задачи 1
        int year = 2023;
        checkYear(year);
    }

    public static void checkYear(int year) {
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println("год " + year + " является високосным");
        } else {
            System.out.println("год " + year + " не является високосным");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        //пишем код для задачи 2
        int clientOS = 1;
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        getClient(clientOS,currentYear);
    }
    public static void getClient(int clientOS, int currentYear) {
        if (clientOS == 0) {
            if (currentYear > 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }else {
                System.out.println("Установите облегченную версию для iOS по ссылке");
            }
        } else {
            if (currentYear < 2015) {
                System.out.println("Установите облегченную версию для Android по ссылке");
            } else {
                System.out.println("Установите версию для Android по ссылке");
            }
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        //пишем код для задачи 3
        int deliveryDistance = 70;
        int time = delivery(deliveryDistance);
        if (delivery(deliveryDistance) == 0) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется дней: " + time);
        }
    }

    public static int delivery(int distance) {
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
}
