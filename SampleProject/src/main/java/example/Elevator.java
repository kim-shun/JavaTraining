package example;

import java.util.ArrayList;
import java.util.Scanner;

public class Elevator {

	public static void main(String[] args) {
		System.out.println("値を入力してください");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		ArrayList<Integer> numList = new ArrayList<Integer>();
		for (int i = 0; i < times; i++) {
			int num = sc.nextInt();
			numList.add(num);
		}
		int count = numList.get(0)-1;
		for (int i = 0; i < numList.size()-1; i++) {
			int now = numList.get(i);
			int next = numList.get(i+1);
			int difference = 0;
			if (now > next) {
				difference = now - next;
			} else {
				difference = next - now;
			}
			count += difference;
		}
		System.out.println(count);

	}

}
