package by.homework.HW_3;

import java.util.Random;

public class task_3_1 {
    public static void main(String[] args) {
        String str = new String();
        StringBuilder strBuilder = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            strBuilder = strBuilder.append(random.nextInt(1001) + " ");
        }
        System.out.print("StringBuilder: " + strBuilder);
        System.out.println();
        for (int i = 0; i < 100; i++) {
            str += random.nextInt(1001) + " ";
        }
        System.out.print("String: " + str);
    }
}
