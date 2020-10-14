package by.homework.HW_1;

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int day;

        do {
            System.out.println("Введите день недели : ");
            day = scan.nextInt();
            switch (day) {
                case 1:
                    System.out.println("Вы выбрали Понедельник");
                    break;
                case 2:
                    System.out.println("Вы выбрали Вторник");
                    break;
                case 3:
                    System.out.println("Вы выбрали Среду");
                    break;
                case 4:
                    System.out.println("Вы выбрали Четверг");
                    break;
                case 5:
                    System.out.println("Вы выбрали Пятницу");
                    break;
                case 6:
                    System.out.println("Вы выбрали Субботу");
                    break;
                case 7:
                    System.out.println("Вы выбрали Воскресение");
                    break;
                default:
                    System.out.println("Такого дня не существует!!! Попробуйте ещё раз");
            }
        }
        while (day < 1 || day > 7);
    }

}
