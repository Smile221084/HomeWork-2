package by.homework.HW_1;

import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int first = scan.nextInt();
        System.out.println("Введите второе число: ");
        int second = scan.nextInt();
        if (second >= first * 0.9 && second <= first * 1.1) System.out.println("Число находится в пределах 10%");
        else System.out.println("Число нахоиться за пределами 10% от заданного");
    }
}