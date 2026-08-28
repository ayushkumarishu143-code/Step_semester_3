package arrays.class_problems;

import java.util.*;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] a = new int[n], b = new int[n];

        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        k %= n;

        for (int i = 0; i < n; i++)
            b[(i + k) % n] = a[i];

        for (int x : b) System.out.print(x + " ");
    }
}
