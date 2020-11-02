package by.homework.HW_3;

import java.util.Scanner;

public class TaskThreeFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you STRING");
        int count = 1;
        String stroka = scanner.nextLine();
        String[] words = stroka.split("[ ]+");
        for (String word : words) {
            System.out.println(word);
        }

        for (int i = 0; i < words.length; i++) {
            if (words[i] == "***") continue;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = "***";
                }
            }
            System.out.println("Слово " + words[i] + " встречается в тексте " + count + " раз");
            count = 1;
        }


    }
}
