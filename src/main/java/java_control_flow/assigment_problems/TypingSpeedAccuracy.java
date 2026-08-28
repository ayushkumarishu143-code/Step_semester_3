package java_control_flow.assigment_problems;

import java.util.Scanner;

public class TypingSpeedAccuracy {
    public static void checkTypingAccuracy(String original, String typed) {
        int matched = 0;
        int total = original.length();
        int firstMismatchPos = -1;

        for (int i = 0; i < total; i++) {
            if (original.charAt(i) == typed.charAt(i)) {
                matched++;
            } else if (firstMismatchPos == -1) {
                firstMismatchPos = i + 1;
            }
        }

        double accuracy = ((double) matched / total) * 100;
        System.out.print("Matched: " + matched + "/" + total + " | Accuracy: " + String.format("%.2f", accuracy) + "% | ");

        if (firstMismatchPos == -1) {
            System.out.println("No Mismatches");
        } else {
            System.out.println("First Mismatch at position " + firstMismatchPos + " ('" + original.charAt(firstMismatchPos - 1) + "' vs '" + typed.charAt(firstMismatchPos - 1) + "')");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String original = sc.nextLine();
        String typed = sc.nextLine();
        checkTypingAccuracy(original, typed);
        sc.close();
    }
}
