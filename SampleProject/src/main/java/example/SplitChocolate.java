package example;

import java.util.ArrayList;
import java.util.Scanner;

public class SplitChocolate {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int W = sc.nextInt();
		ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < H; i++) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int j = 0; j < W; j++) {
				int num = sc.nextInt();				
				list.add(num);
			}
			lists.add(list);
		}

		boolean ableToSplitAll = false;
		ArrayList<ArrayList<String>> ABlists = new ArrayList<ArrayList<String>>();
		for (int i = 0; i < lists.size(); i++) {
			int sum = lists.get(i).stream().mapToInt(Integer::intValue).sum();
			int half = sum / 2;
			int compareHalf = 0;
			if (sum % 2 != 0) {
				System.out.println("No");
				return;
			} else {
				ArrayList<String> list = new ArrayList<String>();
				boolean ableToSplit = false;
				StringBuilder sb = new StringBuilder();
				for (int j = 0; j < lists.get(i).size(); j++) {
					
					sb.append("A");
					compareHalf += lists.get(i).get(j);
					if (compareHalf == half) {
						ableToSplit = true;
						for (int k = j+1; k < lists.get(i).size(); k++) {
							sb.append("B");
						}
						list.add(sb.toString());
						break;
					}
				}
				if (ableToSplit == false) {
					System.out.println("No");
					return;
				} else {
					ableToSplitAll = true;
				}
				ABlists.add(list);
			}
		}
		if (ableToSplitAll == true) {
			System.out.println("Yes");
			for (int i = 0; i < ABlists.size(); i++) {
				System.out.println(ABlists.get(i).get(0));
			}
		}
	}

}
