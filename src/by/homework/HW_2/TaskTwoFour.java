package by.homework.HW_2;

import java.util.Random;
import java.util.Scanner;

public class TaskTwoFour {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваше число ( от 1 до 100 ): ");
        int target = scanner.nextInt();
        int temp;
        int count = 0;

        while (target < 0 || target > 100) {
            System.out.println("Проверьте корректность ввода: число от 0 до 100 !!!");
            target = scanner.nextInt();
        }

        do {
            temp = random.nextInt(101);
            count++;
            // исключительно для проверки правильности работы
            System.out.print(count + ":\t" + temp + "\t");
            if (count % 10 == 0) {
                System.out.println();
            }
            // исключительно для проверки правильности работы
        } while (target != temp);
        System.out.println();
        System.out.println("Ваше число " + target + " угадано с попытки №" + count);
    }
}