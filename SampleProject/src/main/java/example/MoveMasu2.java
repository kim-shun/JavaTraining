package example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class MoveMasu2 {

	public static void main(String[] args) {
		System.out.println("値を入力してください");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		int width = sc.nextInt();
		int y = sc.nextInt();
		int x = sc.nextInt();
		ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				ArrayList<Integer> list = new ArrayList<Integer>();
				if (i == y && (j == (x-1) || j == (x+1) || j == x)) {
					list.add(j);
					list.add(i);
				} else if (j == x && (i == (y-1) || i == (y+1) || i == y)) {
					list.add(j);
					list.add(i);
				}
				if (!list.isEmpty()) {
					lists.add(list);
				}
			}
		}
		ArrayList<ArrayList<Integer>> lists2 = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < lists.size(); i++) {
			int x2 = lists.get(i).get(0);
			int y2 = lists.get(i).get(1);
			for (int j = 0; j < height; j++) {
				for (int k = 0; k < width; k++) {
					ArrayList<Integer> list = new ArrayList<Integer>();
					if (j == y2) {
						if (k == (x2-1) || k == (x2+1) || k == x2) {
							list.add(k);
							list.add(j);
						}
					} else if (k == x2) {
						if (j == (y2-1) || j == (y2+1) || j == y2) {
							list.add(k);
							list.add(j);
						}
					}
					if (!list.isEmpty()) {
						lists2.add(list);
					}
				}
			}
		}
		ArrayList<ArrayList<Integer>> lists3 = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < lists2.size(); i++) {
			int x3 = lists2.get(i).get(0);
			int y3 = lists2.get(i).get(1);
			for (int j = 0; j < height; j++) {
				for (int k = 0; k < width; k++) {
					ArrayList<Integer> list = new ArrayList<Integer>();
					if (j == y3) {
						if (k == (x3-1) || k == (x3+1) || k == x3) {
							list.add(k);
							list.add(j);
						}
					} else if (k == x3) {
						if (j == (y3-1) || j == (y3+1) || j == y3) {
							list.add(k);
							list.add(j);
						}
					}
					if (!list.isEmpty()) {
						lists3.add(list);
					}
				}
			}
		}
		lists.addAll(lists2);
		lists.addAll(lists3);
		List<ArrayList<Integer>> reLists = new ArrayList<ArrayList<Integer>>(new HashSet<ArrayList<Integer>>(lists));
		boolean ableToReach = false;
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				for (int k = 0; k < reLists.size(); k++) {
					int xx = reLists.get(k).get(0);
					int yy = reLists.get(k).get(1);
					if (i == yy && j == xx) {
						ableToReach = true;
						break;
					} else {
						ableToReach = false;
					}
				}	
				if (ableToReach == false) {
					System.out.print(".");
				} else {
					System.out.print("*");
				}
				if (j == width-1) {
					System.out.println();
				}
			}
		}

	}

}
