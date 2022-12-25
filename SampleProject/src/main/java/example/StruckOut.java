package example;

import java.util.ArrayList;
import java.util.Scanner;

public class StruckOut {

	public static void main(String[] args) {
		System.out.println("値を入力してください");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		int width = sc.nextInt();
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < height; i++) {
			String p = sc.next();
			for (int j = 0; j < p.length(); j++) {
				list.add(p.substring(j,j+1));
			}
		}
		ArrayList<Integer> numList = new ArrayList<Integer>();
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				int p = sc.nextInt();
				numList.add(p);
			}
		}
		int sum = 0;
		for (int i = 0; i < numList.size(); i++) {
			if ("o".equals(list.get(i))) {
				sum += numList.get(i);	
			}
		}
		System.out.println(sum);



	}

}
