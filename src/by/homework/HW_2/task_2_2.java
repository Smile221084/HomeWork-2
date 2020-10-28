package by.homework.HW_2;

import java.util.Scanner;

public class task_2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month;
        int day;
        int year;
        int[] arrayMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.println("Введите номер месяца: ");

        while (true) {
            month = scanner.nextInt();
            if (month > 0 && month < 13) {
                break;
            } else {
                System.out.println("Подумайте ещё раз, что-то не так...");
            }
        }

        System.out.println("Введите день месяца: ");
        day = scanner.nextInt();

        if (day == 29 && month == 2) {
            System.out.println("Для точности результата введите год: ");
            year = scanner.nextInt();
            if (year % 4 == 0) {
                System.out.println("Такой день существует");
            } else {
                System.out.println("Такого дня нет");
            }
            return;
        }

        if (day > arrayMonth[month - 1]) {
            System.out.println("Такого дня в указанном месяце не существует");
        } else {
            System.out.println("Такой день существует");
        }

    }

}
