package by.homework.HW_3;

import java.util.Random;

public class TaskThreeTwo {
    public static void main(String[] args) {

        String str = new String();
        String newStr = new String();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            str += random.nextInt(1001) + " ";
        }
        System.out.print("String: " + str);
        System.out.println();


        newStr = str.replaceAll("\\s\\d{2}\\s", " -1 ");
        System.out.print("newStr: " + newStr);
    }
}
