package example;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 数値計算を行うクラス
 *
 */
public class Calculator {

	final static String COMMA = "comma";
	final static String SPACE = "space";
	final static String OTHER = "other";
	final static String STRING = "文字列";
	final static String INT = "数値";
	final static String TEXT = "テキスト";
	final static String ORDER_INPUT = "を入力してください";
	final static String NO_INPUT = "が入力されていません";
	final static String WRONG = "が間違っています";


	public static void main(String[] args) {
		int num1 = 0;
		String num2 = "";
		try {
			num1 = getIntInput();
		} catch (InputMismatchException e) {
			System.out.println(INT + NO_INPUT);
			return;
		}
		try {
			num2 = getStrInput();
		} catch (InputMismatchException e) {
			System.out.println(STRING + NO_INPUT);
		}

		testCalculate(num1, num2);
	}

	/**
	 * 計算のテスト
	 *
	 */
	public static String testCalculate(int num1, String num2) {
		String strNum1 = "";
		int intNum2 = 0;
		if (isNumeric(num2) == true) {
			intNum2 = strToInt(num2);
			int sum = absAdd(num1,intNum2);
			String strSum = intToStr(sum);
			return strSum;
		} else {
			strNum1 = intToStr(num1);
			String sum = strLinking(strNum1,num2);
			return sum;
		}

	}

	/**
	 * 文字列を入力させる
	 */
	public static String getStrInput() {
		System.out.println(STRING + ORDER_INPUT);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		return sc.next();
	}
	/**
	 * 数値を入力させる
	 */
	public static int getIntInput() {
		System.out.println(INT + ORDER_INPUT);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	/**
	 * テキストを入力させる
	 */
	public static String getLineInput() {
		System.out.println(TEXT + ORDER_INPUT);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
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
	 * 数値を文字列に変換する
	 */
	public static String intToStr(int num) {
		String str = String.valueOf(num);
		return str;
	}

	/**
	 * テキストが何で区切られているかを判断する(カンマ区切り or スペース区切り)
	 * @return スペース区切り : space
	 * @return カンマ区切り : comma
	 * @return それ以外 : other
	 */
	public static String splitCheck(String text) {
		if (text.contains(",")){
			return COMMA;
		} else if (text.contains(" ")){
			return SPACE;
		} else {
			return OTHER;
		}
	}

	/**
	 * テキストを単語に分割する(カンマ区切り)
	 */
	public static String[] splitComma(String text) {
		String[] strs = text.split(",");
		return strs;
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

	/**
	 * 文字列連結
	 * @param a 値1
	 * @param b 値2
	 */
	public static String strLinking(String a, String b) {
		return a + b;
	}
}
