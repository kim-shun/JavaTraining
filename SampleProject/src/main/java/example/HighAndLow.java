package example;

import java.util.Scanner;

public class HighAndLow {

	public static void main(String[] args) {
		System.out.println("値を入力してください");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int times = sc.nextInt();
		for (int i = 0; i < times; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			if (A > a) {
				System.out.println("Low");
			} else if(A == a) {
				if (B < b) {
					System.out.println("Low");
				} else {
					System.out.println("High");
				}
			} else {
				System.out.println("High");
			}
		}
	}

}
