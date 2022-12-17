package example;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MoveMasuAnswer {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int W = sc.nextInt();
		int y = sc.nextInt();
		int x = sc.nextInt();

		String[][] map = new String[H][W];
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				map[i][j] = ".";
			}
		}
		map[y][x] = "*";

		ArrayDeque<Point> q = new ArrayDeque<Point>();
		q.add(new Point(0, y, x));
		while (!q.isEmpty()) {
			Point p = q.poll();
			if (p.level >= 3) {
				continue;
			}
			for (int i = -1; i <= 1; i += 2) {
				if (
						0 <= p.y + i &&
						p.y + i <= H - 1 &&
						map[p.y + i][p.x].equals(".")
						) {
					q.add(new Point(p.level + 1, p.y + i, p.x));
					map[p.y + i][p.x] = "*";
				}
				if (
						0 <= p.x + i &&
						p.x + i <= W - 1 &&
						map[p.y][p.x + i].equals(".")
						) {
					q.add(new Point(p.level + 1, p.y, p.x + i));
					map[p.y][p.x + i] = "*";
				}
			}
		}

		for (int i = 0; i < H; i++) {
			System.out.println(String.join("", map[i]));
		}
	}
	static class Point {

		int level, y, x;

		Point(int level, int y, int x) {
			this.level = level;
			this.y = y;
			this.x = x;
		}
	}
}