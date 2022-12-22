package example;

import java.util.Scanner;

public class InsertSortAnswer {

	static void print(int a[], int n) {
        for (int i = 0; i < n; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }

    static void insertion_sort(int a[], int n) {
        for (int i = 1; i < n; i++) {
            int x = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > x) {
                a[j + 1] = a[j];
                j--;
            }

            a[j + 1] = x;

            print(a, n);
        }
    }

    public static void main(String[] args) {
    	@SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        insertion_sort(a, n);
    }

}
