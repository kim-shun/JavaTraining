package example;

import java.util.ArrayList;
import java.util.Scanner;

public class LiveSchedule {

	public static void main(String[] args) {
		System.out.println("値を入力してください");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int datesA= sc.nextInt();
		ArrayList<Integer> liveDateA = new ArrayList<Integer>();
		for (int i = 0; i < datesA; i++) {
			int num = sc.nextInt();
			liveDateA.add(num);
		}
		int datesB= sc.nextInt();
		ArrayList<Integer> liveDateB = new ArrayList<Integer>();
		for (int i = 0; i < datesB; i++) {
			int num = sc.nextInt();
			liveDateB.add(num);
		}
//		System.out.println(liveDateA);
//		System.out.println(liveDateB);

		boolean checkAB = false;
		for (int i = 1; i <= 31; i++) {
			boolean checkA = false;
			boolean checkB = false;
			for (int j = 0; j < liveDateA.size(); j++) {
				if (i == liveDateA.get(j)) {
					checkA = true;
					break;
				} else {
					checkB = false;
				}
			}
			for (int k = 0; k < liveDateB.size(); k++) {
				if (i == liveDateB.get(k)) {
					checkB = true;
					break;
				} else {
					checkB = false;
				}
			}
//			System.out.println(i + ",A:"  + checkA + ",B:" + checkB  + ",AB:"+ checkAB);
			if (checkA == false && checkB == false) {
				System.out.println("x");
			} else if (checkA == true && checkB == true) {
				if (checkAB == false) {
					System.out.println("A");
					checkAB = true;
				} else {
					System.out.println("B");
					checkAB = false;
				}
			} else if (checkA == true) {
				System.out.println("A");
			} else if (checkB == true) {
				System.out.println("B");
			}

		}

	}

}
