package by.homework.HW_1;

import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int first = scan.nextInt();
        System.out.println("Введите второе число: ");
        int second = scan.nextInt();
        System.out.println("Введите третье число: ");
        int third = scan.nextInt();

        int max = first > (second > third ? second : third) ? first : ((second > third) ? second : third);
        int min = first < (second < third ? second : third) ? first : ((second < third) ? second : third);

        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Среднее арифметическое введенных чисел:" + (double) (first + second + third) / 3);
    }

}
