package by.homework.HW_2;

import java.util.Scanner;
import java.util.ServiceConfigurationError;

public class task_2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Если Вы не знаете ответ на следующий вопрос или хотите сдться введите 0");
        System.out.println("В каком году состоялся первый полет в космос? (У Вас 5 попыток): "); //1961

        int year;
        int count = 1;

        do {
            System.out.println("Попытка №" + count + ": ");
            year = scanner.nextInt();
            if (count == 5 || year == 0) {
                System.out.println("Необходимо подучиться!!!");
                return;
            }
            count++;
        } while (year != 1961);

        System.out.println("Вы правильно ответили на вопрос!!!");

    }
}