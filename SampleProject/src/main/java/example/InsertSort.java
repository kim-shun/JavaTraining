package example;

import java.util.Scanner;

public class InsertSort {

	public static void main(String[] args) {
		System.out.println("値を入力してください");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		int[] numList = new int[times];
		for (int i = 0; i < times; i++) {
			int num = sc.nextInt();
			numList[i] = num;
		}
		
		for (int i = 1; i < numList.length; i++) {
			int x = numList[i];
			int location = i-1;
			while (location >= 0 && numList[location] > x) {
				numList[location+1] = numList[location];
				location --;
			}
			numList[location+1] = x;
			for (int j = 0; j < numList.length; j++) {
				if (j == numList.length-1) {
					System.out.println(numList[j]);
				} else {
					System.out.print(numList[j] + " ");
				}
			}
		}
	}

}
