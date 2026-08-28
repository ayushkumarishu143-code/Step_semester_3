package java_control_flow.class_problems;

import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int origNumber = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += (digit * digit * digit);
            number = number / 10;
        }

        if (sum == origNumber) {
            System.out.println(origNumber + " is an Armstrong number.");
        } else {
            System.out.println(origNumber + " is not an Armstrong number.");
        }
        sc.close();
    }
}
