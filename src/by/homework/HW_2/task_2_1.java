package by.homework.HW_2;

import java.util.Scanner;

public class task_2_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int size = scan.nextInt();
        int value;
        int[][] array = new int[size][size];

        for (int i = 0; i <= (size - 1) / 2; i++) {
            value = 1;
            for (int j = 0; j <= (size - 1) / 2; j++) {
                if (i < j) {
                    value = i + 1;
                    array[i][j] = value;
                    array[i][size - j - 1] = value;
                    array[size - i - 1][j] = value;
                    array[size - i - 1][size - j - 1] = value;
                    continue;
                }
                array[i][j] = value;
                array[i][size - j - 1] = value;
                array[size - i - 1][j] = value;
                array[size - i - 1][size - j - 1] = value;
                value++;
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
