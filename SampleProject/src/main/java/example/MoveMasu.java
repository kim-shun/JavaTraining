package example;

import java.util.Scanner;

public class MoveMasu {

	public static void main(String[] args) {
		System.out.println("値を入力してください");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		int width = sc.nextInt();
		int y = sc.nextInt();
		int x = sc.nextInt();
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if (i == y && (j == (x-1) || j == (x+1) || j == x)) {
					System.out.print("*");
				} else if (j == x && (i == (y-1) || i == (y+1) || i == y)) {
					System.out.print("*");
				} else {
					System.out.print(".");
				}
				if (j == width-1) {
					System.out.println();
				}
			}
		}

	}

}
