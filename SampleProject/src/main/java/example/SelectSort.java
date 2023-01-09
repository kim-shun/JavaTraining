package example;

import java.util.Scanner;

public class SelectSort {

    static void print(int a[], int n) {
        for (int i = 0; i < n; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }

    static void selection_sort(int a[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min_index]) {
                    min_index = j;
                }
            }

            int min = a[min_index];
            a[min_index] = a[i];
            a[i] = min;

            print(a, n);
        }
    }

    public static void main(String[] args) {
    	System.out.println("値を入力してください");
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        selection_sort(a, n);
    }
}
