package by.homework.HW_3;

import java.util.Scanner;

public class task_3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your ages: ");
        int years = scanner.nextInt();

        String strOut = "Hello %s. You are: %d";
        String formatStr = String.format(strOut, name, years);
        System.out.println(formatStr);

    }
}
