package example;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MoveMasuReview {

	public static void main(String[] args) {
		System.out.println("値を入力してください");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		int width = sc.nextInt();
		int y = sc.nextInt();
		int x = sc.nextInt();
		String[][] map = new String[height][width];
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				map[i][j] = ".";
			}
		}
		map[y][x] = "*";
		ArrayDeque<Location> queue = new ArrayDeque<Location>();
		queue.add(new Location(0,y,x));
		while (!queue.isEmpty()) {
			Location loc = queue.poll();
			int yy = loc.y;
			int xx = loc.x;
			if (loc.level >= 3) {
				continue;
			}
			for (int i = -1; i <= 1; i+=2) {
				int y1 = yy + i;
				int x1 = xx + i;
				if (y1 >= 0 && y1 < height) {
					if (map[y1][xx].equals(".")) {
						map[y1][xx] = "*";
						queue.add(new Location(loc.level+1,y1,xx));
					}
				}
				if (x1 >= 0 && xx+i < width) {
					if (map[yy][x1].equals(".")) {
						map[yy][x1] = "*";
						queue.add(new Location(loc.level+1,yy,x1));
					}
				}
			}
		}
		for (int i = 0; i < height; i++) {
			System.out.println(String.join("", map[i]));
		}


	}

	static class Location {
		int level,y,x;
		Location(int level, int y, int x){
			this.level = level;
			this.y = y;
			this.x = x;
		}
	}
}


