package arrays.class_problems;

import java.util.*;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        int min = a[0], profit = 0;
        for (int i = 1; i < n; i++) {
            min = Math.min(min, a[i]);
            profit = Math.max(profit, a[i] - min);
        }
        System.out.println(profit);
    }
}
