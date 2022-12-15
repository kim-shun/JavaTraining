package example;

import java.util.Scanner;

/**
 * 数値計算を行うクラス
 *
 */
public class Calculator {

	/**
	 * 計算のテスト
	 *
	 */
	public static void main(String[] args) {
		String text = getLineInput();
		String[] texts = splitSpace(text);
		for (int i = 0; i < texts.length; i++) {
			System.out.println(i + ":" + texts[i]);
		}
	}

	/**
	 * 文字列を入力させる
	 */
	public static String getStrInput() {
		System.out.println("文字列を入力してください");
		Scanner sc = new Scanner(System.in);
		return sc.next();
	}
	/**
	 * 数値を入力させる
	 */
	public static int getIntInput() {
		System.out.println("数値を入力してください");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	/**
	 * テキストを入力させる
	 */
	public static String getLineInput() {
		System.out.println("テキストを入力してください");
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		return line;
	}

	/**
	 * 文字列か数値かを判定する
	 */
	public static boolean isNumeric(String s) {
		try {
			Double.parseDouble(s);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	/**
	 * 文字列を数値に変換する
	 */
	public static int strToInt(String str) {
		int num = Integer.parseInt(str);
		return num;
	}

	/**
	 * テキストを単語に分割する(スペース区切り)
	 */
	public static String[] splitSpace(String text) {
		String[] strs = text.split(" ");
		return strs;
	}

	/**
	 * 絶対値を利用した足し算
	 * @param a 値1
	 * @param b 値2
	 */
	public static int absAdd(int a, int b) {

		if (a < 0) {
			a = a * -1;
		}
		if (b < 0) {
			b = b * -1;
		}

		return a + b;
	}

}
