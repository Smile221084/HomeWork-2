package by.homework.HW_1;

import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите целое число: ");
        int x1 = scan.nextInt();
        System.out.println("Введите целое число болешее чем предыдущее:");
        int x2 = scan.nextInt();
        while (x2 <= x1) {
            System.out.println("Попробуйте ещё раз:");
            x2 = scan.nextInt();
        }
        System.out.println("Введите Ваше число: ");
        int target = scan.nextInt();
        if (target <= x1) {
            System.out.println("Введенное Вами число попадает в промежуток (-∞:" + x1 + "]");
        }
        else if (target <= x2) {
            System.out.println("Введенное Вами число попадает в промежуток (" + x1 + ":" + x2 + "]");
        }
        else {
            System.out.println("Введенное Вами число попадает в промежуток (" + x2 + " ∞)");
        }
    }

}
